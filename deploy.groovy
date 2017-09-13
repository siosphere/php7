node {
    stage "Checkout" {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/siosphere/php7.git']]])
    }
    stage "Release" {
        withCredentials([usernamePassword(credentialsId: 'e4782881-b217-4dee-a5a6-625f190eac44', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
            echo "${USERNAME}"
            echo "${PASSWORD}"
        }
    }
}

node {
    stage('Checkout'){
       git branch: 'master', url: 'https://github.com/siosphere/virge-router.git'
    }
    stage('Release') {
        withCredentials([usernamePassword(credentialsId: 'e4782881-b217-4dee-a5a6-625f190eac44', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
            echo "${USERNAME}"
            echo "${PASSWORD}"
        }
    }
}

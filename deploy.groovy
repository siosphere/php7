node {
    stage('Allow?'){
         input message: 'Can this build go out?', ok: 'YES', submitter: 'siosphere'
    }
    stage('Checkout'){
       git branch: 'master', url: 'https://github.com/siosphere/virge-router.git'
       echo "face"
    }
    stage('Release') {
        withCredentials([usernamePassword(credentialsId: 'e4782881-b217-4dee-a5a6-625f190eac44', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
            echo "${USERNAME}"
            echo "${PASSWORD}"
        }
    }
}

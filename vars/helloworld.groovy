def call() {
    sh "systemctl status jenkins"
    cat "/proc/cpuinfo"
}

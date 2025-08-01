class Student(name: String) {
    var studentName : String = name
    get() = field

        private set(value) {
            studentName = value
        }

    fun displayStudentInfo() {
        println("Student Name: $studentName")
    }
}
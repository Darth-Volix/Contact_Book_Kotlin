class BusinessContact(var name: String, var phoneNumber: String, var email: String, var jobTitle: String, var companyName: String) {

    // Function to update contact details
    fun update(name: String, phoneNumber: String, email: String, jobTitle: String, companyName: String) {
        this.name = name
        this.phoneNumber = phoneNumber
        this.email = email
        this.jobTitle = jobTitle
        this.companyName = companyName
    }

    // Function to display contact details
    fun display() {
        println("Business Contact - Name: $name, Phone: $phoneNumber, Email: $email, Job Title: $jobTitle, Company: $companyName")
    }
}
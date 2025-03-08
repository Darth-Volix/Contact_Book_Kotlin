class ContactBook {
    // Lists to store personal and business contacts
    private val personalContacts = mutableListOf<PersonalContact>()
    private val businessContacts = mutableListOf<BusinessContact>()

    // Adds a new personal contact to the list
    fun addPersonalContact(contact: PersonalContact) {
        personalContacts.add(contact)
        println("Personal contact added successfully.")
    }

    // Adds a new business contact to the list
    fun addBusinessContact(contact: BusinessContact) {
        businessContacts.add(contact)
        println("Business contact added successfully.")
    }

    // Edits an existing personal contact based on the name
    fun editPersonalContact(name: String) {
        val contact = personalContacts.find { it.name == name }
        if (contact != null) {

            // Prompt user for updated details
            print("Enter new name: ")
            val newName = readLine() ?: ""
            print("Enter new phone number: ")
            val newPhone = readLine() ?: ""
            print("Enter new email: ")
            val newEmail = readLine() ?: ""
            print("Enter new relationship: ")
            val newRelationship = readLine() ?: ""

            // Update contact details
            contact.update(newName, newPhone, newEmail, newRelationship)
            println("Personal contact updated.")
        } else {
            println("Personal contact not found.")
        }
    }

    // Edits an existing business contact based on the name
    fun editBusinessContact(name: String) {
        val contact = businessContacts.find { it.name == name }
        if (contact != null) {

            // Prompt user for updated details
            print("Enter new name: ")
            val newName = readLine() ?: ""
            print("Enter new phone number: ")
            val newPhone = readLine() ?: ""
            print("Enter new email: ")
            val newEmail = readLine() ?: ""
            print("Enter new job title: ")
            val newJobTitle = readLine() ?: ""
            print("Enter new company name: ")
            val newCompany = readLine() ?: ""

            // Update contact details
            contact.update(newName, newPhone, newEmail, newJobTitle, newCompany)
            println("Business contact updated.")
        } else {
            println("Business contact not found.")
        }
    }

    // Deletes a personal contact based on the name
    fun deletePersonalContact(name: String) {
        if (personalContacts.removeIf { it.name == name }) {
            println("Personal contact deleted.")
        } else {
            println("Personal contact not found.")
        }
    }

    // Deletes a business contact based on the name
    fun deleteBusinessContact(name: String) {
        if (businessContacts.removeIf { it.name == name }) {
            println("Business contact deleted.")
        } else {
            println("Business contact not found.")
        }
    }

    // Searches for personal contacts by name
    fun searchPersonalContacts(name: String) {
        val results = personalContacts.filter { it.name.contains(name, ignoreCase = true) }
        if (results.isNotEmpty()) {
            println("Personal Contacts Found:")
            results.forEach { it.display() }
        } else {
            println("No personal contacts found.")
        }
    }

    // Searches for business contacts by name
    fun searchBusinessContacts(name: String) {
        val results = businessContacts.filter { it.name.contains(name, ignoreCase = true) }
        if (results.isNotEmpty()) {
            println("Business Contacts Found:")
            results.forEach { it.display() }
        } else {
            println("No business contacts found.")
        }
    }

    // Displays all personal and business contacts
    fun displayAllContacts() {
        println("Personal Contacts:")
        if (personalContacts.isEmpty()) {
            println("No personal contacts to display.")
        } else {
            personalContacts.forEach { it.display() }
        }

        println("\nBusiness Contacts:")
        if (businessContacts.isEmpty()) {
            println("No business contacts to display.")
        } else {
            businessContacts.forEach { it.display() }
        }
    }
}
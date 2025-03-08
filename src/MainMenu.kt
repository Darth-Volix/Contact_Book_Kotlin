class MainMenu {
    // Create a new ContactBook instance to store contacts
    private val contactBook = ContactBook()

    // Displays the main menu and handles user input
    fun menu() {
        skipLines()
        while (true) {
            println("Contact Book Menu:")
            println("1. Add Personal Contact")
            println("2. Add Business Contact")
            println("3. Edit Personal Contact")
            println("4. Edit Business Contact")
            println("5. Delete Personal Contact")
            println("6. Delete Business Contact")
            println("7. Search Personal Contacts")
            println("8. Search Business Contacts")
            println("9. Display All Contacts")
            println("10. Exit")
            print("Choose an option: ")

            // Handle the menu options based on user input
            when (readLine()?.toIntOrNull()) {
                1 -> { skipLines(); addPersonalContact(); skipLines() }
                2 -> { skipLines(); addBusinessContact(); skipLines() }
                3 -> { skipLines(); editPersonalContact(); skipLines() }
                4 -> { skipLines(); editBusinessContact(); skipLines() }
                5 -> { skipLines(); deletePersonalContact(); skipLines() }
                6 -> { skipLines(); deleteBusinessContact(); skipLines() }
                7 -> { skipLines(); searchPersonalContacts(); skipLines() }
                8 -> { skipLines(); searchBusinessContacts(); skipLines() }
                9 -> { skipLines(); contactBook.displayAllContacts(); skipLines() }
                10 -> {
                    skipLines()
                    println("Exiting program. Goodbye!")
                    return
                }
                // Handle invalid options
                else -> { skipLines(); println("Invalid option. Please try again.") }
            }
        }
    }

    // Function to skip 2 lines to help with formatting
    private fun skipLines() {
        repeat(2) { println() }
    }

    // Adds a new personal contact with name, phone, email, and relationship
    private fun addPersonalContact() {
        print("Enter name: ")
        val name = readLine() ?: ""
        print("Enter phone number: ")
        val phone = readLine() ?: ""
        print("Enter email: ")
        val email = readLine() ?: ""
        print("Enter relationship: ")
        val relationship = readLine() ?: ""

        // Check if the personal contact already exists by name or email
        val exists = contactBook.getPersonalContacts().any {
            it.name == name || it.email == email
        }

        if (exists) {
            println("Contact already exists. Cannot add duplicate contact.")
        } else {
            contactBook.addPersonalContact(PersonalContact(name, phone, email, relationship))
        }
    }

    // Adds a new business contact with name, phone, email, job title, and company
    private fun addBusinessContact() {
        print("Enter name: ")
        val name = readLine() ?: ""
        print("Enter phone number: ")
        val phone = readLine() ?: ""
        print("Enter email: ")
        val email = readLine() ?: ""
        print("Enter job title: ")
        val jobTitle = readLine() ?: ""
        print("Enter company name: ")
        val company = readLine() ?: ""

        // Check if the business contact already exists by name or email
        val exists = contactBook.getBusinessContacts().any {
            it.name == name || it.email == email
        }

        if (exists) {
            println("Contact already exists. Cannot add duplicate contact.")
        } else {
            contactBook.addBusinessContact(BusinessContact(name, phone, email, jobTitle, company))
        }
    }

    // Prompts user to edit an existing personal contact
    private fun editPersonalContact() {
        print("Enter the name of the personal contact to edit: ")
        val name = readLine() ?: ""
        contactBook.editPersonalContact(name)
    }

    // Prompts user to edit an existing business contact
    private fun editBusinessContact() {
        print("Enter the name of the business contact to edit: ")
        val name = readLine() ?: ""
        contactBook.editBusinessContact(name)
    }

    // Deletes a personal contact based on the provided name
    private fun deletePersonalContact() {
        print("Enter the name of the personal contact to delete: ")
        val name = readLine() ?: ""
        contactBook.deletePersonalContact(name)
    }

    // Deletes a business contact based on the provided name
    private fun deleteBusinessContact() {
        print("Enter the name of the business contact to delete: ")
        val name = readLine() ?: ""
        contactBook.deleteBusinessContact(name)
    }

    // Searches for a personal contact based on the provided name
    private fun searchPersonalContacts() {
        print("Enter the name to search for in personal contacts: ")
        val name = readLine() ?: ""
        contactBook.searchPersonalContacts(name)
    }

    // Searches for a business contact based on the provided name
    private fun searchBusinessContacts() {
        print("Enter the name to search for in business contacts: ")
        val name = readLine() ?: ""
        contactBook.searchBusinessContacts(name)
    }
}
import unittest
import book_suggestion_system as bss


class TestBookSuggestionSystem(unittest.TestCase):

    def setUp(self):
        bss.books.clear()
        bss.books.extend(["The Hobbit", "The Mystery", "Animal Farm"])
        
    def test_add_new_book(self):
        bss.add_book("Brave Kingdom")
        self.assertIn("Brave Kingdom", bss.books)

    def test_add_duplicate_book(self):
        bss.add_book("The Hobbit")
        self.assertEqual(bss.books.count("The Hobbit"), 1)


    def test_remove_existing_book(self):
        bss.remove_book("The Mystery")
        self.assertNotIn("The Mystery", bss.books)

    def test_remove_book_not_in_list(self):
        before = len(bss.books)
        bss.remove_book("Unknown Book")
        self.assertEqual(len(bss.books), before)


    def test_update_existing_book(self):
        bss.update_book("Animal Farm", "Animal Kingdom")
        self.assertIn("Animal Kingdom", bss.books)
        self.assertNotIn("Animal Farm", bss.books)

    def test_update_book_not_in_list(self):
        before = bss.books.copy()
        bss.update_book("Ghost Book", "New Title")
        self.assertEqual(bss.books, before)


    def test_show_all_books_count(self):
        self.assertEqual(len(bss.books), 3)

    def test_show_all_books_content(self):
        self.assertIn("The Hobbit", bss.books)
        self.assertIn("The Mystery", bss.books)
        self.assertIn("Animal Farm", bss.books)




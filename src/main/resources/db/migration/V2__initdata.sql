INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Suzanne', 'Collins');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'The Hunger Games',
        'Adventure',
        'In the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts',
        4);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Joanne', 'Rowling');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Harry Potter and the Order of the Phoenix',
        'Fantasy',
        'Harry has a lot on his mind for this, his fifth year at Hogwarts: a Defense Against the Dark Arts teacher with a personality like poisoned honey',
        4.49);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), ' Harper', 'Lee');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Go Set a Watchman',
        'Historical',
        'From Harper Lee comes a landmark new novel set two decades after her beloved Pulitzer Prize-winning masterpiece, To Kill a Mockingbird. Maycomb, Alabama',
        3.31);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Jane', 'Austen');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Pride and Prejudice',
        'Romance',
        'Since its immediate success in 1813, Pride and Prejudice has remained one of the most popular novels in the English language',
        4.25);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Stephenie', 'Meyer');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Twilight',
        'Fantasy',
        'In the first book of the Twilight Saga, internationally bestselling author Stephenie Meyer introduces Bella Swan and Edward Cul',
        3.84);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), ' George', 'Orwell');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Animal Farm',
        'Classics',
        'George Orwell’s timeless and timely allegorical novel—a scathing satire on a downtrodden society’s blind march towards totalitarianism',
        3.92);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Markus', 'Zusak');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'The Book Thief',
        'Historical',
        'By her brother’s graveside, Liesel’s life is changed when she picks up a single object, partially hidden in the snow',
        4.37);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Clive', 'Lewis');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'The Chronicles of Narnia',
        'Fantasy',
        'The book that has it all is The Lion, the Witch and the Wardrobe, written in 1949 by Clive Staples Lewis',
        4.26);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'John Ronald Reuel', 'Tolkien');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'The Hobbit and The Lord of the Rings',
        'Fantasy',
        'In The Hobbit, Bilbo Baggins is whisked away from his comfortable, unambitious life in Hobbiton by the wizard Gandalf and a company of dwarves',
        4.59);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Margaret', 'Mitchell');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Gone with the Wind',
        'Classics',
        'Margaret Mitchell’s monumental epic of the South won a Pulitzer Prize, gave rise to the most popular motion picture of our time, and inspired a sequel that became the fastest selling novel of the century',
        4.29);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'John', 'Green');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'The Fault in Our Stars',
        'Young Adult',
        'Despite the tumor-shrinking medical miracle that has bought her a few years, Hazel has never been anything but terminal, her final chapter inscribed upon diagnosis',
        4.23);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Shel', 'Silverstein');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'The Giving Tree',
        'Childrens',
        'Every day the boy would come to the tree to eat her apples, swing from her branches, or slide down her trunk...and the tree was happy',
        4.37);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Emily', 'Brontë');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Wuthering Heights',
        'Classics',
        'This best-selling Norton Critical Edition is based on the 1847 first edition of the novel',
        3.84);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Dan', 'Brown');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'The Da Vinci Code',
        'Mystery',
        'While in Paris, Harvard symbologist Robert Langdon is awakened by a phone call in the dead of the night',
        3.83);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Arthur', 'Golden');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Memoirs of a Geisha',
        'Fiction',
        'In Memoirs of a Geisha, we enter a world where appearances are paramount; where a girl’s virginity is auctioned to the highest bidder',
        4.10);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Lewis', 'Carroll');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Alice’s Adventures in Wonderland & Through the Looking-Glass',
        'Fantasy',
        'When Alice sees a white rabbit take a watch out of its waistcoat pocket she decides to follow it, and a sequence of most unusual events is set in motion',
        4.07);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Oscar', 'Wilde');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'The Picture of Dorian Gray',
        'Classics',
        'Written in his distinctively dazzling manner, Oscar Wilde’s story of a fashionable young man who sells his soul for eternal youth and beauty is the author’s most popular work',
        4.07);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Charlotte', 'Brontë');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Jane Eyre',
        'Classics',
        'Orphaned as a child, Jane has felt an outcast her whole young life. Her courage is tested once again when she arrives at Thornfield Hall, where she has been hired by the brooding, proud Edward Rochester to care for his ward Adèle',
        4.11);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'Veronica', 'Roth');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Divergent',
        'Young Adult',
        'In Beatrice Prior’s dystopian Chicago world, society is divided into five factions, each dedicated to the cultivation of a particular virtue',
        4.21);
INSERT INTO AUTHOR (id, first_name, last_name)
VALUES (nextval('author_seq'), 'William', 'Shakespeare');
INSERT INTO BOOK (author_id, id, title, genre, description, rate)
VALUES (identity(),
        nextval('book_seq'),
        'Romeo and Juliet',
        'Classics',
        'In this death-filled setting, the movement from love at first sight to the lovers’ final union in death seems almost inevitable',
        3.84);

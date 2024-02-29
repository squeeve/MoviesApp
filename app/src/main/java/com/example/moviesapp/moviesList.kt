package com.example.moviesapp

// FYI: kotlin files can access non private variables, functions, classes, etc. in other files
// in the same package without requiring any additional steps, but will need import statements
// to access files in different packages.
//
// In this case, the listing is used in CatalogAdapter, and also in RandMovie.

val listing = listOf(
    Movie(
        "American Fiction",
        "1h 57m",
        "2023",
        "Jeffrey Wright, Tracee Ellis Ross, John Ortiz, Erika Alexander, Leslie Uggams",
        "A novelist who's fed up with the establishment profiting from Black entertainment uses a pen name to write a book that propels him into the heart of the hypocrisy and madness he claims to disdain.",
        "https://www.imdb.com/title/tt23561236/",
        "https://external-content.duckduckgo.com/iu/?u=https://m.media-amazon.com/images/M/MV5BZDlkZmRlYTctNGJmNy00MjVkLThjZDQtMWY5Zjg2NjlhZDZkXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_.jpg&f=1&h=400",
        "Cord Jefferson",
        7.6
    ),
    Movie(
        "Anatomy of a Fall",
        "2h 30m",
        "2023",
        "Sandra Huller, Swann Arlaud, Milo Machado Graner, Antoine Reinartz, Samuel Theis, Jehnny Beth",
        "For the past year, Sandra, her husband Samuel, and their eleven-year-old son Daniel have lived a secluded life in a remote town in the French Alps. When Samuel is found dead in the snow below their chalet, the police question whether he was murdered or committed suicide. Samuel's suspicious death is presumed murder, and Sandra becomes the main suspect. What follows is not just an investigation into the circumstances of Samuel's death but an unsettling psychological journey into the depths of Sandra and Samuel's conflicted relationship.",
        "https://www.imdb.com/title/tt17009710/",
        "https://external-content.duckduckgo.com/iu/?u=https://m.media-amazon.com/images/M/MV5BMDBiYmRkNjUtYzc4My00NGFiLWE2NWUtMGU1ZDA1NTQ3ZjQwXkEyXkFqcGdeQXVyMTM1NjM2ODg1._V1_.jpg&f=1&h=400",
        "Justine Triet",
        7.8
    ),
    Movie(
        "Past Lives",
        "1h 45m",
        "2023",
        "Greta Lee, Teo Yoo, John Magaro",
        "Nora and Hae Sung, two deeply connected childhood friends, are wrest apart after Nora's family emigrates from South Korea. Two decades later, they are reunited in New York for one fateful week as they confront notions of destiny, love, and the choices that make a life, in this heartrending modern romance.",
        "https://www.imdb.com/title/tt13238346/",
        "https://external-content.duckduckgo.com/iu/?u=https://m.media-amazon.com/images/M/MV5BOTkzYmMxNTItZDAxNC00NGM0LWIyODMtMWYzMzRkMjIyMTE1XkEyXkFqcGdeQXVyMTAyMjQ3NzQ1._V1_.jpg&f=1&h=400",
        "Celine Song",
        7.9
    ),
    Movie(
        "Shawshank Redemption",
        "2h 22m",
        "1994",
        "Tim Robbins, Morgan Freeman, Bob Gunton",
        "Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion.",
        "https://www.imdb.com/title/tt0111161/",
        "https://external-content.duckduckgo.com/iu/?u=https://m.media-amazon.com/images/M/MV5BNDE3ODcxYzMtY2YzZC00NmNlLWJiNDMtZDViZWM2MzIxZDYwXkEyXkFqcGdeQXVyNjAwNDUxODI@._V1_.jpg&f=1&h=400",
        "Frank Darabont",
        9.3
    ),
    Movie(
        "12 Angry Men",
        "1h 36m",
        "1957",
        "Henry Fonda, Lee J. Cobb, Martin Balsam",
        "The jury in a New York City murder trial is frustrated by a single member whose skeptical caution forces them to more carefully consider the evidence before jumping to a hasty verdict.",
        "https://www.imdb.com/title/tt0050083/",
        "https://external-content.duckduckgo.com/iu/?u=https://www.themoviedb.org/t/p/original/ow3wq89wM8qd5X7hWKxiRfsFf9C.jpg&f=1&h=400",
        "Sidney Lumet",
        9.0
    ),
    Movie(
        "Léon: The Professional",
        "1h 50m",
        "1994",
        "Jean Reno, Gary Oldman, Natalie Portman",
        "12-year-old Mathilda is reluctantly taken in by Léon, a professional assassin, after her family is murdered. An unusual relationship forms as she becomes his protégée and learns the assassin's trade.",
        "https://www.imdb.com/title/tt0110413/",
        "https://external-content.duckduckgo.com/iu/?u=https://m.media-amazon.com/images/M/MV5BOTgyMWQ0ZWUtN2Q2MS00NmY0LWI3OWMtNjFkMzZlNDZjNTk0XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg&f=1&h=400",
        "Luc Besson",
        8.5
    ),
    Movie(
        "Memento",
        "1h 53m",
        "2000",
        "Guy Pearce, Carrie-Anne Moss, Joe Pantollano",
        "Leonard (Guy Pearce) is tracking down the man who raped and murdered his wife. The difficulty, however, of locating his wife's killer is compounded by the fact that he suffers from a rare, untreatable form of memory loss.",
        "https://www.imdb.com/title/tt0209144/",
        "https://external-content.duckduckgo.com/iu/?u=https://m.media-amazon.com/images/M/MV5BZTcyNjk1MjgtOWI3Mi00YzQwLWI5MTktMzY4ZmI2NDAyNzYzXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg&f=1&h=400",
        "Christopher Nolan",
        8.4
    ),
    Movie(
        "Rear Window",
        "1h 52m",
        "1954",
        "James Stewart, Grace Kelly, Thelma Ritter",
        "A photographer in a wheelchair spies on his neighbors from his Greenwich Village courtyard apartment window, and becomes convinced one of them has committed murder.",
        "https://www.imdb.com/title/tt0047396/",
        "https://external-content.duckduckgo.com/iu/?u=https://upload.wikimedia.org/wikipedia/commons/3/38/Rear_Window_film_poster.jpg&f=1&h=400",
        "Alfred Hitchcock",
        8.5
    ),
    Movie(
        "In the Mood for Love",
        "1h 38m",
        "2000",
        "Tony Leung Chiu-wai, Maggie Cheung",
        "Two neighbors form a strong bond after both suspect extramarital activities of their spouses. However, they agree to keep their bond platonic so as not to commit similar wrongs.",
        "https://www.imdb.com/title/tt0118694/",
        "https://external-content.duckduckgo.com/iu/?u=https://image.tmdb.org/t/p/original/mjkr1IamzDiL5mLIbnuhiYOXLqg.jpg&f=1&h=400",
        "Kar-Wai Wong",
        8.1
    ),
    Movie(
        "2001: A Space Odyssey",
        "2h 29m",
        "1968",
        "Keir Dullea, Gary Lockwood, William Sylvester",
        "After uncovering a mysterious artifact buried beneath the Lunar surface, a spacecraft is sent to Jupiter to find its origins: a spacecraft manned by two men and the supercomputer HAL 9000.",
        "https://www.imdb.com/title/tt0062622/",
        "https://external-content.duckduckgo.com/iu/?u=https://image.tmdb.org/t/p/original/zmmYdPa8Lxx999Af9vnVP4XQ1V6.jpg&f=1&h=400",
        "Stanley Kubrick",
        8.3
    ),
)
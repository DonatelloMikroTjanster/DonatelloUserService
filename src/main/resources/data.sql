
-- Insert Users
INSERT INTO user (id, username, email, created_at)
VALUES
    (1, 'kalle_anka', 'kalle@example.com', '2023-01-01 10:00:00'),
    (2, 'lisa_svensson', 'lisa@example.com', '2023-01-02 11:00:00'),
    (3, 'erik_eriksson', 'erik@example.com', '2023-01-03 12:00:00'),
    (4, 'anna_andersson', 'anna@example.com', '2023-01-04 13:00:00');

-- Insert Ratings (user feedback on media)
INSERT IGNORE INTO ratings (id, user_id, media_id, rating)
VALUES
    (1, 1, 1, 'UP'),  -- Kalle liked Tech Talk Episode 1
    (2, 2, 2, 'DOWN'),  -- Lisa disliked Planet Earth II Episode 1
    (3, 3, 3, 'UP'),  -- Erik liked Come Together
    (4, 4, 4, 'DOWN'),  -- Anna disliked Billie Jean
    (5, 1, 5, 'UP'),  -- Kalle liked So What
    (6, 2, 6, 'UP'),  -- Lisa liked Beethoven Symphony No. 9
    (7, 3, 10, 'UP'), -- Erik liked Rock Legends Vol 2
    (8, 4, 12, 'UP'); -- Anna liked Classical Masterpieces
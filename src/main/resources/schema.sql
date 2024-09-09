CREATE TABLE users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE media (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    mediaCategory VARCHAR(255)
);

CREATE TABLE ratings (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    media_id BIGINT NOT NULL,
    rating VARCHAR(10) CHECK (rating IN ('UP', 'DOWN')),
    CONSTRAINT fk_ratings_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_ratings_media FOREIGN KEY (media_id) REFERENCES media(id)
);

CREATE TABLE playback_history (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    media_id BIGINT NOT NULL,
    timestamp DATETIME NOT NULL,
    CONSTRAINT fk_playback_history_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_playback_history_media FOREIGN KEY (media_id) REFERENCES media(id)
);


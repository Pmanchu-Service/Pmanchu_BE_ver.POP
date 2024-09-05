# Pmanchu_BE

```mermaid
erDiagram
    
    User {
        Long id PK
        String email
        Long githubId UK
        String githubUsername UK
        String role
    }

    RefreshToken {
        String id PK
        String token UK
        Long githubId UK 
        Long ttl
    }

    ProjectLike {
        Long id PK
        Long user_id FK
        Long project_id FK
    }

    ProjectBookmark {
        Long id PK
        Long user_id FK
        Long project_id FK
    }

    Project {
        Long id PK
        String title
        String description
        String status
    }

    ProjectMember {
        Long id PK
        Long project_id FK
        Long user_id FK
    }

    Notification {
        Long id PK
        String type
        String title
        String message
    }

    User ||--o{ ProjectLike : "likes"
    User ||--o{ ProjectBookmark : "bookmarks"
    User ||--o{ ProjectMember : "participates"
    Project ||--o{ ProjectLike : "liked by"
    Project ||--o{ ProjectBookmark : "bookmarked by"
    Project ||--o{ ProjectMember : "has members"
    Project ||--o{ Notification : "triggers"
```
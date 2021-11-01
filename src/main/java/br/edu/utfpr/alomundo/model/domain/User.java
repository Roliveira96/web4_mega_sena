package br.edu.utfpr.alomundo.model.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data(staticConstructor = "of")
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;

}
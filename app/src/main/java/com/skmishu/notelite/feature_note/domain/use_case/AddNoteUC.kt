package com.skmishu.notelite.feature_note.domain.use_case

import com.skmishu.notelite.feature_note.domain.model.InvalidNoteException
import com.skmishu.notelite.feature_note.domain.model.Note
import com.skmishu.notelite.feature_note.domain.repository.NoteRepository

class AddNoteUC(private val repository: NoteRepository) {

    // we have to validate the insertion of a note
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The 'Title' cannot be empty!")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The 'Content' cannot be empty!")
        }
        repository.insertNote(note)
    }
}
package com.skmishu.notelite.feature_note.domain.use_case

import com.skmishu.notelite.feature_note.domain.model.Note
import com.skmishu.notelite.feature_note.domain.repository.NoteRepository

class DeleteNoteUC(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
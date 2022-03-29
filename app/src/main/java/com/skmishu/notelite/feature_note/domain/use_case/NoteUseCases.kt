package com.skmishu.notelite.feature_note.domain.use_case

data class NoteUseCases(
    val getNotesUC: GetNotesUC,
    val getNoteUC: GetNoteUC,
    val deleteNoteUC: DeleteNoteUC,
    val addNoteUC: AddNoteUC
)
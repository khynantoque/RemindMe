package com.khynsoft.remindme.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.TextViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.khynsoft.remindme.R

class NotesAdapter: RecyclerView.Adapter<NotesAdapter.NoteHolder>() {
    inner class NoteHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitle: TextViewCompat = itemView.findViewById(R.id.note_item_title)
        val txtDesc: TextViewCompat = itemView.findViewById(R.id.note_item_desc)
        val txtDueReminder: TextViewCompat = itemView.findViewById(R.id.note_item_due_reminder)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
        val adapterLayoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_item, parent, false)

        return NoteHolder(adapterLayoutInflater)
    }

    override fun onBindViewHolder(holder: NoteHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
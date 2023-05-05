package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "ผศ.ดร.พิศาล แก้วประภา", "0256430019", false, false, 1, false),
            NoteDbModel(2, "รศ.ดร.ธีร เจียศิริพงษ์กุล", " 025643001", false, false, 2, false),
            NoteDbModel(3, "รศ.เกศินี วิฑูรชาติ ", "025644440", false, false, 3, false),
            NoteDbModel(4, "โรงพยาบาลธรรมศาสตร์เฉลิมพระเกียรติ", "029269310", false, false, 4, false),
            NoteDbModel(5, "นางรัชนี สุขสว่าง", "0899256870", false, false, 5, false),
            NoteDbModel(6, "สำนักงานเลขานุการฝ่ายศูนย์คอมพืวเตอร์", "0922548830", false, false, 6, false),
            NoteDbModel(7, "สำนักงานเลขานุการฝ่ายการศึกษา", "0845124080", false, false, 7, false),
            NoteDbModel(8, "สำนักงานเลขานุการฝ่ายศูนย์พัทยา", "0927104388", false, false, 8, false),
            NoteDbModel(9, "สำนักงานเลขานุการฝ่ายงานพัสดุ", "0923800655", false, false, 9, false),
            NoteDbModel(10, "สำนักงานเลขานุการฝ่ายงานบริหาร", "0813997083", false, false, 10, false),
            NoteDbModel(11, "คุณสมศักดิ์ เกษมกรกิจ", "089-117-2504", true, false, 11, false),
            NoteDbModel(12, "คุณปัญชลี โชติคุต", "089-818-7590", true, false, 12, false)
        )
    }
}

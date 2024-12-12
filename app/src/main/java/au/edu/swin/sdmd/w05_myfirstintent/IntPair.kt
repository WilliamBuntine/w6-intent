package au.edu.swin.sdmd.w05_myfirstintent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class IntPair(val firstInt: Int, val secondInt: Int): Parcelable {

}
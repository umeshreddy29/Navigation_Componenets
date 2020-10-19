package gaur.himanshu.august.navigationcomponenets

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class SendMyData(
    val firstName:String,
    val middleName:String,
    val lastName:String
) : Parcelable {
}
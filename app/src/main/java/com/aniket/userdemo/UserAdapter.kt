package com.aniket.userdemo
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aniket.userdemo.model.Userdata

class UserAdapter(private val context: Context, private val userList:List<Userdata>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userIdTextView: TextView = itemView.findViewById(R.id.ubatches)
        val usernameTextView: TextView = itemView.findViewById(R.id.uname)
        val usercatagoryTextView: TextView = itemView.findViewById(R.id.ucategory)
        val avatarImageView: ImageView = itemView.findViewById(R.id.udp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(context)
        val itemView = inflater.inflate(R.layout.user_showing_adapter, parent, false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val currentUser = userList[position]

        holder.userIdTextView.text = "User ID: ${currentUser.userId}"
        holder.usernameTextView.text = "Username: ${currentUser.username}"
        holder.usercatagoryTextView.text = "Username: ${currentUser.usercategoary}"
        holder.avatarImageView.setImageBitmap(currentUser.avatar)
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}

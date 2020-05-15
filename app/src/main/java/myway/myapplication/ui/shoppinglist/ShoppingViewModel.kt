package myway.myapplication.ui.shoppinglist

import android.view.MenuItem
import android.view.ViewManager
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.DisposableHandle
import kotlinx.coroutines.launch
import myway.myapplication.data.db.entities.ShoppingItem
import myway.myapplication.data.repositories.ShoppingRepository

class ShoppingViewModel(
    private val repository: ShoppingRepository
):ViewModel() {
    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
}

    fun getAllShoppingList() = repository.getAllShoppingItems()
}
package u2;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f163691a;

    interface a {
        void a(Cursor cursor);

        Cursor b(CharSequence charSequence);

        Cursor c();

        CharSequence convertToString(Cursor cursor);
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f163691a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorB = this.f163691a.b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorB != null) {
            filterResults.count = cursorB.getCount();
            filterResults.values = cursorB;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorC = this.f163691a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorC) {
            return;
        }
        this.f163691a.a((Cursor) obj);
    }

    b(a aVar) {
        this.f163691a = aVar;
    }
}

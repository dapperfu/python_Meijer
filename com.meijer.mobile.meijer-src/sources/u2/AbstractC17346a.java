package u2;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import u2.b;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17346a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f163681a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f163682b;

    /* renamed from: c, reason: collision with root package name */
    protected Cursor f163683c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f163684d;

    /* renamed from: e, reason: collision with root package name */
    protected int f163685e;

    /* renamed from: f, reason: collision with root package name */
    protected C2591a f163686f;

    /* renamed from: g, reason: collision with root package name */
    protected DataSetObserver f163687g;

    /* renamed from: h, reason: collision with root package name */
    protected u2.b f163688h;

    /* renamed from: u2.a$a, reason: collision with other inner class name */
    private class C2591a extends ContentObserver {
        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        C2591a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AbstractC17346a.this.h();
        }
    }

    /* renamed from: u2.a$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC17346a abstractC17346a = AbstractC17346a.this;
            abstractC17346a.f163681a = true;
            abstractC17346a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC17346a abstractC17346a = AbstractC17346a.this;
            abstractC17346a.f163681a = false;
            abstractC17346a.notifyDataSetInvalidated();
        }
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // u2.b.a
    public Cursor c() {
        return this.f163683c;
    }

    void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f163682b = true;
        } else {
            this.f163682b = false;
        }
        boolean z10 = cursor != null;
        this.f163683c = cursor;
        this.f163681a = z10;
        this.f163684d = context;
        this.f163685e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f163686f = new C2591a();
            this.f163687g = new b();
        } else {
            this.f163686f = null;
            this.f163687g = null;
        }
        if (z10) {
            C2591a c2591a = this.f163686f;
            if (c2591a != null) {
                cursor.registerContentObserver(c2591a);
            }
            DataSetObserver dataSetObserver = this.f163687g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f163681a || (cursor = this.f163683c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f163681a) {
            return null;
        }
        this.f163683c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f163684d, this.f163683c, viewGroup);
        }
        d(view, this.f163684d, this.f163683c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f163688h == null) {
            this.f163688h = new u2.b(this);
        }
        return this.f163688h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f163681a || (cursor = this.f163683c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f163683c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f163681a && (cursor = this.f163683c) != null && cursor.moveToPosition(i10)) {
            return this.f163683c.getLong(this.f163685e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f163681a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f163683c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f163684d, this.f163683c, viewGroup);
            }
            d(view, this.f163684d, this.f163683c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f163682b || (cursor = this.f163683c) == null || cursor.isClosed()) {
            return;
        }
        this.f163681a = this.f163683c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f163683c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C2591a c2591a = this.f163686f;
            if (c2591a != null) {
                cursor2.unregisterContentObserver(c2591a);
            }
            DataSetObserver dataSetObserver = this.f163687g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f163683c = cursor;
        if (cursor == null) {
            this.f163685e = -1;
            this.f163681a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C2591a c2591a2 = this.f163686f;
        if (c2591a2 != null) {
            cursor.registerContentObserver(c2591a2);
        }
        DataSetObserver dataSetObserver2 = this.f163687g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f163685e = cursor.getColumnIndexOrThrow("_id");
        this.f163681a = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public AbstractC17346a(Context context, Cursor cursor, boolean z10) {
        int i10;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        e(context, cursor, i10);
    }

    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }
}

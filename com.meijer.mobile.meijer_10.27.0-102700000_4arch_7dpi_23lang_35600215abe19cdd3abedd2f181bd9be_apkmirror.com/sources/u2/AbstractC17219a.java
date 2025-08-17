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
public abstract class AbstractC17219a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f162643a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f162644b;

    /* renamed from: c, reason: collision with root package name */
    protected Cursor f162645c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f162646d;

    /* renamed from: e, reason: collision with root package name */
    protected int f162647e;

    /* renamed from: f, reason: collision with root package name */
    protected C2567a f162648f;

    /* renamed from: g, reason: collision with root package name */
    protected DataSetObserver f162649g;

    /* renamed from: h, reason: collision with root package name */
    protected u2.b f162650h;

    /* renamed from: u2.a$a, reason: collision with other inner class name */
    private class C2567a extends ContentObserver {
        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        C2567a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AbstractC17219a.this.h();
        }
    }

    /* renamed from: u2.a$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC17219a abstractC17219a = AbstractC17219a.this;
            abstractC17219a.f162643a = true;
            abstractC17219a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC17219a abstractC17219a = AbstractC17219a.this;
            abstractC17219a.f162643a = false;
            abstractC17219a.notifyDataSetInvalidated();
        }
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // u2.b.a
    public Cursor c() {
        return this.f162645c;
    }

    void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f162644b = true;
        } else {
            this.f162644b = false;
        }
        boolean z10 = cursor != null;
        this.f162645c = cursor;
        this.f162643a = z10;
        this.f162646d = context;
        this.f162647e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f162648f = new C2567a();
            this.f162649g = new b();
        } else {
            this.f162648f = null;
            this.f162649g = null;
        }
        if (z10) {
            C2567a c2567a = this.f162648f;
            if (c2567a != null) {
                cursor.registerContentObserver(c2567a);
            }
            DataSetObserver dataSetObserver = this.f162649g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f162643a || (cursor = this.f162645c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f162643a) {
            return null;
        }
        this.f162645c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f162646d, this.f162645c, viewGroup);
        }
        d(view, this.f162646d, this.f162645c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f162650h == null) {
            this.f162650h = new u2.b(this);
        }
        return this.f162650h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f162643a || (cursor = this.f162645c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f162645c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f162643a && (cursor = this.f162645c) != null && cursor.moveToPosition(i10)) {
            return this.f162645c.getLong(this.f162647e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f162643a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f162645c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f162646d, this.f162645c, viewGroup);
            }
            d(view, this.f162646d, this.f162645c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f162644b || (cursor = this.f162645c) == null || cursor.isClosed()) {
            return;
        }
        this.f162643a = this.f162645c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f162645c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C2567a c2567a = this.f162648f;
            if (c2567a != null) {
                cursor2.unregisterContentObserver(c2567a);
            }
            DataSetObserver dataSetObserver = this.f162649g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f162645c = cursor;
        if (cursor == null) {
            this.f162647e = -1;
            this.f162643a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C2567a c2567a2 = this.f162648f;
        if (c2567a2 != null) {
            cursor.registerContentObserver(c2567a2);
        }
        DataSetObserver dataSetObserver2 = this.f162649g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f162647e = cursor.getColumnIndexOrThrow("_id");
        this.f162643a = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public AbstractC17219a(Context context, Cursor cursor, boolean z10) {
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

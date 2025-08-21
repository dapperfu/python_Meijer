package net.zetetic.database.sqlcipher;

import android.database.AbstractWindowedCursor;
import android.database.CursorWindow;
import android.os.Build;
import android.util.Log;
import com.fullstory.FS;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import net.zetetic.database.DatabaseUtils;

/* loaded from: classes14.dex */
public class SQLiteCursor extends AbstractWindowedCursor {

    /* renamed from: h, reason: collision with root package name */
    private static boolean f152322h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f152323i;

    /* renamed from: j, reason: collision with root package name */
    public static int f152324j;

    /* renamed from: a, reason: collision with root package name */
    private final String f152325a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f152326b;

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteQuery f152327c;

    /* renamed from: d, reason: collision with root package name */
    private final SQLiteCursorDriver f152328d;

    /* renamed from: e, reason: collision with root package name */
    private int f152329e;

    /* renamed from: f, reason: collision with root package name */
    private int f152330f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Integer> f152331g;

    @Deprecated
    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }

    private void b() {
        setWindow(null);
    }

    static {
        int iPow = (int) (Math.pow(1024.0d, 2.0d) * 8.0d);
        f152323i = iPow;
        f152324j = iPow;
    }

    public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f152329e = -1;
        if (sQLiteQuery == null) {
            throw new IllegalArgumentException("query object cannot be null");
        }
        this.f152328d = sQLiteCursorDriver;
        this.f152325a = str;
        this.f152331g = null;
        this.f152327c = sQLiteQuery;
        this.f152326b = sQLiteQuery.getColumnNames();
    }

    private void a(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        CursorWindow cursorWindow;
        int i10 = f152324j + 512;
        if (f152322h) {
            b();
            f152322h = false;
        }
        CursorWindow window = getWindow();
        if (window != null) {
            window.clear();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            b.a();
            cursorWindow = a.a(str, i10);
        } else {
            try {
                Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    declaredField.set(null, Integer.valueOf(i10));
                    FS.log_i("SQLiteCursor", String.format("Set CursorWindow allocation size to %s", Integer.valueOf(i10)));
                }
            } catch (Exception e10) {
                FS.log_e("SQLiteCursor", "Failed to override CursorWindow allocation size", e10);
            }
            cursorWindow = new CursorWindow(str);
        }
        setWindow(cursorWindow);
    }

    private void c(int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        a(d().getPath());
        try {
            if (this.f152329e != -1) {
                this.f152327c.z(((AbstractWindowedCursor) this).mWindow, DatabaseUtils.a(i10, this.f152330f), i10, false);
                return;
            }
            this.f152329e = this.f152327c.z(((AbstractWindowedCursor) this).mWindow, DatabaseUtils.a(i10, 0), i10, true);
            this.f152330f = ((AbstractWindowedCursor) this).mWindow.getNumRows();
            if (Log.isLoggable("SQLiteCursor", 3)) {
                FS.log_d("SQLiteCursor", "received count(*) from native_fill_window: " + this.f152329e);
            }
        } catch (RuntimeException e10) {
            b();
            throw e10;
        }
    }

    public SQLiteDatabase d() {
        return this.f152327c.m();
    }

    @Override // android.database.AbstractCursor
    protected void finalize() throws Throwable {
        try {
            if (((AbstractWindowedCursor) this).mWindow != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.f152331g == null) {
            String[] strArr = this.f152326b;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f152331g = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            FS.log_e("SQLiteCursor", "requesting column name with table name -- " + str, new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        Integer num = this.f152331g.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.f152326b;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (this.f152329e == -1) {
            c(0);
        }
        return this.f152329e;
    }

    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i10, int i11) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
        if (cursorWindow != null && i11 >= cursorWindow.getStartPosition() && i11 < ((AbstractWindowedCursor) this).mWindow.getStartPosition() + ((AbstractWindowedCursor) this).mWindow.getNumRows()) {
            return true;
        }
        c(i11);
        return true;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.f152327c.close();
            this.f152328d.cursorClosed();
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.f152328d.cursorDeactivated();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.f152327c.m().isOpen()) {
                    return false;
                }
                CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
                if (cursorWindow != null) {
                    cursorWindow.clear();
                }
                ((AbstractWindowedCursor) this).mPos = -1;
                this.f152329e = -1;
                this.f152328d.cursorRequeried(this);
                try {
                    return super.requery();
                } catch (IllegalStateException e10) {
                    FS.log_w("SQLiteCursor", "requery() failed " + e10.getMessage(), e10);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.database.AbstractWindowedCursor
    public void setWindow(CursorWindow cursorWindow) {
        super.setWindow(cursorWindow);
        this.f152329e = -1;
    }
}

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.fullstory.FS;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import kd.AbstractC15136a;
import kd.C15137b;

@KeepName
/* loaded from: classes4.dex */
public final class DataHolder extends AbstractC15136a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: k, reason: collision with root package name */
    private static final a f64787k = new com.google.android.gms.common.data.a(new String[0], null);

    /* renamed from: a, reason: collision with root package name */
    final int f64788a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f64789b;

    /* renamed from: c, reason: collision with root package name */
    Bundle f64790c;

    /* renamed from: d, reason: collision with root package name */
    private final CursorWindow[] f64791d;

    /* renamed from: e, reason: collision with root package name */
    private final int f64792e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f64793f;

    /* renamed from: g, reason: collision with root package name */
    int[] f64794g;

    /* renamed from: h, reason: collision with root package name */
    int f64795h;

    /* renamed from: i, reason: collision with root package name */
    boolean f64796i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f64797j = true;

    public Bundle B() {
        return this.f64793f;
    }

    public int T() {
        return this.f64792e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f64796i) {
                    this.f64796i = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f64791d;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f64796i;
        }
        return z10;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f64798a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f64799b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f64800c = new HashMap();
    }

    public final void c0() {
        this.f64790c = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f64789b;
            if (i11 >= strArr.length) {
                break;
            }
            this.f64790c.putInt(strArr[i11], i11);
            i11++;
        }
        this.f64794g = new int[this.f64791d.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f64791d;
            if (i10 >= cursorWindowArr.length) {
                this.f64795h = numRows;
                return;
            }
            this.f64794g[i10] = numRows;
            numRows += this.f64791d[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f64797j && this.f64791d.length > 0 && !isClosed()) {
                close();
                FS.log_e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String[] strArr = this.f64789b;
        int iA = C15137b.a(parcel);
        C15137b.x(parcel, 1, strArr, false);
        C15137b.z(parcel, 2, this.f64791d, i10, false);
        C15137b.n(parcel, 3, T());
        C15137b.e(parcel, 4, B(), false);
        C15137b.n(parcel, 1000, this.f64788a);
        C15137b.b(parcel, iA);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f64788a = i10;
        this.f64789b = strArr;
        this.f64791d = cursorWindowArr;
        this.f64792e = i11;
        this.f64793f = bundle;
    }
}

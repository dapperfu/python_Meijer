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
import md.AbstractC15707a;
import md.C15708b;

@KeepName
/* loaded from: classes4.dex */
public final class DataHolder extends AbstractC15707a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: k, reason: collision with root package name */
    private static final a f65627k = new com.google.android.gms.common.data.a(new String[0], null);

    /* renamed from: a, reason: collision with root package name */
    final int f65628a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f65629b;

    /* renamed from: c, reason: collision with root package name */
    Bundle f65630c;

    /* renamed from: d, reason: collision with root package name */
    private final CursorWindow[] f65631d;

    /* renamed from: e, reason: collision with root package name */
    private final int f65632e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f65633f;

    /* renamed from: g, reason: collision with root package name */
    int[] f65634g;

    /* renamed from: h, reason: collision with root package name */
    int f65635h;

    /* renamed from: i, reason: collision with root package name */
    boolean f65636i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f65637j = true;

    public Bundle B() {
        return this.f65633f;
    }

    public int T() {
        return this.f65632e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f65636i) {
                    this.f65636i = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f65631d;
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
            z10 = this.f65636i;
        }
        return z10;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f65638a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f65639b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f65640c = new HashMap();
    }

    public final void b0() {
        this.f65630c = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f65629b;
            if (i11 >= strArr.length) {
                break;
            }
            this.f65630c.putInt(strArr[i11], i11);
            i11++;
        }
        this.f65634g = new int[this.f65631d.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f65631d;
            if (i10 >= cursorWindowArr.length) {
                this.f65635h = numRows;
                return;
            }
            this.f65634g[i10] = numRows;
            numRows += this.f65631d[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f65637j && this.f65631d.length > 0 && !isClosed()) {
                close();
                FS.log_e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String[] strArr = this.f65629b;
        int iA = C15708b.a(parcel);
        C15708b.x(parcel, 1, strArr, false);
        C15708b.z(parcel, 2, this.f65631d, i10, false);
        C15708b.n(parcel, 3, T());
        C15708b.e(parcel, 4, B(), false);
        C15708b.n(parcel, 1000, this.f65628a);
        C15708b.b(parcel, iA);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f65628a = i10;
        this.f65629b = strArr;
        this.f65631d = cursorWindowArr;
        this.f65632e = i11;
        this.f65633f = bundle;
    }
}

package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public class b implements com.android.volley.f {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final g f62956a;

    /* renamed from: b, reason: collision with root package name */
    private final a f62957b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f62958c;

    public b(a aVar) {
        this(aVar, new c(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    public b(a aVar, c cVar) {
        this.f62957b = aVar;
        this.f62956a = aVar;
        this.f62958c = cVar;
    }

    @Override // com.android.volley.f
    public com.android.volley.h a(com.android.volley.i<?> iVar) throws IOException, VolleyError {
        IOException iOException;
        f fVar;
        byte[] bArr;
        com.android.volley.i<?> iVar2;
        byte[] bArrC;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                f fVarA = this.f62957b.a(iVar, e.c(iVar.getCacheEntry()));
                try {
                    int iD = fVarA.d();
                    List<com.android.volley.e> listC = fVarA.c();
                    if (iD == 304) {
                        return l.b(iVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = fVarA.a();
                    if (inputStreamA != null) {
                        bArrC = l.c(inputStreamA, fVarA.b(), this.f62958c);
                    } else {
                        bArrC = new byte[0];
                    }
                    byte[] bArr2 = bArrC;
                    try {
                        l.d(SystemClock.elapsedRealtime() - jElapsedRealtime, iVar, bArr2, iD);
                        if (iD >= 200 && iD <= 299) {
                            return new com.android.volley.h(iD, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                        }
                        throw new IOException();
                    } catch (IOException e10) {
                        e = e10;
                        iVar2 = iVar;
                        fVar = fVarA;
                        bArr = bArr2;
                        iOException = e;
                        l.a(iVar2, l.e(iVar2, iOException, jElapsedRealtime, fVar, bArr));
                        iVar = iVar2;
                    }
                } catch (IOException e11) {
                    e = e11;
                    bArr = null;
                    fVar = fVarA;
                    iVar2 = iVar;
                }
            } catch (IOException e12) {
                iOException = e12;
                fVar = null;
                bArr = null;
                iVar2 = iVar;
            }
            l.a(iVar2, l.e(iVar2, iOException, jElapsedRealtime, fVar, bArr));
            iVar = iVar2;
        }
    }
}

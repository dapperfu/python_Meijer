package Kd;

import Ld.m0;
import android.content.Context;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;

/* renamed from: Kd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3947e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16400a = "e";

    public static void a(Context context, String str) {
        try {
            m0.a(context, null).r9(com.google.android.gms.dynamic.d.F2(context), str);
        } catch (RemoteException | GooglePlayServicesNotAvailableException e10) {
            FS.log_e(f16400a, "Failed to add internal usage attribution id.", e10);
        }
    }
}

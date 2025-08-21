package Md;

import Nd.m0;
import android.content.Context;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;

/* renamed from: Md.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4112e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19759a = "e";

    public static void a(Context context, String str) {
        try {
            m0.a(context, null).r9(com.google.android.gms.dynamic.d.I2(context), str);
        } catch (RemoteException | GooglePlayServicesNotAvailableException e10) {
            FS.log_e(f19759a, "Failed to add internal usage attribution id.", e10);
        }
    }
}

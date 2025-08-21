package Sc;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes4.dex */
public final class s {
    private static DynamiteModule c(Context context) throws zzr {
        try {
            return DynamiteModule.e(context, DynamiteModule.f65836b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e10) {
            throw new zzr(e10);
        }
    }

    public static Context a(Context context) throws zzr {
        return c(context).b();
    }

    public static Object b(Context context, String str, r rVar) throws zzr {
        try {
            return rVar.zza(c(context).d(str));
        } catch (Exception e10) {
            throw new zzr(e10);
        }
    }
}

package com.google.android.libraries.places.internal;

import De.g;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.s;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzeo {
    private final Context zza;
    private final s zzb;
    private final q zzc;

    public zzeo(Context context, s backgroundExecutorService) {
        Intrinsics.j(context, "context");
        Intrinsics.j(backgroundExecutorService, "backgroundExecutorService");
        this.zza = context;
        this.zzb = backgroundExecutorService;
        q qVarSubmit = backgroundExecutorService.submit(new Callable() { // from class: com.google.android.libraries.places.internal.zzen
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zza.getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
            }
        });
        Intrinsics.i(qVarSubmit, "submit(...)");
        this.zzc = qVarSubmit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzf(SharedPreferences sharedPreferences) {
        Intrinsics.j(sharedPreferences, "sharedPreferences");
        String string = sharedPreferences.getString("zb", "");
        return string == null ? "" : string;
    }

    public final q zza() {
        final zzej zzejVar = zzej.zza;
        q qVarD = k.d(this.zzc, new g() { // from class: com.google.android.libraries.places.internal.zzek
            @Override // De.g
            public final /* synthetic */ Object apply(Object obj) {
                Function1 function1 = zzejVar;
                return zzeo.zzf((SharedPreferences) obj);
            }
        }, this.zzb);
        Intrinsics.i(qVarD, "transform(...)");
        return qVarD;
    }

    public final void zzb(final String zwiebackCookie) {
        Intrinsics.j(zwiebackCookie, "zwiebackCookie");
        final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzel
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                SharedPreferences.Editor editorPutString;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                Intrinsics.j(sharedPreferences, "sharedPreferences");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (editorEdit == null || (editorPutString = editorEdit.putString("zb", zwiebackCookie)) == null) {
                    return null;
                }
                editorPutString.apply();
                return Unit.f143329a;
            }
        };
        Intrinsics.i(k.d(this.zzc, new g() { // from class: com.google.android.libraries.places.internal.zzem
            @Override // De.g
            public final /* synthetic */ Object apply(Object obj) {
                return (Unit) function1.invoke(obj);
            }
        }, this.zzb), "transform(...)");
    }
}

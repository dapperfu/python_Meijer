package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.fullstory.FS;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* loaded from: classes6.dex */
final class R0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f81972e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Bundle f81973f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10544v1 f81974g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R0(C10544v1 c10544v1, Context context, Bundle bundle) {
        super(c10544v1, true);
        this.f81972e = context;
        this.f81973f = bundle;
        Objects.requireNonNull(c10544v1);
        this.f81974g = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    public final void a() {
        try {
            Context context = this.f81972e;
            com.google.android.gms.common.internal.r.l(context);
            String strA = Od.o.a(context);
            com.google.android.gms.common.internal.r.l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = Od.o.a(context);
            }
            Boolean boolC = Od.o.c("google_analytics_force_disable_updates", resources, strA);
            C10544v1 c10544v1 = this.f81974g;
            c10544v1.n(c10544v1.t(context, boolC == null || !boolC.booleanValue()));
            if (c10544v1.m() == null) {
                FS.log_w(c10544v1.k(), "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(c10544v1.m())).initialize(com.google.android.gms.dynamic.d.F2(context), new H0(133005L, Math.max(iA, r0), Boolean.TRUE.equals(boolC) || DynamiteModule.c(context, ModuleDescriptor.MODULE_ID) < iA, this.f81973f, Od.o.a(context)), this.f82230a);
        } catch (Exception e10) {
            this.f81974g.j(e10, true, false);
        }
    }
}

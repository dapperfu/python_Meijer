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
final class R0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f82812e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Bundle f82813f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82814g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R0(C10669v1 c10669v1, Context context, Bundle bundle) {
        super(c10669v1, true);
        this.f82812e = context;
        this.f82813f = bundle;
        Objects.requireNonNull(c10669v1);
        this.f82814g = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    public final void a() {
        try {
            Context context = this.f82812e;
            com.google.android.gms.common.internal.r.l(context);
            String strA = Qd.o.a(context);
            com.google.android.gms.common.internal.r.l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = Qd.o.a(context);
            }
            Boolean boolC = Qd.o.c("google_analytics_force_disable_updates", resources, strA);
            C10669v1 c10669v1 = this.f82814g;
            c10669v1.n(c10669v1.t(context, boolC == null || !boolC.booleanValue()));
            if (c10669v1.m() == null) {
                FS.log_w(c10669v1.k(), "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(c10669v1.m())).initialize(com.google.android.gms.dynamic.d.I2(context), new H0(133005L, Math.max(iA, r0), Boolean.TRUE.equals(boolC) || DynamiteModule.c(context, ModuleDescriptor.MODULE_ID) < iA, this.f82813f, Qd.o.a(context)), this.f83070a);
        } catch (Exception e10) {
            this.f82814g.j(e10, true, false);
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes6.dex */
final class B implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC10569k f82499a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ U1 f82500b;

    B(AbstractC10569k abstractC10569k, U1 u12) {
        this.f82499a = abstractC10569k;
        this.f82500b = u12;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC10623q interfaceC10623q = (InterfaceC10623q) obj;
        InterfaceC10623q interfaceC10623q2 = (InterfaceC10623q) obj2;
        if (interfaceC10623q instanceof C10667v) {
            return !(interfaceC10623q2 instanceof C10667v) ? 1 : 0;
        }
        if (interfaceC10623q2 instanceof C10667v) {
            return -1;
        }
        AbstractC10569k abstractC10569k = this.f82499a;
        return abstractC10569k == null ? interfaceC10623q.zzc().compareTo(interfaceC10623q2.zzc()) : (int) C10670v2.i(abstractC10569k.b(this.f82500b, Arrays.asList(interfaceC10623q, interfaceC10623q2)).zzd().doubleValue());
    }
}

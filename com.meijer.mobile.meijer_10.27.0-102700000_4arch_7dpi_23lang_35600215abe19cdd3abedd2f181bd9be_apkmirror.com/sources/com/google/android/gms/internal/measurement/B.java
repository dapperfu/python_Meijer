package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes6.dex */
final class B implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC10444k f81659a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ U1 f81660b;

    B(AbstractC10444k abstractC10444k, U1 u12) {
        this.f81659a = abstractC10444k;
        this.f81660b = u12;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC10498q interfaceC10498q = (InterfaceC10498q) obj;
        InterfaceC10498q interfaceC10498q2 = (InterfaceC10498q) obj2;
        if (interfaceC10498q instanceof C10542v) {
            return !(interfaceC10498q2 instanceof C10542v) ? 1 : 0;
        }
        if (interfaceC10498q2 instanceof C10542v) {
            return -1;
        }
        AbstractC10444k abstractC10444k = this.f81659a;
        return abstractC10444k == null ? interfaceC10498q.zzc().compareTo(interfaceC10498q2.zzc()) : (int) C10545v2.i(abstractC10444k.b(this.f81660b, Arrays.asList(interfaceC10498q, interfaceC10498q2)).zzd().doubleValue());
    }
}

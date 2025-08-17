package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC10396e5;
import com.google.android.gms.internal.measurement.C10360a5;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10360a5<MessageType extends AbstractC10396e5<MessageType, BuilderType>, BuilderType extends C10360a5<MessageType, BuilderType>> extends AbstractC10494p4<MessageType, BuilderType> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC10396e5 f82119a;

    /* renamed from: b, reason: collision with root package name */
    protected AbstractC10396e5 f82120b;

    @Override // com.google.android.gms.internal.measurement.AbstractC10494p4
    public final /* bridge */ /* synthetic */ AbstractC10494p4 j(byte[] bArr, int i10, int i11, P4 p42) throws zzmr {
        s(bArr, 0, i11, p42);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.L5
    public final boolean e() {
        return AbstractC10396e5.C(this.f82120b, false);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10494p4
    public final /* bridge */ /* synthetic */ AbstractC10494p4 i(byte[] bArr, int i10, int i11) throws zzmr {
        P4 p42 = P4.f81958c;
        int i12 = S5.f81982d;
        s(bArr, 0, i11, P4.f81958c);
        return this;
    }

    protected final void m() {
        if (this.f82120b.k()) {
            return;
        }
        n();
    }

    protected void n() {
        AbstractC10396e5 abstractC10396e5M = this.f82119a.m();
        l(abstractC10396e5M, this.f82120b);
        this.f82120b = abstractC10396e5M;
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final C10360a5 clone() {
        C10360a5 c10360a5 = (C10360a5) this.f82119a.D(5, null, null);
        c10360a5.f82120b = zzbf();
        return c10360a5;
    }

    @Override // com.google.android.gms.internal.measurement.J5
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public MessageType zzbf() {
        if (!this.f82120b.k()) {
            return (MessageType) this.f82120b;
        }
        this.f82120b.o();
        return (MessageType) this.f82120b;
    }

    public final C10360a5 r(AbstractC10396e5 abstractC10396e5) {
        if (!this.f82119a.equals(abstractC10396e5)) {
            if (!this.f82120b.k()) {
                n();
            }
            l(this.f82120b, abstractC10396e5);
        }
        return this;
    }

    public final C10360a5 s(byte[] bArr, int i10, int i11, P4 p42) throws zzmr {
        if (!this.f82120b.k()) {
            n();
        }
        try {
            S5.a().b(this.f82120b.getClass()).c(this.f82120b, bArr, 0, i11, new C10538u4(p42));
            return this;
        } catch (zzmr e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    protected C10360a5(MessageType messagetype) {
        this.f82119a = messagetype;
        if (!messagetype.k()) {
            this.f82120b = messagetype.m();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void l(Object obj, Object obj2) {
        S5.a().b(obj.getClass()).zzd(obj, obj2);
    }

    public final MessageType q() {
        MessageType messagetype = (MessageType) zzbf();
        if (messagetype.e()) {
            return messagetype;
        }
        throw new zzoh(messagetype);
    }
}

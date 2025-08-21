package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC10521e5;
import com.google.android.gms.internal.measurement.C10485a5;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.a5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10485a5<MessageType extends AbstractC10521e5<MessageType, BuilderType>, BuilderType extends C10485a5<MessageType, BuilderType>> extends AbstractC10619p4<MessageType, BuilderType> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC10521e5 f82959a;

    /* renamed from: b, reason: collision with root package name */
    protected AbstractC10521e5 f82960b;

    @Override // com.google.android.gms.internal.measurement.AbstractC10619p4
    public final /* bridge */ /* synthetic */ AbstractC10619p4 j(byte[] bArr, int i10, int i11, P4 p42) throws zzmr {
        s(bArr, 0, i11, p42);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.L5
    public final boolean e() {
        return AbstractC10521e5.C(this.f82960b, false);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10619p4
    public final /* bridge */ /* synthetic */ AbstractC10619p4 i(byte[] bArr, int i10, int i11) throws zzmr {
        P4 p42 = P4.f82798c;
        int i12 = S5.f82822d;
        s(bArr, 0, i11, P4.f82798c);
        return this;
    }

    protected final void m() {
        if (this.f82960b.k()) {
            return;
        }
        n();
    }

    protected void n() {
        AbstractC10521e5 abstractC10521e5M = this.f82959a.m();
        l(abstractC10521e5M, this.f82960b);
        this.f82960b = abstractC10521e5M;
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final C10485a5 clone() {
        C10485a5 c10485a5 = (C10485a5) this.f82959a.D(5, null, null);
        c10485a5.f82960b = zzbf();
        return c10485a5;
    }

    @Override // com.google.android.gms.internal.measurement.J5
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public MessageType zzbf() {
        if (!this.f82960b.k()) {
            return (MessageType) this.f82960b;
        }
        this.f82960b.o();
        return (MessageType) this.f82960b;
    }

    public final C10485a5 r(AbstractC10521e5 abstractC10521e5) {
        if (!this.f82959a.equals(abstractC10521e5)) {
            if (!this.f82960b.k()) {
                n();
            }
            l(this.f82960b, abstractC10521e5);
        }
        return this;
    }

    public final C10485a5 s(byte[] bArr, int i10, int i11, P4 p42) throws zzmr {
        if (!this.f82960b.k()) {
            n();
        }
        try {
            S5.a().b(this.f82960b.getClass()).c(this.f82960b, bArr, 0, i11, new C10663u4(p42));
            return this;
        } catch (zzmr e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    protected C10485a5(MessageType messagetype) {
        this.f82959a = messagetype;
        if (!messagetype.k()) {
            this.f82960b = messagetype.m();
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

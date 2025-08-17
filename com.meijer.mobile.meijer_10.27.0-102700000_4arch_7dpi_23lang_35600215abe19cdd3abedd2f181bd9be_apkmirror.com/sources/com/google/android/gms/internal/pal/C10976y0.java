package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.B0;
import com.google.android.gms.internal.pal.C10976y0;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.pal.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10976y0<MessageType extends B0<MessageType, BuilderType>, BuilderType extends C10976y0<MessageType, BuilderType>> extends J<MessageType, BuilderType> {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f84217a;

    /* renamed from: b, reason: collision with root package name */
    protected B0 f84218b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f84219c = false;

    @Override // com.google.android.gms.internal.pal.InterfaceC10706h1
    public final /* synthetic */ InterfaceC10690g1 C() {
        return this.f84217a;
    }

    @Override // com.google.android.gms.internal.pal.J
    protected final /* synthetic */ J c(K k10) {
        f((B0) k10);
        return this;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C10976y0 clone() {
        C10976y0 c10976y0 = (C10976y0) this.f84217a.r(5, null, null);
        c10976y0.f(B());
        return c10976y0;
    }

    public final C10976y0 f(B0 b02) {
        if (this.f84219c) {
            l();
            this.f84219c = false;
        }
        d(this.f84218b, b02);
        return this;
    }

    public final C10976y0 g(byte[] bArr, int i10, int i11, C10833p0 c10833p0) throws zzadi {
        if (this.f84219c) {
            l();
            this.f84219c = false;
        }
        try {
            C10818o1.a().b(this.f84218b.getClass()).a(this.f84218b, bArr, 0, i11, new N(c10833p0));
            return this;
        } catch (zzadi e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzadi.i();
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10674f1
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public MessageType B() {
        if (this.f84219c) {
            return (MessageType) this.f84218b;
        }
        B0 b02 = this.f84218b;
        C10818o1.a().b(b02.getClass()).zzf(b02);
        this.f84219c = true;
        return (MessageType) this.f84218b;
    }

    protected void l() {
        B0 b02 = (B0) this.f84218b.r(4, null, null);
        d(b02, this.f84218b);
        this.f84218b = b02;
    }

    protected C10976y0(MessageType messagetype) {
        this.f84217a = messagetype;
        this.f84218b = (B0) messagetype.r(4, null, null);
    }

    private static final void d(B0 b02, B0 b03) {
        C10818o1.a().b(b02.getClass()).zzg(b02, b03);
    }

    public final MessageType j() {
        MessageType messagetype = (MessageType) B();
        if (messagetype.k()) {
            return messagetype;
        }
        throw new zzafh(messagetype);
    }
}

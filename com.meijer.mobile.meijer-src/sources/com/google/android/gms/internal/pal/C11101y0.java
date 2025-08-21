package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.B0;
import com.google.android.gms.internal.pal.C11101y0;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.pal.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C11101y0<MessageType extends B0<MessageType, BuilderType>, BuilderType extends C11101y0<MessageType, BuilderType>> extends J<MessageType, BuilderType> {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f85057a;

    /* renamed from: b, reason: collision with root package name */
    protected B0 f85058b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f85059c = false;

    @Override // com.google.android.gms.internal.pal.InterfaceC10831h1
    public final /* synthetic */ InterfaceC10815g1 C() {
        return this.f85057a;
    }

    @Override // com.google.android.gms.internal.pal.J
    protected final /* synthetic */ J c(K k10) {
        f((B0) k10);
        return this;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C11101y0 clone() {
        C11101y0 c11101y0 = (C11101y0) this.f85057a.r(5, null, null);
        c11101y0.f(B());
        return c11101y0;
    }

    public final C11101y0 f(B0 b02) {
        if (this.f85059c) {
            l();
            this.f85059c = false;
        }
        d(this.f85058b, b02);
        return this;
    }

    public final C11101y0 g(byte[] bArr, int i10, int i11, C10958p0 c10958p0) throws zzadi {
        if (this.f85059c) {
            l();
            this.f85059c = false;
        }
        try {
            C10943o1.a().b(this.f85058b.getClass()).a(this.f85058b, bArr, 0, i11, new N(c10958p0));
            return this;
        } catch (zzadi e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzadi.i();
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10799f1
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public MessageType B() {
        if (this.f85059c) {
            return (MessageType) this.f85058b;
        }
        B0 b02 = this.f85058b;
        C10943o1.a().b(b02.getClass()).zzf(b02);
        this.f85059c = true;
        return (MessageType) this.f85058b;
    }

    protected void l() {
        B0 b02 = (B0) this.f85058b.r(4, null, null);
        d(b02, this.f85058b);
        this.f85058b = b02;
    }

    protected C11101y0(MessageType messagetype) {
        this.f85057a = messagetype;
        this.f85058b = (B0) messagetype.r(4, null, null);
    }

    private static final void d(B0 b02, B0 b03) {
        C10943o1.a().b(b02.getClass()).zzg(b02, b03);
    }

    public final MessageType j() {
        MessageType messagetype = (MessageType) B();
        if (messagetype.k()) {
            return messagetype;
        }
        throw new zzafh(messagetype);
    }
}

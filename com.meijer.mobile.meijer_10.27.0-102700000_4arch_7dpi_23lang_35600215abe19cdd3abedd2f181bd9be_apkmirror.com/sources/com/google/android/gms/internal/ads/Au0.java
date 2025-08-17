package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Au0;
import com.google.android.gms.internal.ads.Gu0;
import java.io.IOException;

/* loaded from: classes6.dex */
public class Au0<MessageType extends Gu0<MessageType, BuilderType>, BuilderType extends Au0<MessageType, BuilderType>> extends Gt0<MessageType, BuilderType> {

    /* renamed from: a, reason: collision with root package name */
    private final MessageType f65236a;

    /* renamed from: b, reason: collision with root package name */
    protected MessageType f65237b;

    public MessageType r() {
        return this.f65236a;
    }

    private MessageType k() {
        return (MessageType) this.f65236a.K();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9227qv0
    public final boolean C() {
        return Gu0.a0(this.f65237b, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9013ov0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public MessageType P1() {
        if (!this.f65237b.V()) {
            return this.f65237b;
        }
        this.f65237b.B();
        return this.f65237b;
    }

    protected final void s() {
        if (this.f65237b.V()) {
            return;
        }
        t();
    }

    protected Au0(MessageType messagetype) {
        this.f65236a = messagetype;
        if (!messagetype.V()) {
            this.f65237b = (MessageType) k();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static <MessageType> void l(MessageType messagetype, MessageType messagetype2) {
        C10082yv0.a().b(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.Gt0
    public /* bridge */ /* synthetic */ Gt0 e(byte[] bArr, int i10, int i11, C9225qu0 c9225qu0) throws zzgyg {
        o(bArr, i10, i11, c9225qu0);
        return this;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public BuilderType clone() {
        BuilderType buildertype = (BuilderType) r().b();
        buildertype.f65237b = (MessageType) P1();
        return buildertype;
    }

    public BuilderType n(MessageType messagetype) {
        if (r().equals(messagetype)) {
            return this;
        }
        s();
        l(this.f65237b, messagetype);
        return this;
    }

    public BuilderType o(byte[] bArr, int i10, int i11, C9225qu0 c9225qu0) throws zzgyg {
        s();
        try {
            C10082yv0.a().b(this.f65237b.getClass()).a(this.f65237b, bArr, i10, i10 + i11, new Mt0(c9225qu0));
            return this;
        } catch (zzgyg e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final MessageType p() {
        MessageType messagetype = (MessageType) P1();
        if (messagetype.C()) {
            return messagetype;
        }
        throw Gt0.g(messagetype);
    }

    protected void t() {
        MessageType messagetype = (MessageType) k();
        l(messagetype, this.f65237b);
        this.f65237b = messagetype;
    }
}

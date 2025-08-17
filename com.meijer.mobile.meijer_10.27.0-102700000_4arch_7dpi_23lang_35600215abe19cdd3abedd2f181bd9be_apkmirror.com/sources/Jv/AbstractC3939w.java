package Jv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"LJv/w;", "LJv/v;", "<init>", "()V", "", "b", "()Z", "", "c", "()I", "", "buffer", "bufferOffset", "count", "a", "([CII)I", "", "Ljava/lang/Character;", "bufferedChar", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Jv.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC3939w implements InterfaceC3938v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Character bufferedChar;

    public abstract boolean b();

    public abstract int c();

    @Override // Jv.InterfaceC3938v
    public final int a(char[] buffer, int bufferOffset, int count) {
        int i10;
        Intrinsics.j(buffer, "buffer");
        Character ch2 = this.bufferedChar;
        if (ch2 != null) {
            Intrinsics.g(ch2);
            buffer[bufferOffset] = ch2.charValue();
            this.bufferedChar = null;
            i10 = 1;
        } else {
            i10 = 0;
        }
        while (i10 < count && !b()) {
            int iC = c();
            if (iC <= 65535) {
                buffer[bufferOffset + i10] = (char) iC;
                i10++;
            } else {
                char c10 = (char) ((iC >>> 10) + 55232);
                char c11 = (char) ((iC & 1023) + 56320);
                buffer[bufferOffset + i10] = c10;
                int i11 = i10 + 1;
                if (i11 < count) {
                    buffer[i11 + bufferOffset] = c11;
                    i10 += 2;
                } else {
                    this.bufferedChar = Character.valueOf(c11);
                    i10 = i11;
                }
            }
        }
        if (i10 > 0) {
            return i10;
        }
        return -1;
    }
}

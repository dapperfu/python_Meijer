package Wv;

import com.medallia.digital.mobilesdk.l3;
import gw.InterfaceC14417f;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"LWv/a;", "", "", "sections", "ranges", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "codePoint", "b", "(I)I", "position", "limit", "a", "(III)I", "Lgw/f;", "sink", "", "c", "(ILgw/f;)Z", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "getRanges", "getMappings", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sections;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String ranges;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String mappings;

    public a(String sections, String ranges, String mappings) {
        Intrinsics.j(sections, "sections");
        Intrinsics.j(ranges, "ranges");
        Intrinsics.j(mappings, "mappings");
        this.sections = sections;
        this.ranges = ranges;
        this.mappings = mappings;
    }

    private final int a(int codePoint, int position, int limit) {
        int i10;
        int i11 = codePoint & l3.f93324d;
        int i12 = limit - 1;
        while (true) {
            if (position > i12) {
                i10 = (-position) - 1;
                break;
            }
            i10 = (position + i12) / 2;
            int iK = Intrinsics.k(i11, this.ranges.charAt(i10 * 4));
            if (iK >= 0) {
                if (iK <= 0) {
                    break;
                }
                position = i10 + 1;
            } else {
                i12 = i10 - 1;
            }
        }
        return i10 >= 0 ? i10 * 4 : ((-i10) - 2) * 4;
    }

    public final boolean c(int codePoint, InterfaceC14417f sink) throws IOException {
        Intrinsics.j(sink, "sink");
        int iB = b(codePoint);
        int iA = a(codePoint, c.a(this.sections, iB + 2), iB + 4 < this.sections.length() ? c.a(this.sections, iB + 6) : this.ranges.length() / 4);
        char cCharAt = this.ranges.charAt(iA + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int iA2 = c.a(this.ranges, iA + 2);
            sink.N0(this.mappings, iA2, cCharAt + iA2);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.Z(codePoint - (this.ranges.charAt(iA + 3) | (((cCharAt & 15) << 14) | (this.ranges.charAt(iA + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.Z(codePoint + (this.ranges.charAt(iA + 3) | ((cCharAt & 15) << 14) | (this.ranges.charAt(iA + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            Unit unit = Unit.f143329a;
            return true;
        }
        if (cCharAt == 'x') {
            sink.Z(codePoint);
            return true;
        }
        if (cCharAt == 'y') {
            sink.Z(codePoint);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(this.ranges.charAt(iA + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(this.ranges.charAt(iA + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(this.ranges.charAt(iA + 2));
            sink.writeByte(this.ranges.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(this.ranges.charAt(iA + 2) | 128);
            sink.writeByte(this.ranges.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(this.ranges.charAt(iA + 2));
            sink.writeByte(this.ranges.charAt(iA + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            sink.writeByte(this.ranges.charAt(iA + 2) | 128);
            sink.writeByte(this.ranges.charAt(iA + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + codePoint).toString());
    }

    private final int b(int codePoint) {
        int i10;
        int i11 = (codePoint & 2097024) >> 7;
        int length = (this.sections.length() / 4) - 1;
        int i12 = 0;
        while (true) {
            if (i12 <= length) {
                i10 = (i12 + length) / 2;
                int iK = Intrinsics.k(i11, c.a(this.sections, i10 * 4));
                if (iK < 0) {
                    length = i10 - 1;
                } else {
                    if (iK <= 0) {
                        break;
                    }
                    i12 = i10 + 1;
                }
            } else {
                i10 = (-i12) - 1;
                break;
            }
        }
        if (i10 >= 0) {
            return i10 * 4;
        }
        return ((-i10) - 2) * 4;
    }
}

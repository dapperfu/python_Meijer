package w4;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\"\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "b", "()Ljava/lang/StringBuilder;", "builder", "", "count", "", "a", "(Ljava/lang/StringBuilder;I)V", "", "", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "EMPTY_STRING_ARRAY", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: w4.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17770r {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final String[] f165703a = new String[0];

    public static final void a(StringBuilder builder, int i10) {
        Intrinsics.j(builder, "builder");
        for (int i11 = 0; i11 < i10; i11++) {
            builder.append("?");
            if (i11 < i10 - 1) {
                builder.append(",");
            }
        }
    }

    @Deprecated
    public static final StringBuilder b() {
        return new StringBuilder();
    }
}

package Fv;

import Ev.AbstractC3260b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"LFv/r;", "LFv/j;", "LFv/x;", "writer", "LEv/b;", "json", "<init>", "(LFv/x;LEv/b;)V", "", "b", "()V", "q", "c", "d", "p", "LEv/b;", "", "I", "level", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class r extends C3600j {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3260b json;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int level;

    @Override // Fv.C3600j
    public void b() {
        o(true);
        this.level++;
    }

    @Override // Fv.C3600j
    public void c() {
        o(false);
        k("\n");
        int i10 = this.level;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.json.getConfiguration().getPrettyPrintIndent());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC3613x writer, AbstractC3260b json) {
        super(writer);
        Intrinsics.j(writer, "writer");
        Intrinsics.j(json, "json");
        this.json = json;
    }

    @Override // Fv.C3600j
    public void p() {
        f(' ');
    }

    @Override // Fv.C3600j
    public void q() {
        this.level--;
    }

    @Override // Fv.C3600j
    public void d() {
        if (getWritingFirst()) {
            o(false);
        } else {
            c();
        }
    }
}

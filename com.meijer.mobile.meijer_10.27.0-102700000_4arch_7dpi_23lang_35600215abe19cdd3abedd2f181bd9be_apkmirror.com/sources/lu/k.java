package lu;

import com.squareup.wire.ProtoAdapter;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kw.C15331h;
import lu.k;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000 \u0017*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0001\u000bB\u001f\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058G¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\rR \u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Llu/k;", "M", "", "B", "Ljava/io/Serializable;", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "Lkw/h;", "unknownFields", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lkw/h;)V", "a", "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "b", "Lkw/h;", "()Lkw/h;", "unknownFields$annotations", "()V", "", "c", "I", "hashCode", "d", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class k<M extends k<M, B>, B> implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final transient ProtoAdapter<M> adapter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final transient C15331h unknownFields;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    protected transient int hashCode;

    protected k(ProtoAdapter<M> adapter, C15331h unknownFields) {
        Intrinsics.j(adapter, "adapter");
        Intrinsics.j(unknownFields, "unknownFields");
        this.adapter = adapter;
        this.unknownFields = unknownFields;
    }

    @JvmName
    public C15331h a() {
        C15331h c15331h = this.unknownFields;
        return c15331h == null ? C15331h.f148095e : c15331h;
    }
}

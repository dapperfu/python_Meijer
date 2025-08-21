package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "", "f", "()J", "c", "J", "reading", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class TestTimeSource extends AbstractLongTimeSource {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.f148414b);
        e();
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* renamed from: f, reason: from getter */
    protected long getReading() {
        return this.reading;
    }
}

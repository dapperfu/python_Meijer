package C7;

import Y7.EventMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LC7/a;", "", "", "envelopeSize", "<init>", "(I)V", "", "LY7/f;", "metadata", "", "maxBeaconSizeBytes", "Lkotlin/Pair;", "b", "(Ljava/util/List;J)Lkotlin/Pair;", "a", "(Ljava/util/List;JI)Ljava/util/List;", "I", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int envelopeSize;

    public final List<EventMetadata> a(List<EventMetadata> metadata, long maxBeaconSizeBytes, int envelopeSize) {
        Intrinsics.j(metadata, "metadata");
        if (metadata.isEmpty()) {
            return metadata;
        }
        ArrayList arrayList = new ArrayList();
        for (EventMetadata eventMetadata : metadata) {
            envelopeSize += eventMetadata.getEventSizeBytes() + 1;
            if (envelopeSize - 1 > maxBeaconSizeBytes) {
                break;
            }
            arrayList.add(eventMetadata);
        }
        return arrayList;
    }

    public final Pair<List<EventMetadata>, List<EventMetadata>> b(List<EventMetadata> metadata, long maxBeaconSizeBytes) {
        List<EventMetadata> listA;
        Intrinsics.j(metadata, "metadata");
        if (metadata.isEmpty()) {
            return new Pair<>(CollectionsKt.m(), CollectionsKt.m());
        }
        List<EventMetadata> listM1 = CollectionsKt.m1(metadata);
        ArrayList arrayList = new ArrayList();
        do {
            listA = a(listM1, maxBeaconSizeBytes, this.envelopeSize);
            if (listA.isEmpty()) {
                EventMetadata eventMetadata = (EventMetadata) CollectionsKt.s0(listM1);
                arrayList.add(eventMetadata);
                listM1.remove(eventMetadata);
            }
            if (!listA.isEmpty()) {
                break;
            }
        } while (!listM1.isEmpty());
        return new Pair<>(listA, arrayList);
    }

    public a(int i10) {
        this.envelopeSize = i10;
    }
}

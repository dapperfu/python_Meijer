package com.radiusnetworks.flybuy.sdk.data.site;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.location.CircularRegion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JY\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&¢\u0006\u0002\u0010\u000fJg\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/site/RemoteSitesRepository;", "", "fetch", "", "region", "Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;", "page", "", "per", "operationalStatus", "", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/site/PaginatedSites;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "(Lcom/radiusnetworks/flybuy/sdk/data/location/CircularRegion;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "query", "matchPartnerIdentifier", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface RemoteSitesRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void fetch$default(RemoteSitesRepository remoteSitesRepository, String str, Integer num, Integer num2, String str2, Boolean bool, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                num2 = null;
            }
            if ((i10 & 32) != 0) {
                function2 = null;
            }
            remoteSitesRepository.fetch(str, num, num2, str2, bool, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void fetch$default(RemoteSitesRepository remoteSitesRepository, CircularRegion circularRegion, Integer num, Integer num2, String str, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                num2 = null;
            }
            if ((i10 & 16) != 0) {
                function2 = null;
            }
            remoteSitesRepository.fetch(circularRegion, num, num2, str, function2);
        }
    }

    void fetch(CircularRegion region, Integer page, Integer per, String operationalStatus, Function2<? super PaginatedSites, ? super SdkError, Unit> callback);

    void fetch(String query, Integer page, Integer per, String operationalStatus, Boolean matchPartnerIdentifier, Function2<? super PaginatedSites, ? super SdkError, Unit> callback);
}

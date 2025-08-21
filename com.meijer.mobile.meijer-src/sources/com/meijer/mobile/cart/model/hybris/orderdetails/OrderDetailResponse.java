package com.meijer.mobile.cart.model.hybris.orderdetails;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.address.model.hybris.HybrisCustomerAddress;
import com.meijer.mobile.cart.model.hybris.CustomerDataResponse;
import com.meijer.mobile.cart.model.hybris.DeliveryOrderGroup;
import com.meijer.mobile.cart.model.hybris.EntryJson;
import com.meijer.mobile.cart.model.hybris.HybrisDeliveryMode;
import com.meijer.mobile.cart.model.hybris.HybrisLightningCartReward;
import com.meijer.mobile.cart.model.hybris.HybrisSubstitutePreference;
import com.meijer.mobile.cart.model.hybris.MultiTenderPaymentInfoResponse;
import com.meijer.mobile.cart.model.hybris.PaymentDetails;
import com.meijer.mobile.cart.model.hybris.PickupOrderGroup;
import com.meijer.mobile.cart.model.hybris.TenderResponse;
import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupPerson;
import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupSlotInfo;
import com.meijer.mobile.cart.model.hybris.orders.HybrisOrderPrice;
import com.meijer.mobile.cart.model.hybris.orders.HybrisPromotionResult;
import com.meijer.mobile.cart.model.hybris.orders.HybrisVoucher;
import com.meijer.mobile.cart.model.hybris.principal.HybrisPrincipal;
import com.meijer.mobile.core.util.moshi.SkipBadElements;
import com.meijer.mobile.core.util.moshi.Stringable;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000í\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0097\u0001\b\u0087\b\u0018\u00002\u00020\u0001B©\t\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\f\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\n\u0012\b\b\u0003\u0010\u000e\u001a\u00020\n\u0012\b\b\u0003\u0010\u000f\u001a\u00020\n\u0012\b\b\u0003\u0010\u0010\u001a\u00020\n\u0012\b\b\u0003\u0010\u0011\u001a\u00020\n\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\u0013\u001a\u00020\n\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0003\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u000e\b\u0003\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0015\u0012\u000e\b\u0003\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0015\u0012\b\b\u0003\u0010#\u001a\u00020\n\u0012\b\b\u0003\u0010$\u001a\u00020\n\u0012\b\b\u0003\u0010%\u001a\u00020\n\u0012\b\b\u0003\u0010'\u001a\u00020&\u0012\b\b\u0003\u0010(\u001a\u00020\u0002\u0012\b\b\u0003\u0010)\u001a\u00020\n\u0012\b\b\u0003\u0010+\u001a\u00020*\u0012\b\b\u0003\u0010,\u001a\u00020\n\u0012\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010.\u001a\u00020\u0002\u0012\b\b\u0003\u0010/\u001a\u00020\u0002\u0012\b\b\u0003\u00100\u001a\u00020*\u0012\b\b\u0003\u00101\u001a\u00020*\u0012\b\b\u0003\u00102\u001a\u00020*\u0012\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u00104\u001a\u00020*\u0012\f\b\u0003\u00106\u001a\u00060\u0002j\u0002`5\u0012\b\b\u0003\u00107\u001a\u00020\b\u0012\u000e\b\u0003\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0015\u0012\n\b\u0003\u0010;\u001a\u0004\u0018\u00010:\u0012\u000e\b\u0003\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0015\u0012\u000e\b\u0003\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0015\u0012\b\b\u0003\u0010@\u001a\u00020\u0018\u0012\b\b\u0003\u0010A\u001a\u00020\u0018\u0012\b\b\u0003\u0010B\u001a\u00020\u0018\u0012\u000e\b\u0003\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0015\u0012\f\b\u0003\u0010E\u001a\u00060\u0002j\u0002`5\u0012\b\b\u0003\u0010F\u001a\u00020\n\u0012\n\b\u0003\u0010H\u001a\u0004\u0018\u00010G\u0012\n\b\u0003\u0010J\u001a\u0004\u0018\u00010I\u0012\b\b\u0003\u0010K\u001a\u00020\b\u0012\b\b\u0003\u0010M\u001a\u00020L\u0012\b\b\u0003\u0010N\u001a\u00020L\u0012\n\b\u0003\u0010O\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010P\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010R\u001a\u0004\u0018\u00010Q\u0012\b\b\u0003\u0010S\u001a\u00020\b\u0012\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010V\u001a\u00020\b\u0012\b\b\u0003\u0010W\u001a\u00020\b\u0012\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010X\u0012\b\b\u0003\u0010Z\u001a\u00020\n\u0012\n\b\u0003\u0010[\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\\\u001a\u00020\b\u0012\n\b\u0003\u0010^\u001a\u0004\u0018\u00010]\u0012\n\b\u0003\u0010_\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010`\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0003\u0010b\u001a\u00020\b\u0012\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010d\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010e\u001a\u00020\u0002\u0012\b\b\u0003\u0010f\u001a\u00020\u0002\u0012\b\b\u0003\u0010g\u001a\u00020\b\u0012\n\b\u0003\u0010h\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010i\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\u0015\u0012\n\b\u0003\u0010l\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010m\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010n\u001a\u00020\n\u0012\b\b\u0003\u0010o\u001a\u00020\n\u0012\b\b\u0003\u0010p\u001a\u00020\n\u0012\n\b\u0003\u0010q\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010r\u001a\u00020\n\u0012\u0010\b\u0003\u0010t\u001a\n\u0012\u0004\u0012\u00020s\u0018\u00010\u0015\u0012\n\b\u0003\u0010v\u001a\u0004\u0018\u00010u\u0012\b\b\u0003\u0010w\u001a\u00020\b\u0012\b\b\u0003\u0010x\u001a\u00020\b\u0012\b\b\u0003\u0010y\u001a\u00020\u0002\u0012\b\b\u0003\u0010z\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010|\u001a\b\u0012\u0004\u0012\u00020{0\u0015\u0012\u0010\b\u0003\u0010~\u001a\n\u0012\u0004\u0012\u00020}\u0018\u00010\u0015\u0012\u000b\b\u0003\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f\u0012\u000b\b\u0003\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0002\u0012\u000f\b\u0003\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000b\b\u0003\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u0012\u0012\b\u0003\u0010\u0087\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010\u0015¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J³\t\u0010\u008a\u0001\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010\u0010\u001a\u00020\n2\b\b\u0003\u0010\u0011\u001a\u00020\n2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u0013\u001a\u00020\n2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n2\u000e\b\u0003\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0003\u0010\u0019\u001a\u00020\u00182\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0003\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00152\u000e\b\u0003\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00152\b\b\u0003\u0010#\u001a\u00020\n2\b\b\u0003\u0010$\u001a\u00020\n2\b\b\u0003\u0010%\u001a\u00020\n2\b\b\u0003\u0010'\u001a\u00020&2\b\b\u0003\u0010(\u001a\u00020\u00022\b\b\u0003\u0010)\u001a\u00020\n2\b\b\u0003\u0010+\u001a\u00020*2\b\b\u0003\u0010,\u001a\u00020\n2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010.\u001a\u00020\u00022\b\b\u0003\u0010/\u001a\u00020\u00022\b\b\u0003\u00100\u001a\u00020*2\b\b\u0003\u00101\u001a\u00020*2\b\b\u0003\u00102\u001a\u00020*2\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u00104\u001a\u00020*2\f\b\u0003\u00106\u001a\u00060\u0002j\u0002`52\b\b\u0003\u00107\u001a\u00020\b2\u000e\b\u0003\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00152\n\b\u0003\u0010;\u001a\u0004\u0018\u00010:2\u000e\b\u0003\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00152\u000e\b\u0003\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00152\b\b\u0003\u0010@\u001a\u00020\u00182\b\b\u0003\u0010A\u001a\u00020\u00182\b\b\u0003\u0010B\u001a\u00020\u00182\u000e\b\u0003\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00152\f\b\u0003\u0010E\u001a\u00060\u0002j\u0002`52\b\b\u0003\u0010F\u001a\u00020\n2\n\b\u0003\u0010H\u001a\u0004\u0018\u00010G2\n\b\u0003\u0010J\u001a\u0004\u0018\u00010I2\b\b\u0003\u0010K\u001a\u00020\b2\b\b\u0003\u0010M\u001a\u00020L2\b\b\u0003\u0010N\u001a\u00020L2\n\b\u0003\u0010O\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010P\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010R\u001a\u0004\u0018\u00010Q2\b\b\u0003\u0010S\u001a\u00020\b2\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010V\u001a\u00020\b2\b\b\u0003\u0010W\u001a\u00020\b2\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010X2\b\b\u0003\u0010Z\u001a\u00020\n2\n\b\u0003\u0010[\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\\\u001a\u00020\b2\n\b\u0003\u0010^\u001a\u0004\u0018\u00010]2\n\b\u0003\u0010_\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010`\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010a\u001a\u0004\u0018\u00010\u00182\b\b\u0003\u0010b\u001a\u00020\b2\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010d\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010e\u001a\u00020\u00022\b\b\u0003\u0010f\u001a\u00020\u00022\b\b\u0003\u0010g\u001a\u00020\b2\n\b\u0003\u0010h\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010i\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\u00152\n\b\u0003\u0010l\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010m\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010n\u001a\u00020\n2\b\b\u0003\u0010o\u001a\u00020\n2\b\b\u0003\u0010p\u001a\u00020\n2\n\b\u0003\u0010q\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010r\u001a\u00020\n2\u0010\b\u0003\u0010t\u001a\n\u0012\u0004\u0012\u00020s\u0018\u00010\u00152\n\b\u0003\u0010v\u001a\u0004\u0018\u00010u2\b\b\u0003\u0010w\u001a\u00020\b2\b\b\u0003\u0010x\u001a\u00020\b2\b\b\u0003\u0010y\u001a\u00020\u00022\b\b\u0003\u0010z\u001a\u00020\u00022\u000e\b\u0003\u0010|\u001a\b\u0012\u0004\u0012\u00020{0\u00152\u0010\b\u0003\u0010~\u001a\n\u0012\u0004\u0012\u00020}\u0018\u00010\u00152\u000b\b\u0003\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u000b\b\u0003\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00022\u000f\b\u0003\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000b\b\u0003\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0012\b\u0003\u0010\u0087\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010\u0015HÆ\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0013\u0010\u008c\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0013\u0010\u008e\u0001\u001a\u00020\u0018HÖ\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001e\u0010\u0091\u0001\u001a\u00020\b2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u008d\u0001R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0094\u0001\u001a\u0006\b\u0097\u0001\u0010\u008d\u0001R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0094\u0001\u001a\u0006\b\u0099\u0001\u0010\u008d\u0001R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0094\u0001\u001a\u0006\b\u009b\u0001\u0010\u008d\u0001R\u001b\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010\f\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010¡\u0001\u001a\u0006\b¤\u0001\u0010£\u0001R\u001b\u0010\r\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010¡\u0001\u001a\u0006\b¦\u0001\u0010£\u0001R\u001b\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¡\u0001\u001a\u0006\b¨\u0001\u0010£\u0001R\u001b\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010¡\u0001\u001a\u0006\bª\u0001\u0010£\u0001R\u001b\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010¡\u0001\u001a\u0006\b¬\u0001\u0010£\u0001R\u001b\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010¡\u0001\u001a\u0006\b®\u0001\u0010£\u0001R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010¡\u0001\u001a\u0006\b«\u0001\u0010£\u0001R\u001b\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010¡\u0001\u001a\u0006\b°\u0001\u0010£\u0001R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010¡\u0001\u001a\u0006\b²\u0001\u0010£\u0001R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001b\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\u0010\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010\u008f\u0001R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b³\u0001\u0010¼\u0001R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\u0010\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¯\u0001\u0010¿\u0001R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R!\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00158\u0006¢\u0006\u0010\n\u0006\bÄ\u0001\u0010´\u0001\u001a\u0006\b\u0093\u0001\u0010¶\u0001R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00158\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010´\u0001\u001a\u0006\b\u0096\u0001\u0010¶\u0001R\u001b\u0010#\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010¡\u0001\u001a\u0006\bÆ\u0001\u0010£\u0001R\u001b\u0010$\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\bÇ\u0001\u0010¡\u0001\u001a\u0006\bÈ\u0001\u0010£\u0001R\u001b\u0010%\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\bÉ\u0001\u0010¡\u0001\u001a\u0006\bÊ\u0001\u0010£\u0001R\u001b\u0010'\u001a\u00020&8\u0006¢\u0006\u0010\n\u0006\bË\u0001\u0010µ\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u001b\u0010(\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bÎ\u0001\u0010\u0094\u0001\u001a\u0006\bÏ\u0001\u0010\u008d\u0001R\u001b\u0010)\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\bÐ\u0001\u0010¡\u0001\u001a\u0006\bÑ\u0001\u0010£\u0001R\u001b\u0010+\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u001b\u0010,\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\bµ\u0001\u0010¡\u0001\u001a\u0006\bÖ\u0001\u0010£\u0001R\u001d\u0010-\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010¡\u0001\u001a\u0006\b×\u0001\u0010£\u0001R\u001b\u0010.\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010\u0094\u0001\u001a\u0006\bØ\u0001\u0010\u008d\u0001R\u001b\u0010/\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bÙ\u0001\u0010\u0094\u0001\u001a\u0006\bÚ\u0001\u0010\u008d\u0001R\u001b\u00100\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ó\u0001\u001a\u0006\b§\u0001\u0010Õ\u0001R\u001b\u00101\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010Ó\u0001\u001a\u0006\bÜ\u0001\u0010Õ\u0001R\u001b\u00102\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010Ó\u0001\u001a\u0006\bÝ\u0001\u0010Õ\u0001R\u001d\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bÞ\u0001\u0010\u0094\u0001\u001a\u0006\bß\u0001\u0010\u008d\u0001R\u001b\u00104\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\bà\u0001\u0010Ó\u0001\u001a\u0006\bá\u0001\u0010Õ\u0001R\u001f\u00106\u001a\u00060\u0002j\u0002`58\u0006¢\u0006\u0010\n\u0006\bÜ\u0001\u0010\u0094\u0001\u001a\u0006\b¸\u0001\u0010\u008d\u0001R\u001b\u00107\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\bâ\u0001\u0010\u009d\u0001\u001a\u0006\b\u009a\u0001\u0010\u009f\u0001R!\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00158\u0006¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010´\u0001\u001a\u0006\b\u0098\u0001\u0010¶\u0001R\u001d\u0010;\u001a\u0004\u0018\u00010:8\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001R!\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00158\u0006¢\u0006\u0010\n\u0006\bÈ\u0001\u0010´\u0001\u001a\u0006\bæ\u0001\u0010¶\u0001R!\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00158\u0006¢\u0006\u0010\n\u0006\bç\u0001\u0010´\u0001\u001a\u0006\bº\u0001\u0010¶\u0001R\u001b\u0010@\u001a\u00020\u00188\u0006¢\u0006\u0010\n\u0006\bè\u0001\u0010¸\u0001\u001a\u0006\bé\u0001\u0010\u008f\u0001R\u001b\u0010A\u001a\u00020\u00188\u0006¢\u0006\u0010\n\u0006\bê\u0001\u0010¸\u0001\u001a\u0006\b±\u0001\u0010\u008f\u0001R\u001b\u0010B\u001a\u00020\u00188\u0006¢\u0006\u0010\n\u0006\bë\u0001\u0010¸\u0001\u001a\u0006\bì\u0001\u0010\u008f\u0001R!\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00158\u0006¢\u0006\u0010\n\u0006\bí\u0001\u0010´\u0001\u001a\u0006\bè\u0001\u0010¶\u0001R\u001f\u0010E\u001a\u00060\u0002j\u0002`58\u0006¢\u0006\u0010\n\u0006\bî\u0001\u0010\u0094\u0001\u001a\u0006\bà\u0001\u0010\u008d\u0001R\u001b\u0010F\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\bÂ\u0001\u0010¡\u0001\u001a\u0006\bÄ\u0001\u0010£\u0001R\u001d\u0010H\u001a\u0004\u0018\u00010G8\u0006¢\u0006\u0010\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001R\u001d\u0010J\u001a\u0004\u0018\u00010I8\u0006¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001R\u001b\u0010K\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\bö\u0001\u0010\u009d\u0001\u001a\u0006\bï\u0001\u0010\u009f\u0001R\u001b\u0010M\u001a\u00020L8\u0006¢\u0006\u0010\n\u0006\bé\u0001\u0010÷\u0001\u001a\u0006\bö\u0001\u0010ø\u0001R\u001b\u0010N\u001a\u00020L8\u0006¢\u0006\u0010\n\u0006\bæ\u0001\u0010÷\u0001\u001a\u0006\bí\u0001\u0010ø\u0001R\u001d\u0010O\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bñ\u0001\u0010\u0094\u0001\u001a\u0006\bù\u0001\u0010\u008d\u0001R\u001d\u0010P\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u0094\u0001\u001a\u0006\bú\u0001\u0010\u008d\u0001R\u001d\u0010R\u001a\u0004\u0018\u00010Q8\u0006¢\u0006\u0010\n\u0006\bÊ\u0001\u0010û\u0001\u001a\u0006\b\u00ad\u0001\u0010ü\u0001R\u001b\u0010S\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\bÌ\u0001\u0010\u009d\u0001\u001a\u0006\bÒ\u0001\u0010\u009f\u0001R\u001d\u0010T\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bÏ\u0001\u0010\u0094\u0001\u001a\u0006\bë\u0001\u0010\u008d\u0001R\u001d\u0010U\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bý\u0001\u0010\u0094\u0001\u001a\u0006\bç\u0001\u0010\u008d\u0001R\u001b\u0010V\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\bþ\u0001\u0010\u009d\u0001\u001a\u0006\bÿ\u0001\u0010\u009f\u0001R\u001b\u0010W\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\b\u0080\u0002\u0010\u009d\u0001\u001a\u0006\b\u0081\u0002\u0010\u009f\u0001R\u001d\u0010Y\u001a\u0004\u0018\u00010X8\u0006¢\u0006\u0010\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R\u001b\u0010Z\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010¡\u0001\u001a\u0006\b¥\u0001\u0010£\u0001R\u001d\u0010[\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bØ\u0001\u0010\u0094\u0001\u001a\u0006\b·\u0001\u0010\u008d\u0001R\u001b\u0010\\\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\bÝ\u0001\u0010\u009d\u0001\u001a\u0006\bÅ\u0001\u0010\u009f\u0001R\u001d\u0010^\u001a\u0004\u0018\u00010]8\u0006¢\u0006\u0010\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002R\u001d\u0010_\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u008a\u0002\u0010\u0094\u0001\u001a\u0006\b\u008b\u0002\u0010\u008d\u0001R\u001d\u0010`\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bß\u0001\u0010\u0094\u0001\u001a\u0006\b\u008c\u0002\u0010\u008d\u0001R\u001d\u0010a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u0010\n\u0006\bÚ\u0001\u0010\u008d\u0002\u001a\u0006\bý\u0001\u0010\u008e\u0002R\u001b\u0010b\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u009d\u0001\u001a\u0006\b\u008f\u0002\u0010\u009f\u0001R\u001d\u0010c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b×\u0001\u0010\u0094\u0001\u001a\u0006\b©\u0001\u0010\u008d\u0001R\u001d\u0010d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b®\u0001\u0010\u0094\u0001\u001a\u0006\b \u0001\u0010\u008d\u0001R\u001b\u0010e\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bô\u0001\u0010\u0094\u0001\u001a\u0006\bê\u0001\u0010\u008d\u0001R\u001b\u0010f\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bá\u0001\u0010\u0094\u0001\u001a\u0006\b\u0086\u0002\u0010\u008d\u0001R\u001b\u0010g\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010\u009d\u0001\u001a\u0006\bÛ\u0001\u0010\u009f\u0001R\u001d\u0010h\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010\u0094\u0001\u001a\u0006\b½\u0001\u0010\u008d\u0001R\u001d\u0010i\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010\u0094\u0001\u001a\u0006\bÀ\u0001\u0010\u008d\u0001R!\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\u00158\u0006¢\u0006\u0010\n\u0006\b\u0092\u0002\u0010´\u0001\u001a\u0006\b\u0093\u0002\u0010¶\u0001R\u001d\u0010l\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u0094\u0002\u0010\u0094\u0001\u001a\u0006\bÙ\u0001\u0010\u008d\u0001R\u001d\u0010m\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u008b\u0002\u0010\u0094\u0001\u001a\u0006\bî\u0001\u0010\u008d\u0001R\u001b\u0010n\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0002\u0010¡\u0001\u001a\u0006\bË\u0001\u0010£\u0001R\u001b\u0010o\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\bÿ\u0001\u0010¡\u0001\u001a\u0006\bÎ\u0001\u0010£\u0001R\u001b\u0010p\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010¡\u0001\u001a\u0006\bÇ\u0001\u0010£\u0001R\u001d\u0010q\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u0010\n\u0006\b¤\u0001\u0010¡\u0001\u001a\u0006\b\u0080\u0002\u0010£\u0001R\u001b\u0010r\u001a\u00020\n8\u0006¢\u0006\u0010\n\u0006\bÑ\u0001\u0010¡\u0001\u001a\u0006\bÐ\u0001\u0010£\u0001R#\u0010t\u001a\n\u0012\u0004\u0012\u00020s\u0018\u00010\u00158\u0006¢\u0006\u0010\n\u0006\bÖ\u0001\u0010´\u0001\u001a\u0006\bÉ\u0001\u0010¶\u0001R\u001d\u0010v\u001a\u0004\u0018\u00010u8\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u0095\u0002\u001a\u0006\bâ\u0001\u0010\u0096\u0002R\u001b\u0010w\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u009d\u0001\u001a\u0006\b\u009c\u0001\u0010\u009f\u0001R\u001b\u0010x\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u009d\u0001\u001a\u0006\bþ\u0001\u0010\u009f\u0001R\u001b\u0010y\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bÔ\u0001\u0010\u0094\u0001\u001a\u0006\b\u0091\u0002\u0010\u008d\u0001R\u001b\u0010z\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bª\u0001\u0010\u0094\u0001\u001a\u0006\b\u0082\u0002\u0010\u008d\u0001R!\u0010|\u001a\b\u0012\u0004\u0012\u00020{0\u00158\u0006¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010´\u0001\u001a\u0006\b\u0097\u0002\u0010¶\u0001R#\u0010~\u001a\n\u0012\u0004\u0012\u00020}\u0018\u00010\u00158\u0006¢\u0006\u0010\n\u0006\bì\u0001\u0010´\u0001\u001a\u0006\bÞ\u0001\u0010¶\u0001R\u001e\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0006¢\u0006\u0010\n\u0006\b\u0093\u0002\u0010\u0098\u0002\u001a\u0006\b\u009d\u0001\u0010\u0099\u0002R\u001e\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u009a\u0002\u0010\u0094\u0001\u001a\u0006\b\u0094\u0002\u0010\u008d\u0001R\"\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\u0010\n\u0006\bä\u0001\u0010´\u0001\u001a\u0006\b\u009a\u0002\u0010¶\u0001R\u001e\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bú\u0001\u0010\u0094\u0001\u001a\u0006\b\u008a\u0002\u0010\u008d\u0001R\u001d\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006¢\u0006\u0010\n\u0006\bù\u0001\u0010\u009b\u0002\u001a\u0006\b\u0092\u0002\u0010\u009c\u0002R%\u0010\u0087\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010\u00158\u0006¢\u0006\u0010\n\u0006\b\u008f\u0002\u0010´\u0001\u001a\u0006\b\u0090\u0002\u0010¶\u0001¨\u0006\u009d\u0002"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "name", "description", "expirationTime", "", "net", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "itemsTotal", "totalCosts", "totalPriceWithTax", "totalPrice", "totalTax", "subTotal", "subTotalWithoutQuoteDiscounts", "creditTransactionAmount", "deliveryCost", "extendedDeliveryCost", "", "Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "entries", "", "totalItems", "Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "deliveryMode", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "deliveryAddress", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "paymentInfo", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionResult;", "appliedOrderPromotions", "appliedProductPromotions", "productDiscounts", "orderDiscounts", "quoteDiscounts", "", "quoteDiscountsRate", "quoteDiscountsType", "totalDiscounts", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "totalSavings", "totalDiscountsWithQuoteDiscounts", "subTotalWithDiscounts", "site", PlaceTypes.STORE, "couponsSavings", "mperksSavings", "specialsSavings", "statusUpdateTimestamp", "teamMemberSavings", "Lcom/meijer/mobile/core/model/common/Guid;", "guid", "calculated", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisVoucher;", "appliedVouchers", "Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;", "user", "Lcom/meijer/mobile/cart/model/hybris/PickupOrderGroup;", "pickupOrderGroups", "Lcom/meijer/mobile/cart/model/hybris/DeliveryOrderGroup;", "deliveryOrderGroups", "pickupItemsQuantity", "deliveryItemsQuantity", "totalUnitCount", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPrice;", "orderPrices", "merchantCustomerId", "depositPrice", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "pointOfService", "Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "substitutePreference", "phoneNumberTextable", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;", "pickUpSlotInfo", "originalPickUpSlotInfo", "vehicleDescription", "validAgeAcknowledgementTime", "Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "customerData", "editable", "originalOrderId", "orderNotes", "tippablePartner", "tippedAndRated", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisShopperInfo;", "shopperInfo", "convenienceFee", "deliveryNote", "earlyDelivery", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "tipAmount", "tipCode", "tipDate", "rating", "isMfc", "created", "captureAuthCode", "orderStatus", "statusDisplay", "guestCustomer", "deliveryStatus", "deliveryStatusDisplay", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderEntryJson;", "unconsignedEntries", "fulfillmentEligibility", "partnerEligibility", "ebtEligibleTotal", "ebtNonEligibleTotal", "ebtCapturedBalance", "rtsCapturedBalance", "ebtSurchargePrice", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/EbtTransactionResponse;", "ebtEditOrderDetailInfoResponse", "Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "multiTenderPaymentInfo", "cancellable", "returnable", "timeZone", "rtsCartId", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTotalTaxValue;", "totalTaxValues", "Lcom/meijer/mobile/cart/model/hybris/HybrisLightningCartReward;", "lightningCartReward", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "pickUpPerson", "tipAuthCode", "unfulfilledEntries", "statusUpdateReason", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "tipAndRateDetailsResponse", "Lcom/meijer/mobile/cart/model/hybris/TenderResponse;", "tenders", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/util/List;ILcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;Ljava/util/List;Ljava/util/List;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;DLjava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Ljava/lang/String;ZLjava/util/List;Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;Ljava/util/List;Ljava/util/List;IIILjava/util/List;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;ZLcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;ZLjava/lang/String;Ljava/lang/String;ZZLcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisShopperInfo;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;ZLcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/util/List;Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/util/List;ILcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;Ljava/util/List;Ljava/util/List;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;DLjava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;Ljava/lang/String;ZLjava/util/List;Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;Ljava/util/List;Ljava/util/List;IIILjava/util/List;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;ZLcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;ZLjava/lang/String;Ljava/lang/String;ZZLcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisShopperInfo;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;ZLcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/util/List;Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;Ljava/util/List;)Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "O", "c", "v", "d", "E", "e", "Z", "P", "()Z", "f", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "J", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "H0", "h", "M0", "i", "L0", "j", "O0", "k", "t0", "l", "v0", "m", "n", "o", "F", "p", "Ljava/util/List;", "D", "()Ljava/util/List;", "q", "I", "K0", "r", "Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "()Lcom/meijer/mobile/cart/model/hybris/HybrisDeliveryMode;", "s", "Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "()Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "t", "Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "X", "()Lcom/meijer/mobile/cart/model/hybris/PaymentDetails;", "u", "w", "e0", "x", "Q", "y", "f0", "z", "g0", "()D", "A", "h0", "B", "I0", "C", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "N0", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "J0", "u0", "n0", "G", "s0", "H", "M", "o0", "K", "r0", "L", "x0", "N", "Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;", "T0", "()Lcom/meijer/mobile/cart/model/hybris/principal/HybrisPrincipal;", "c0", "R", "S", "b0", "T", "U", "Q0", "V", "W", "Y", "Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "d0", "()Lcom/meijer/mobile/store/model/hybris/HybrisPointOfService;", "Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "w0", "()Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "a0", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;", "()Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;", "V0", "U0", "Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "()Lcom/meijer/mobile/cart/model/hybris/CustomerDataResponse;", "i0", "j0", "F0", "k0", "G0", "l0", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisShopperInfo;", "m0", "()Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisShopperInfo;", "p0", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "A0", "()Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "q0", "D0", "E0", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "W0", "y0", "z0", "B0", "R0", "C0", "Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "()Lcom/meijer/mobile/cart/model/hybris/MultiTenderPaymentInfoResponse;", "P0", "Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "()Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupPerson;", "S0", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "()Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderDetailResponse {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final String quoteDiscountsType;

    /* renamed from: A0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryStatusDisplay;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalDiscounts;

    /* renamed from: B0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderEntryJson> unconsignedEntries;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings totalSavings;

    /* renamed from: C0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentEligibility;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalDiscountsWithQuoteDiscounts;

    /* renamed from: D0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice subTotalWithDiscounts;

    /* renamed from: E0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice ebtEligibleTotal;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final String site;

    /* renamed from: F0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice ebtNonEligibleTotal;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final String store;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice ebtCapturedBalance;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings couponsSavings;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice rtsCapturedBalance;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings mperksSavings;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice ebtSurchargePrice;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings specialsSavings;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EbtTransactionResponse> ebtEditOrderDetailInfoResponse;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusUpdateTimestamp;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiTenderPaymentInfoResponse multiTenderPaymentInfo;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings teamMemberSavings;

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cancellable;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final String guid;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean returnable;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean calculated;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timeZone;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisVoucher> appliedVouchers;

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rtsCartId;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrincipal user;

    /* renamed from: P0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisTotalTaxValue> totalTaxValues;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PickupOrderGroup> pickupOrderGroups;

    /* renamed from: Q0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisLightningCartReward> lightningCartReward;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DeliveryOrderGroup> deliveryOrderGroups;

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPickupPerson pickUpPerson;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pickupItemsQuantity;

    /* renamed from: S0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipAuthCode;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private final int deliveryItemsQuantity;

    /* renamed from: T0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryJson> unfulfilledEntries;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalUnitCount;

    /* renamed from: U0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusUpdateReason;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisOrderPrice> orderPrices;

    /* renamed from: V0, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipAndRateDetailsResponse tipAndRateDetailsResponse;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantCustomerId;

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TenderResponse> tenders;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice depositPrice;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPointOfService pointOfService;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSubstitutePreference substitutePreference;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean phoneNumberTextable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPickupSlotInfo pickUpSlotInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPickupSlotInfo originalPickUpSlotInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationTime;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vehicleDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean net;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String validAgeAcknowledgementTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice itemsTotal;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerDataResponse customerData;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalCosts;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean editable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalPriceWithTax;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String originalOrderId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalPrice;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderNotes;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalTax;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippablePartner;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice subTotal;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippedAndRated;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice subTotalWithoutQuoteDiscounts;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisShopperInfo shopperInfo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice creditTransactionAmount;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice convenienceFee;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice deliveryCost;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryNote;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice extendedDeliveryCost;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDelivery;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryJson> entries;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisTipAmount tipAmount;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalItems;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipCode;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisDeliveryMode deliveryMode;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipDate;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCustomerAddress deliveryAddress;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer rating;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentDetails paymentInfo;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMfc;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPromotionResult> appliedOrderPromotions;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String created;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPromotionResult> appliedProductPromotions;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String captureAuthCode;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice productDiscounts;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderStatus;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice orderDiscounts;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusDisplay;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice quoteDiscounts;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean guestCustomer;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quoteDiscountsRate;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryStatus;

    public OrderDetailResponse() {
        this(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, false, false, null, null, null, false, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 31, null);
    }

    public final OrderDetailResponse copy(@g(name = "code") String code, @g(name = "name") String name, @g(name = "description") String description, @g(name = "expirationTime") String expirationTime, @g(name = "net") @Stringable boolean net2, @g(name = "itemsTotal") HybrisPrice itemsTotal, @g(name = "totalCosts") HybrisPrice totalCosts, @g(name = "totalPriceWithTax") HybrisPrice totalPriceWithTax, @g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "totalTax") HybrisPrice totalTax, @g(name = "subTotal") HybrisPrice subTotal, @g(name = "subTotalWithoutQuoteDiscounts") HybrisPrice subTotalWithoutQuoteDiscounts, @g(name = "creditTransactionAmount") HybrisPrice creditTransactionAmount, @g(name = "deliveryCost") HybrisPrice deliveryCost, @g(name = "extendedDeliveryCost") HybrisPrice extendedDeliveryCost, @g(name = "entries") @SkipBadElements List<EntryJson> entries, @g(name = "totalItems") int totalItems, @g(name = "deliveryMode") HybrisDeliveryMode deliveryMode, @g(name = "deliveryAddress") HybrisCustomerAddress deliveryAddress, @g(name = "paymentInfo") PaymentDetails paymentInfo, @g(name = "appliedOrderPromotions") List<HybrisPromotionResult> appliedOrderPromotions, @g(name = "appliedProductPromotions") List<HybrisPromotionResult> appliedProductPromotions, @g(name = "productDiscounts") HybrisPrice productDiscounts, @g(name = "orderDiscounts") HybrisPrice orderDiscounts, @g(name = "quoteDiscounts") HybrisPrice quoteDiscounts, @g(name = "quoteDiscountsRate") double quoteDiscountsRate, @g(name = "quoteDiscountsType") String quoteDiscountsType, @g(name = "totalDiscounts") HybrisPrice totalDiscounts, @g(name = "totalSavings") HybrisSavings totalSavings, @g(name = "totalDiscountsWithQuoteDiscounts") HybrisPrice totalDiscountsWithQuoteDiscounts, @g(name = "subTotalWithDiscounts") HybrisPrice subTotalWithDiscounts, @g(name = "site") String site, @g(name = PlaceTypes.STORE) String store, @g(name = "couponsSavings") HybrisSavings couponsSavings, @g(name = "mperksSavings") HybrisSavings mperksSavings, @g(name = "specialsSavings") HybrisSavings specialsSavings, @g(name = "statusUpdateTimestamp") String statusUpdateTimestamp, @g(name = "teamMemberSavings") HybrisSavings teamMemberSavings, @g(name = "guid") String guid, @g(name = "calculated") boolean calculated, @g(name = "appliedVouchers") List<HybrisVoucher> appliedVouchers, @g(name = "user") HybrisPrincipal user, @g(name = "pickupOrderGroups") List<PickupOrderGroup> pickupOrderGroups, @g(name = "deliveryOrderGroups") List<DeliveryOrderGroup> deliveryOrderGroups, @g(name = "pickupItemsQuantity") int pickupItemsQuantity, @g(name = "deliveryItemsQuantity") int deliveryItemsQuantity, @g(name = "totalUnitCount") int totalUnitCount, @g(name = "orderPrices") List<HybrisOrderPrice> orderPrices, @g(name = "merchantCustomerId") String merchantCustomerId, @g(name = "depositPrice") HybrisPrice depositPrice, @g(name = "pointOfService") HybrisPointOfService pointOfService, @g(name = "substitutePreference") HybrisSubstitutePreference substitutePreference, @g(name = "phoneNumberTextable") boolean phoneNumberTextable, @g(name = "pickUpSlotInfo") HybrisPickupSlotInfo pickUpSlotInfo, @g(name = "originalPickUpSlotInfo") HybrisPickupSlotInfo originalPickUpSlotInfo, @g(name = "vehicleDescription") String vehicleDescription, @g(name = "validAgeAcknowledgementTime") String validAgeAcknowledgementTime, @g(name = "customerData") CustomerDataResponse customerData, @g(name = "editable") boolean editable, @g(name = "originalOrderId") String originalOrderId, @g(name = "orderNotes") String orderNotes, @g(name = "tippablePartner") boolean tippablePartner, @g(name = "tippedAndRated") boolean tippedAndRated, @g(name = "shopperInfo") HybrisShopperInfo shopperInfo, @g(name = "convenienceFee") HybrisPrice convenienceFee, @g(name = "deliveryNote") String deliveryNote, @g(name = "earlyDelivery") boolean earlyDelivery, @g(name = "tipAmount") HybrisTipAmount tipAmount, @g(name = "tipCode") String tipCode, @g(name = "tipDate") String tipDate, @g(name = "rating") Integer rating, @g(name = "isMfc") boolean isMfc, @g(name = "created") String created, @g(name = "captureAuthCode") String captureAuthCode, @g(name = "status") String orderStatus, @g(name = "statusDisplay") String statusDisplay, @g(name = "guestCustomer") @Stringable boolean guestCustomer, @g(name = "deliveryStatus") String deliveryStatus, @g(name = "deliveryStatusDisplay") String deliveryStatusDisplay, @g(name = "unconsignedEntries") @SkipBadElements List<OrderEntryJson> unconsignedEntries, @g(name = "fulfillmentEligibility") String fulfillmentEligibility, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "ebtEligibleTotal") HybrisPrice ebtEligibleTotal, @g(name = "ebtNonEligibleTotal") HybrisPrice ebtNonEligibleTotal, @g(name = "ebtCapturedBalance") HybrisPrice ebtCapturedBalance, @g(name = "rtsCapturedBalance") HybrisPrice rtsCapturedBalance, @g(name = "ebtSurchargePrice") HybrisPrice ebtSurchargePrice, @g(name = "ebtEditOrderDetailInfo") List<EbtTransactionResponse> ebtEditOrderDetailInfoResponse, @g(name = "multiTenderPaymentInfo") MultiTenderPaymentInfoResponse multiTenderPaymentInfo, @g(name = "cancellable") boolean cancellable, @g(name = "returnable") boolean returnable, @g(name = "timeZone") String timeZone, @g(name = "rtsCartId") String rtsCartId, @g(name = "totalTaxValues") List<HybrisTotalTaxValue> totalTaxValues, @g(name = "lightningCartReward") List<HybrisLightningCartReward> lightningCartReward, @g(name = "pickUpPerson") HybrisPickupPerson pickUpPerson, @g(name = "tipAuthCode") String tipAuthCode, @g(name = "unfulfilledEntries") @SkipBadElements List<EntryJson> unfulfilledEntries, @g(name = "statusUpdateReason") String statusUpdateReason, @g(name = "tipAndRateDetails") TipAndRateDetailsResponse tipAndRateDetailsResponse, @g(name = "tenders") List<TenderResponse> tenders) {
        Intrinsics.j(code, "code");
        Intrinsics.j(itemsTotal, "itemsTotal");
        Intrinsics.j(totalCosts, "totalCosts");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(subTotalWithoutQuoteDiscounts, "subTotalWithoutQuoteDiscounts");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(entries, "entries");
        Intrinsics.j(appliedOrderPromotions, "appliedOrderPromotions");
        Intrinsics.j(appliedProductPromotions, "appliedProductPromotions");
        Intrinsics.j(productDiscounts, "productDiscounts");
        Intrinsics.j(orderDiscounts, "orderDiscounts");
        Intrinsics.j(quoteDiscounts, "quoteDiscounts");
        Intrinsics.j(quoteDiscountsType, "quoteDiscountsType");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(totalSavings, "totalSavings");
        Intrinsics.j(totalDiscountsWithQuoteDiscounts, "totalDiscountsWithQuoteDiscounts");
        Intrinsics.j(site, "site");
        Intrinsics.j(store, "store");
        Intrinsics.j(couponsSavings, "couponsSavings");
        Intrinsics.j(mperksSavings, "mperksSavings");
        Intrinsics.j(specialsSavings, "specialsSavings");
        Intrinsics.j(teamMemberSavings, "teamMemberSavings");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(appliedVouchers, "appliedVouchers");
        Intrinsics.j(pickupOrderGroups, "pickupOrderGroups");
        Intrinsics.j(deliveryOrderGroups, "deliveryOrderGroups");
        Intrinsics.j(orderPrices, "orderPrices");
        Intrinsics.j(merchantCustomerId, "merchantCustomerId");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(pickUpSlotInfo, "pickUpSlotInfo");
        Intrinsics.j(originalPickUpSlotInfo, "originalPickUpSlotInfo");
        Intrinsics.j(convenienceFee, "convenienceFee");
        Intrinsics.j(orderStatus, "orderStatus");
        Intrinsics.j(statusDisplay, "statusDisplay");
        Intrinsics.j(unconsignedEntries, "unconsignedEntries");
        Intrinsics.j(ebtEligibleTotal, "ebtEligibleTotal");
        Intrinsics.j(ebtNonEligibleTotal, "ebtNonEligibleTotal");
        Intrinsics.j(ebtCapturedBalance, "ebtCapturedBalance");
        Intrinsics.j(ebtSurchargePrice, "ebtSurchargePrice");
        Intrinsics.j(timeZone, "timeZone");
        Intrinsics.j(rtsCartId, "rtsCartId");
        Intrinsics.j(totalTaxValues, "totalTaxValues");
        Intrinsics.j(unfulfilledEntries, "unfulfilledEntries");
        Intrinsics.j(tipAndRateDetailsResponse, "tipAndRateDetailsResponse");
        return new OrderDetailResponse(code, name, description, expirationTime, net2, itemsTotal, totalCosts, totalPriceWithTax, totalPrice, totalTax, subTotal, subTotalWithoutQuoteDiscounts, creditTransactionAmount, deliveryCost, extendedDeliveryCost, entries, totalItems, deliveryMode, deliveryAddress, paymentInfo, appliedOrderPromotions, appliedProductPromotions, productDiscounts, orderDiscounts, quoteDiscounts, quoteDiscountsRate, quoteDiscountsType, totalDiscounts, totalSavings, totalDiscountsWithQuoteDiscounts, subTotalWithDiscounts, site, store, couponsSavings, mperksSavings, specialsSavings, statusUpdateTimestamp, teamMemberSavings, guid, calculated, appliedVouchers, user, pickupOrderGroups, deliveryOrderGroups, pickupItemsQuantity, deliveryItemsQuantity, totalUnitCount, orderPrices, merchantCustomerId, depositPrice, pointOfService, substitutePreference, phoneNumberTextable, pickUpSlotInfo, originalPickUpSlotInfo, vehicleDescription, validAgeAcknowledgementTime, customerData, editable, originalOrderId, orderNotes, tippablePartner, tippedAndRated, shopperInfo, convenienceFee, deliveryNote, earlyDelivery, tipAmount, tipCode, tipDate, rating, isMfc, created, captureAuthCode, orderStatus, statusDisplay, guestCustomer, deliveryStatus, deliveryStatusDisplay, unconsignedEntries, fulfillmentEligibility, partnerEligibility, ebtEligibleTotal, ebtNonEligibleTotal, ebtCapturedBalance, rtsCapturedBalance, ebtSurchargePrice, ebtEditOrderDetailInfoResponse, multiTenderPaymentInfo, cancellable, returnable, timeZone, rtsCartId, totalTaxValues, lightningCartReward, pickUpPerson, tipAuthCode, unfulfilledEntries, statusUpdateReason, tipAndRateDetailsResponse, tenders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailResponse)) {
            return false;
        }
        OrderDetailResponse orderDetailResponse = (OrderDetailResponse) other;
        return Intrinsics.e(this.code, orderDetailResponse.code) && Intrinsics.e(this.name, orderDetailResponse.name) && Intrinsics.e(this.description, orderDetailResponse.description) && Intrinsics.e(this.expirationTime, orderDetailResponse.expirationTime) && this.net == orderDetailResponse.net && Intrinsics.e(this.itemsTotal, orderDetailResponse.itemsTotal) && Intrinsics.e(this.totalCosts, orderDetailResponse.totalCosts) && Intrinsics.e(this.totalPriceWithTax, orderDetailResponse.totalPriceWithTax) && Intrinsics.e(this.totalPrice, orderDetailResponse.totalPrice) && Intrinsics.e(this.totalTax, orderDetailResponse.totalTax) && Intrinsics.e(this.subTotal, orderDetailResponse.subTotal) && Intrinsics.e(this.subTotalWithoutQuoteDiscounts, orderDetailResponse.subTotalWithoutQuoteDiscounts) && Intrinsics.e(this.creditTransactionAmount, orderDetailResponse.creditTransactionAmount) && Intrinsics.e(this.deliveryCost, orderDetailResponse.deliveryCost) && Intrinsics.e(this.extendedDeliveryCost, orderDetailResponse.extendedDeliveryCost) && Intrinsics.e(this.entries, orderDetailResponse.entries) && this.totalItems == orderDetailResponse.totalItems && Intrinsics.e(this.deliveryMode, orderDetailResponse.deliveryMode) && Intrinsics.e(this.deliveryAddress, orderDetailResponse.deliveryAddress) && Intrinsics.e(this.paymentInfo, orderDetailResponse.paymentInfo) && Intrinsics.e(this.appliedOrderPromotions, orderDetailResponse.appliedOrderPromotions) && Intrinsics.e(this.appliedProductPromotions, orderDetailResponse.appliedProductPromotions) && Intrinsics.e(this.productDiscounts, orderDetailResponse.productDiscounts) && Intrinsics.e(this.orderDiscounts, orderDetailResponse.orderDiscounts) && Intrinsics.e(this.quoteDiscounts, orderDetailResponse.quoteDiscounts) && Double.compare(this.quoteDiscountsRate, orderDetailResponse.quoteDiscountsRate) == 0 && Intrinsics.e(this.quoteDiscountsType, orderDetailResponse.quoteDiscountsType) && Intrinsics.e(this.totalDiscounts, orderDetailResponse.totalDiscounts) && Intrinsics.e(this.totalSavings, orderDetailResponse.totalSavings) && Intrinsics.e(this.totalDiscountsWithQuoteDiscounts, orderDetailResponse.totalDiscountsWithQuoteDiscounts) && Intrinsics.e(this.subTotalWithDiscounts, orderDetailResponse.subTotalWithDiscounts) && Intrinsics.e(this.site, orderDetailResponse.site) && Intrinsics.e(this.store, orderDetailResponse.store) && Intrinsics.e(this.couponsSavings, orderDetailResponse.couponsSavings) && Intrinsics.e(this.mperksSavings, orderDetailResponse.mperksSavings) && Intrinsics.e(this.specialsSavings, orderDetailResponse.specialsSavings) && Intrinsics.e(this.statusUpdateTimestamp, orderDetailResponse.statusUpdateTimestamp) && Intrinsics.e(this.teamMemberSavings, orderDetailResponse.teamMemberSavings) && Intrinsics.e(this.guid, orderDetailResponse.guid) && this.calculated == orderDetailResponse.calculated && Intrinsics.e(this.appliedVouchers, orderDetailResponse.appliedVouchers) && Intrinsics.e(this.user, orderDetailResponse.user) && Intrinsics.e(this.pickupOrderGroups, orderDetailResponse.pickupOrderGroups) && Intrinsics.e(this.deliveryOrderGroups, orderDetailResponse.deliveryOrderGroups) && this.pickupItemsQuantity == orderDetailResponse.pickupItemsQuantity && this.deliveryItemsQuantity == orderDetailResponse.deliveryItemsQuantity && this.totalUnitCount == orderDetailResponse.totalUnitCount && Intrinsics.e(this.orderPrices, orderDetailResponse.orderPrices) && Intrinsics.e(this.merchantCustomerId, orderDetailResponse.merchantCustomerId) && Intrinsics.e(this.depositPrice, orderDetailResponse.depositPrice) && Intrinsics.e(this.pointOfService, orderDetailResponse.pointOfService) && Intrinsics.e(this.substitutePreference, orderDetailResponse.substitutePreference) && this.phoneNumberTextable == orderDetailResponse.phoneNumberTextable && Intrinsics.e(this.pickUpSlotInfo, orderDetailResponse.pickUpSlotInfo) && Intrinsics.e(this.originalPickUpSlotInfo, orderDetailResponse.originalPickUpSlotInfo) && Intrinsics.e(this.vehicleDescription, orderDetailResponse.vehicleDescription) && Intrinsics.e(this.validAgeAcknowledgementTime, orderDetailResponse.validAgeAcknowledgementTime) && Intrinsics.e(this.customerData, orderDetailResponse.customerData) && this.editable == orderDetailResponse.editable && Intrinsics.e(this.originalOrderId, orderDetailResponse.originalOrderId) && Intrinsics.e(this.orderNotes, orderDetailResponse.orderNotes) && this.tippablePartner == orderDetailResponse.tippablePartner && this.tippedAndRated == orderDetailResponse.tippedAndRated && Intrinsics.e(this.shopperInfo, orderDetailResponse.shopperInfo) && Intrinsics.e(this.convenienceFee, orderDetailResponse.convenienceFee) && Intrinsics.e(this.deliveryNote, orderDetailResponse.deliveryNote) && this.earlyDelivery == orderDetailResponse.earlyDelivery && Intrinsics.e(this.tipAmount, orderDetailResponse.tipAmount) && Intrinsics.e(this.tipCode, orderDetailResponse.tipCode) && Intrinsics.e(this.tipDate, orderDetailResponse.tipDate) && Intrinsics.e(this.rating, orderDetailResponse.rating) && this.isMfc == orderDetailResponse.isMfc && Intrinsics.e(this.created, orderDetailResponse.created) && Intrinsics.e(this.captureAuthCode, orderDetailResponse.captureAuthCode) && Intrinsics.e(this.orderStatus, orderDetailResponse.orderStatus) && Intrinsics.e(this.statusDisplay, orderDetailResponse.statusDisplay) && this.guestCustomer == orderDetailResponse.guestCustomer && Intrinsics.e(this.deliveryStatus, orderDetailResponse.deliveryStatus) && Intrinsics.e(this.deliveryStatusDisplay, orderDetailResponse.deliveryStatusDisplay) && Intrinsics.e(this.unconsignedEntries, orderDetailResponse.unconsignedEntries) && Intrinsics.e(this.fulfillmentEligibility, orderDetailResponse.fulfillmentEligibility) && Intrinsics.e(this.partnerEligibility, orderDetailResponse.partnerEligibility) && Intrinsics.e(this.ebtEligibleTotal, orderDetailResponse.ebtEligibleTotal) && Intrinsics.e(this.ebtNonEligibleTotal, orderDetailResponse.ebtNonEligibleTotal) && Intrinsics.e(this.ebtCapturedBalance, orderDetailResponse.ebtCapturedBalance) && Intrinsics.e(this.rtsCapturedBalance, orderDetailResponse.rtsCapturedBalance) && Intrinsics.e(this.ebtSurchargePrice, orderDetailResponse.ebtSurchargePrice) && Intrinsics.e(this.ebtEditOrderDetailInfoResponse, orderDetailResponse.ebtEditOrderDetailInfoResponse) && Intrinsics.e(this.multiTenderPaymentInfo, orderDetailResponse.multiTenderPaymentInfo) && this.cancellable == orderDetailResponse.cancellable && this.returnable == orderDetailResponse.returnable && Intrinsics.e(this.timeZone, orderDetailResponse.timeZone) && Intrinsics.e(this.rtsCartId, orderDetailResponse.rtsCartId) && Intrinsics.e(this.totalTaxValues, orderDetailResponse.totalTaxValues) && Intrinsics.e(this.lightningCartReward, orderDetailResponse.lightningCartReward) && Intrinsics.e(this.pickUpPerson, orderDetailResponse.pickUpPerson) && Intrinsics.e(this.tipAuthCode, orderDetailResponse.tipAuthCode) && Intrinsics.e(this.unfulfilledEntries, orderDetailResponse.unfulfilledEntries) && Intrinsics.e(this.statusUpdateReason, orderDetailResponse.statusUpdateReason) && Intrinsics.e(this.tipAndRateDetailsResponse, orderDetailResponse.tipAndRateDetailsResponse) && Intrinsics.e(this.tenders, orderDetailResponse.tenders);
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expirationTime;
        int iHashCode4 = (((((((((((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.net)) * 31) + this.itemsTotal.hashCode()) * 31) + this.totalCosts.hashCode()) * 31) + this.totalPriceWithTax.hashCode()) * 31) + this.totalPrice.hashCode()) * 31) + this.totalTax.hashCode()) * 31) + this.subTotal.hashCode()) * 31) + this.subTotalWithoutQuoteDiscounts.hashCode()) * 31;
        HybrisPrice hybrisPrice = this.creditTransactionAmount;
        int iHashCode5 = (((iHashCode4 + (hybrisPrice == null ? 0 : hybrisPrice.hashCode())) * 31) + this.deliveryCost.hashCode()) * 31;
        HybrisPrice hybrisPrice2 = this.extendedDeliveryCost;
        int iHashCode6 = (((((iHashCode5 + (hybrisPrice2 == null ? 0 : hybrisPrice2.hashCode())) * 31) + this.entries.hashCode()) * 31) + Integer.hashCode(this.totalItems)) * 31;
        HybrisDeliveryMode hybrisDeliveryMode = this.deliveryMode;
        int iHashCode7 = (iHashCode6 + (hybrisDeliveryMode == null ? 0 : hybrisDeliveryMode.hashCode())) * 31;
        HybrisCustomerAddress hybrisCustomerAddress = this.deliveryAddress;
        int iHashCode8 = (iHashCode7 + (hybrisCustomerAddress == null ? 0 : hybrisCustomerAddress.hashCode())) * 31;
        PaymentDetails paymentDetails = this.paymentInfo;
        int iHashCode9 = (((((((((((((((((((((iHashCode8 + (paymentDetails == null ? 0 : paymentDetails.hashCode())) * 31) + this.appliedOrderPromotions.hashCode()) * 31) + this.appliedProductPromotions.hashCode()) * 31) + this.productDiscounts.hashCode()) * 31) + this.orderDiscounts.hashCode()) * 31) + this.quoteDiscounts.hashCode()) * 31) + Double.hashCode(this.quoteDiscountsRate)) * 31) + this.quoteDiscountsType.hashCode()) * 31) + this.totalDiscounts.hashCode()) * 31) + this.totalSavings.hashCode()) * 31) + this.totalDiscountsWithQuoteDiscounts.hashCode()) * 31;
        HybrisPrice hybrisPrice3 = this.subTotalWithDiscounts;
        int iHashCode10 = (((((((((((iHashCode9 + (hybrisPrice3 == null ? 0 : hybrisPrice3.hashCode())) * 31) + this.site.hashCode()) * 31) + this.store.hashCode()) * 31) + this.couponsSavings.hashCode()) * 31) + this.mperksSavings.hashCode()) * 31) + this.specialsSavings.hashCode()) * 31;
        String str4 = this.statusUpdateTimestamp;
        int iHashCode11 = (((((((((iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.teamMemberSavings.hashCode()) * 31) + this.guid.hashCode()) * 31) + Boolean.hashCode(this.calculated)) * 31) + this.appliedVouchers.hashCode()) * 31;
        HybrisPrincipal hybrisPrincipal = this.user;
        int iHashCode12 = (((((((((((((((((iHashCode11 + (hybrisPrincipal == null ? 0 : hybrisPrincipal.hashCode())) * 31) + this.pickupOrderGroups.hashCode()) * 31) + this.deliveryOrderGroups.hashCode()) * 31) + Integer.hashCode(this.pickupItemsQuantity)) * 31) + Integer.hashCode(this.deliveryItemsQuantity)) * 31) + Integer.hashCode(this.totalUnitCount)) * 31) + this.orderPrices.hashCode()) * 31) + this.merchantCustomerId.hashCode()) * 31) + this.depositPrice.hashCode()) * 31;
        HybrisPointOfService hybrisPointOfService = this.pointOfService;
        int iHashCode13 = (iHashCode12 + (hybrisPointOfService == null ? 0 : hybrisPointOfService.hashCode())) * 31;
        HybrisSubstitutePreference hybrisSubstitutePreference = this.substitutePreference;
        int iHashCode14 = (((((((iHashCode13 + (hybrisSubstitutePreference == null ? 0 : hybrisSubstitutePreference.hashCode())) * 31) + Boolean.hashCode(this.phoneNumberTextable)) * 31) + this.pickUpSlotInfo.hashCode()) * 31) + this.originalPickUpSlotInfo.hashCode()) * 31;
        String str5 = this.vehicleDescription;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.validAgeAcknowledgementTime;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        CustomerDataResponse customerDataResponse = this.customerData;
        int iHashCode17 = (((iHashCode16 + (customerDataResponse == null ? 0 : customerDataResponse.hashCode())) * 31) + Boolean.hashCode(this.editable)) * 31;
        String str7 = this.originalOrderId;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.orderNotes;
        int iHashCode19 = (((((iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31) + Boolean.hashCode(this.tippablePartner)) * 31) + Boolean.hashCode(this.tippedAndRated)) * 31;
        HybrisShopperInfo hybrisShopperInfo = this.shopperInfo;
        int iHashCode20 = (((iHashCode19 + (hybrisShopperInfo == null ? 0 : hybrisShopperInfo.hashCode())) * 31) + this.convenienceFee.hashCode()) * 31;
        String str9 = this.deliveryNote;
        int iHashCode21 = (((iHashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31) + Boolean.hashCode(this.earlyDelivery)) * 31;
        HybrisTipAmount hybrisTipAmount = this.tipAmount;
        int iHashCode22 = (iHashCode21 + (hybrisTipAmount == null ? 0 : hybrisTipAmount.hashCode())) * 31;
        String str10 = this.tipCode;
        int iHashCode23 = (iHashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tipDate;
        int iHashCode24 = (iHashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.rating;
        int iHashCode25 = (((iHashCode24 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isMfc)) * 31;
        String str12 = this.created;
        int iHashCode26 = (iHashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.captureAuthCode;
        int iHashCode27 = (((((((iHashCode26 + (str13 == null ? 0 : str13.hashCode())) * 31) + this.orderStatus.hashCode()) * 31) + this.statusDisplay.hashCode()) * 31) + Boolean.hashCode(this.guestCustomer)) * 31;
        String str14 = this.deliveryStatus;
        int iHashCode28 = (iHashCode27 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.deliveryStatusDisplay;
        int iHashCode29 = (((iHashCode28 + (str15 == null ? 0 : str15.hashCode())) * 31) + this.unconsignedEntries.hashCode()) * 31;
        String str16 = this.fulfillmentEligibility;
        int iHashCode30 = (iHashCode29 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.partnerEligibility;
        int iHashCode31 = (((((((iHashCode30 + (str17 == null ? 0 : str17.hashCode())) * 31) + this.ebtEligibleTotal.hashCode()) * 31) + this.ebtNonEligibleTotal.hashCode()) * 31) + this.ebtCapturedBalance.hashCode()) * 31;
        HybrisPrice hybrisPrice4 = this.rtsCapturedBalance;
        int iHashCode32 = (((iHashCode31 + (hybrisPrice4 == null ? 0 : hybrisPrice4.hashCode())) * 31) + this.ebtSurchargePrice.hashCode()) * 31;
        List<EbtTransactionResponse> list = this.ebtEditOrderDetailInfoResponse;
        int iHashCode33 = (iHashCode32 + (list == null ? 0 : list.hashCode())) * 31;
        MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponse = this.multiTenderPaymentInfo;
        int iHashCode34 = (((((((((((iHashCode33 + (multiTenderPaymentInfoResponse == null ? 0 : multiTenderPaymentInfoResponse.hashCode())) * 31) + Boolean.hashCode(this.cancellable)) * 31) + Boolean.hashCode(this.returnable)) * 31) + this.timeZone.hashCode()) * 31) + this.rtsCartId.hashCode()) * 31) + this.totalTaxValues.hashCode()) * 31;
        List<HybrisLightningCartReward> list2 = this.lightningCartReward;
        int iHashCode35 = (iHashCode34 + (list2 == null ? 0 : list2.hashCode())) * 31;
        HybrisPickupPerson hybrisPickupPerson = this.pickUpPerson;
        int iHashCode36 = (iHashCode35 + (hybrisPickupPerson == null ? 0 : hybrisPickupPerson.hashCode())) * 31;
        String str18 = this.tipAuthCode;
        int iHashCode37 = (((iHashCode36 + (str18 == null ? 0 : str18.hashCode())) * 31) + this.unfulfilledEntries.hashCode()) * 31;
        String str19 = this.statusUpdateReason;
        int iHashCode38 = (((iHashCode37 + (str19 == null ? 0 : str19.hashCode())) * 31) + this.tipAndRateDetailsResponse.hashCode()) * 31;
        List<TenderResponse> list3 = this.tenders;
        return iHashCode38 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "OrderDetailResponse(code=" + this.code + ", name=" + this.name + ", description=" + this.description + ", expirationTime=" + this.expirationTime + ", net=" + this.net + ", itemsTotal=" + this.itemsTotal + ", totalCosts=" + this.totalCosts + ", totalPriceWithTax=" + this.totalPriceWithTax + ", totalPrice=" + this.totalPrice + ", totalTax=" + this.totalTax + ", subTotal=" + this.subTotal + ", subTotalWithoutQuoteDiscounts=" + this.subTotalWithoutQuoteDiscounts + ", creditTransactionAmount=" + this.creditTransactionAmount + ", deliveryCost=" + this.deliveryCost + ", extendedDeliveryCost=" + this.extendedDeliveryCost + ", entries=" + this.entries + ", totalItems=" + this.totalItems + ", deliveryMode=" + this.deliveryMode + ", deliveryAddress=" + this.deliveryAddress + ", paymentInfo=" + this.paymentInfo + ", appliedOrderPromotions=" + this.appliedOrderPromotions + ", appliedProductPromotions=" + this.appliedProductPromotions + ", productDiscounts=" + this.productDiscounts + ", orderDiscounts=" + this.orderDiscounts + ", quoteDiscounts=" + this.quoteDiscounts + ", quoteDiscountsRate=" + this.quoteDiscountsRate + ", quoteDiscountsType=" + this.quoteDiscountsType + ", totalDiscounts=" + this.totalDiscounts + ", totalSavings=" + this.totalSavings + ", totalDiscountsWithQuoteDiscounts=" + this.totalDiscountsWithQuoteDiscounts + ", subTotalWithDiscounts=" + this.subTotalWithDiscounts + ", site=" + this.site + ", store=" + this.store + ", couponsSavings=" + this.couponsSavings + ", mperksSavings=" + this.mperksSavings + ", specialsSavings=" + this.specialsSavings + ", statusUpdateTimestamp=" + this.statusUpdateTimestamp + ", teamMemberSavings=" + this.teamMemberSavings + ", guid=" + this.guid + ", calculated=" + this.calculated + ", appliedVouchers=" + this.appliedVouchers + ", user=" + this.user + ", pickupOrderGroups=" + this.pickupOrderGroups + ", deliveryOrderGroups=" + this.deliveryOrderGroups + ", pickupItemsQuantity=" + this.pickupItemsQuantity + ", deliveryItemsQuantity=" + this.deliveryItemsQuantity + ", totalUnitCount=" + this.totalUnitCount + ", orderPrices=" + this.orderPrices + ", merchantCustomerId=" + this.merchantCustomerId + ", depositPrice=" + this.depositPrice + ", pointOfService=" + this.pointOfService + ", substitutePreference=" + this.substitutePreference + ", phoneNumberTextable=" + this.phoneNumberTextable + ", pickUpSlotInfo=" + this.pickUpSlotInfo + ", originalPickUpSlotInfo=" + this.originalPickUpSlotInfo + ", vehicleDescription=" + this.vehicleDescription + ", validAgeAcknowledgementTime=" + this.validAgeAcknowledgementTime + ", customerData=" + this.customerData + ", editable=" + this.editable + ", originalOrderId=" + this.originalOrderId + ", orderNotes=" + this.orderNotes + ", tippablePartner=" + this.tippablePartner + ", tippedAndRated=" + this.tippedAndRated + ", shopperInfo=" + this.shopperInfo + ", convenienceFee=" + this.convenienceFee + ", deliveryNote=" + this.deliveryNote + ", earlyDelivery=" + this.earlyDelivery + ", tipAmount=" + this.tipAmount + ", tipCode=" + this.tipCode + ", tipDate=" + this.tipDate + ", rating=" + this.rating + ", isMfc=" + this.isMfc + ", created=" + this.created + ", captureAuthCode=" + this.captureAuthCode + ", orderStatus=" + this.orderStatus + ", statusDisplay=" + this.statusDisplay + ", guestCustomer=" + this.guestCustomer + ", deliveryStatus=" + this.deliveryStatus + ", deliveryStatusDisplay=" + this.deliveryStatusDisplay + ", unconsignedEntries=" + this.unconsignedEntries + ", fulfillmentEligibility=" + this.fulfillmentEligibility + ", partnerEligibility=" + this.partnerEligibility + ", ebtEligibleTotal=" + this.ebtEligibleTotal + ", ebtNonEligibleTotal=" + this.ebtNonEligibleTotal + ", ebtCapturedBalance=" + this.ebtCapturedBalance + ", rtsCapturedBalance=" + this.rtsCapturedBalance + ", ebtSurchargePrice=" + this.ebtSurchargePrice + ", ebtEditOrderDetailInfoResponse=" + this.ebtEditOrderDetailInfoResponse + ", multiTenderPaymentInfo=" + this.multiTenderPaymentInfo + ", cancellable=" + this.cancellable + ", returnable=" + this.returnable + ", timeZone=" + this.timeZone + ", rtsCartId=" + this.rtsCartId + ", totalTaxValues=" + this.totalTaxValues + ", lightningCartReward=" + this.lightningCartReward + ", pickUpPerson=" + this.pickUpPerson + ", tipAuthCode=" + this.tipAuthCode + ", unfulfilledEntries=" + this.unfulfilledEntries + ", statusUpdateReason=" + this.statusUpdateReason + ", tipAndRateDetailsResponse=" + this.tipAndRateDetailsResponse + ", tenders=" + this.tenders + ')';
    }

    public OrderDetailResponse(@g(name = "code") String code, @g(name = "name") String str, @g(name = "description") String str2, @g(name = "expirationTime") String str3, @g(name = "net") @Stringable boolean z10, @g(name = "itemsTotal") HybrisPrice itemsTotal, @g(name = "totalCosts") HybrisPrice totalCosts, @g(name = "totalPriceWithTax") HybrisPrice totalPriceWithTax, @g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "totalTax") HybrisPrice totalTax, @g(name = "subTotal") HybrisPrice subTotal, @g(name = "subTotalWithoutQuoteDiscounts") HybrisPrice subTotalWithoutQuoteDiscounts, @g(name = "creditTransactionAmount") HybrisPrice hybrisPrice, @g(name = "deliveryCost") HybrisPrice deliveryCost, @g(name = "extendedDeliveryCost") HybrisPrice hybrisPrice2, @g(name = "entries") @SkipBadElements List<EntryJson> entries, @g(name = "totalItems") int i10, @g(name = "deliveryMode") HybrisDeliveryMode hybrisDeliveryMode, @g(name = "deliveryAddress") HybrisCustomerAddress hybrisCustomerAddress, @g(name = "paymentInfo") PaymentDetails paymentDetails, @g(name = "appliedOrderPromotions") List<HybrisPromotionResult> appliedOrderPromotions, @g(name = "appliedProductPromotions") List<HybrisPromotionResult> appliedProductPromotions, @g(name = "productDiscounts") HybrisPrice productDiscounts, @g(name = "orderDiscounts") HybrisPrice orderDiscounts, @g(name = "quoteDiscounts") HybrisPrice quoteDiscounts, @g(name = "quoteDiscountsRate") double d10, @g(name = "quoteDiscountsType") String quoteDiscountsType, @g(name = "totalDiscounts") HybrisPrice totalDiscounts, @g(name = "totalSavings") HybrisSavings totalSavings, @g(name = "totalDiscountsWithQuoteDiscounts") HybrisPrice totalDiscountsWithQuoteDiscounts, @g(name = "subTotalWithDiscounts") HybrisPrice hybrisPrice3, @g(name = "site") String site, @g(name = PlaceTypes.STORE) String store, @g(name = "couponsSavings") HybrisSavings couponsSavings, @g(name = "mperksSavings") HybrisSavings mperksSavings, @g(name = "specialsSavings") HybrisSavings specialsSavings, @g(name = "statusUpdateTimestamp") String str4, @g(name = "teamMemberSavings") HybrisSavings teamMemberSavings, @g(name = "guid") String guid, @g(name = "calculated") boolean z11, @g(name = "appliedVouchers") List<HybrisVoucher> appliedVouchers, @g(name = "user") HybrisPrincipal hybrisPrincipal, @g(name = "pickupOrderGroups") List<PickupOrderGroup> pickupOrderGroups, @g(name = "deliveryOrderGroups") List<DeliveryOrderGroup> deliveryOrderGroups, @g(name = "pickupItemsQuantity") int i11, @g(name = "deliveryItemsQuantity") int i12, @g(name = "totalUnitCount") int i13, @g(name = "orderPrices") List<HybrisOrderPrice> orderPrices, @g(name = "merchantCustomerId") String merchantCustomerId, @g(name = "depositPrice") HybrisPrice depositPrice, @g(name = "pointOfService") HybrisPointOfService hybrisPointOfService, @g(name = "substitutePreference") HybrisSubstitutePreference hybrisSubstitutePreference, @g(name = "phoneNumberTextable") boolean z12, @g(name = "pickUpSlotInfo") HybrisPickupSlotInfo pickUpSlotInfo, @g(name = "originalPickUpSlotInfo") HybrisPickupSlotInfo originalPickUpSlotInfo, @g(name = "vehicleDescription") String str5, @g(name = "validAgeAcknowledgementTime") String str6, @g(name = "customerData") CustomerDataResponse customerDataResponse, @g(name = "editable") boolean z13, @g(name = "originalOrderId") String str7, @g(name = "orderNotes") String str8, @g(name = "tippablePartner") boolean z14, @g(name = "tippedAndRated") boolean z15, @g(name = "shopperInfo") HybrisShopperInfo hybrisShopperInfo, @g(name = "convenienceFee") HybrisPrice convenienceFee, @g(name = "deliveryNote") String str9, @g(name = "earlyDelivery") boolean z16, @g(name = "tipAmount") HybrisTipAmount hybrisTipAmount, @g(name = "tipCode") String str10, @g(name = "tipDate") String str11, @g(name = "rating") Integer num, @g(name = "isMfc") boolean z17, @g(name = "created") String str12, @g(name = "captureAuthCode") String str13, @g(name = "status") String orderStatus, @g(name = "statusDisplay") String statusDisplay, @g(name = "guestCustomer") @Stringable boolean z18, @g(name = "deliveryStatus") String str14, @g(name = "deliveryStatusDisplay") String str15, @g(name = "unconsignedEntries") @SkipBadElements List<OrderEntryJson> unconsignedEntries, @g(name = "fulfillmentEligibility") String str16, @g(name = "partnerEligibility") String str17, @g(name = "ebtEligibleTotal") HybrisPrice ebtEligibleTotal, @g(name = "ebtNonEligibleTotal") HybrisPrice ebtNonEligibleTotal, @g(name = "ebtCapturedBalance") HybrisPrice ebtCapturedBalance, @g(name = "rtsCapturedBalance") HybrisPrice hybrisPrice4, @g(name = "ebtSurchargePrice") HybrisPrice ebtSurchargePrice, @g(name = "ebtEditOrderDetailInfo") List<EbtTransactionResponse> list, @g(name = "multiTenderPaymentInfo") MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponse, @g(name = "cancellable") boolean z19, @g(name = "returnable") boolean z20, @g(name = "timeZone") String timeZone, @g(name = "rtsCartId") String rtsCartId, @g(name = "totalTaxValues") List<HybrisTotalTaxValue> totalTaxValues, @g(name = "lightningCartReward") List<HybrisLightningCartReward> list2, @g(name = "pickUpPerson") HybrisPickupPerson hybrisPickupPerson, @g(name = "tipAuthCode") String str18, @g(name = "unfulfilledEntries") @SkipBadElements List<EntryJson> unfulfilledEntries, @g(name = "statusUpdateReason") String str19, @g(name = "tipAndRateDetails") TipAndRateDetailsResponse tipAndRateDetailsResponse, @g(name = "tenders") List<TenderResponse> list3) {
        Intrinsics.j(code, "code");
        Intrinsics.j(itemsTotal, "itemsTotal");
        Intrinsics.j(totalCosts, "totalCosts");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(subTotalWithoutQuoteDiscounts, "subTotalWithoutQuoteDiscounts");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(entries, "entries");
        Intrinsics.j(appliedOrderPromotions, "appliedOrderPromotions");
        Intrinsics.j(appliedProductPromotions, "appliedProductPromotions");
        Intrinsics.j(productDiscounts, "productDiscounts");
        Intrinsics.j(orderDiscounts, "orderDiscounts");
        Intrinsics.j(quoteDiscounts, "quoteDiscounts");
        Intrinsics.j(quoteDiscountsType, "quoteDiscountsType");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(totalSavings, "totalSavings");
        Intrinsics.j(totalDiscountsWithQuoteDiscounts, "totalDiscountsWithQuoteDiscounts");
        Intrinsics.j(site, "site");
        Intrinsics.j(store, "store");
        Intrinsics.j(couponsSavings, "couponsSavings");
        Intrinsics.j(mperksSavings, "mperksSavings");
        Intrinsics.j(specialsSavings, "specialsSavings");
        Intrinsics.j(teamMemberSavings, "teamMemberSavings");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(appliedVouchers, "appliedVouchers");
        Intrinsics.j(pickupOrderGroups, "pickupOrderGroups");
        Intrinsics.j(deliveryOrderGroups, "deliveryOrderGroups");
        Intrinsics.j(orderPrices, "orderPrices");
        Intrinsics.j(merchantCustomerId, "merchantCustomerId");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(pickUpSlotInfo, "pickUpSlotInfo");
        Intrinsics.j(originalPickUpSlotInfo, "originalPickUpSlotInfo");
        Intrinsics.j(convenienceFee, "convenienceFee");
        Intrinsics.j(orderStatus, "orderStatus");
        Intrinsics.j(statusDisplay, "statusDisplay");
        Intrinsics.j(unconsignedEntries, "unconsignedEntries");
        Intrinsics.j(ebtEligibleTotal, "ebtEligibleTotal");
        Intrinsics.j(ebtNonEligibleTotal, "ebtNonEligibleTotal");
        Intrinsics.j(ebtCapturedBalance, "ebtCapturedBalance");
        Intrinsics.j(ebtSurchargePrice, "ebtSurchargePrice");
        Intrinsics.j(timeZone, "timeZone");
        Intrinsics.j(rtsCartId, "rtsCartId");
        Intrinsics.j(totalTaxValues, "totalTaxValues");
        Intrinsics.j(unfulfilledEntries, "unfulfilledEntries");
        Intrinsics.j(tipAndRateDetailsResponse, "tipAndRateDetailsResponse");
        this.code = code;
        this.name = str;
        this.description = str2;
        this.expirationTime = str3;
        this.net = z10;
        this.itemsTotal = itemsTotal;
        this.totalCosts = totalCosts;
        this.totalPriceWithTax = totalPriceWithTax;
        this.totalPrice = totalPrice;
        this.totalTax = totalTax;
        this.subTotal = subTotal;
        this.subTotalWithoutQuoteDiscounts = subTotalWithoutQuoteDiscounts;
        this.creditTransactionAmount = hybrisPrice;
        this.deliveryCost = deliveryCost;
        this.extendedDeliveryCost = hybrisPrice2;
        this.entries = entries;
        this.totalItems = i10;
        this.deliveryMode = hybrisDeliveryMode;
        this.deliveryAddress = hybrisCustomerAddress;
        this.paymentInfo = paymentDetails;
        this.appliedOrderPromotions = appliedOrderPromotions;
        this.appliedProductPromotions = appliedProductPromotions;
        this.productDiscounts = productDiscounts;
        this.orderDiscounts = orderDiscounts;
        this.quoteDiscounts = quoteDiscounts;
        this.quoteDiscountsRate = d10;
        this.quoteDiscountsType = quoteDiscountsType;
        this.totalDiscounts = totalDiscounts;
        this.totalSavings = totalSavings;
        this.totalDiscountsWithQuoteDiscounts = totalDiscountsWithQuoteDiscounts;
        this.subTotalWithDiscounts = hybrisPrice3;
        this.site = site;
        this.store = store;
        this.couponsSavings = couponsSavings;
        this.mperksSavings = mperksSavings;
        this.specialsSavings = specialsSavings;
        this.statusUpdateTimestamp = str4;
        this.teamMemberSavings = teamMemberSavings;
        this.guid = guid;
        this.calculated = z11;
        this.appliedVouchers = appliedVouchers;
        this.user = hybrisPrincipal;
        this.pickupOrderGroups = pickupOrderGroups;
        this.deliveryOrderGroups = deliveryOrderGroups;
        this.pickupItemsQuantity = i11;
        this.deliveryItemsQuantity = i12;
        this.totalUnitCount = i13;
        this.orderPrices = orderPrices;
        this.merchantCustomerId = merchantCustomerId;
        this.depositPrice = depositPrice;
        this.pointOfService = hybrisPointOfService;
        this.substitutePreference = hybrisSubstitutePreference;
        this.phoneNumberTextable = z12;
        this.pickUpSlotInfo = pickUpSlotInfo;
        this.originalPickUpSlotInfo = originalPickUpSlotInfo;
        this.vehicleDescription = str5;
        this.validAgeAcknowledgementTime = str6;
        this.customerData = customerDataResponse;
        this.editable = z13;
        this.originalOrderId = str7;
        this.orderNotes = str8;
        this.tippablePartner = z14;
        this.tippedAndRated = z15;
        this.shopperInfo = hybrisShopperInfo;
        this.convenienceFee = convenienceFee;
        this.deliveryNote = str9;
        this.earlyDelivery = z16;
        this.tipAmount = hybrisTipAmount;
        this.tipCode = str10;
        this.tipDate = str11;
        this.rating = num;
        this.isMfc = z17;
        this.created = str12;
        this.captureAuthCode = str13;
        this.orderStatus = orderStatus;
        this.statusDisplay = statusDisplay;
        this.guestCustomer = z18;
        this.deliveryStatus = str14;
        this.deliveryStatusDisplay = str15;
        this.unconsignedEntries = unconsignedEntries;
        this.fulfillmentEligibility = str16;
        this.partnerEligibility = str17;
        this.ebtEligibleTotal = ebtEligibleTotal;
        this.ebtNonEligibleTotal = ebtNonEligibleTotal;
        this.ebtCapturedBalance = ebtCapturedBalance;
        this.rtsCapturedBalance = hybrisPrice4;
        this.ebtSurchargePrice = ebtSurchargePrice;
        this.ebtEditOrderDetailInfoResponse = list;
        this.multiTenderPaymentInfo = multiTenderPaymentInfoResponse;
        this.cancellable = z19;
        this.returnable = z20;
        this.timeZone = timeZone;
        this.rtsCartId = rtsCartId;
        this.totalTaxValues = totalTaxValues;
        this.lightningCartReward = list2;
        this.pickUpPerson = hybrisPickupPerson;
        this.tipAuthCode = str18;
        this.unfulfilledEntries = unfulfilledEntries;
        this.statusUpdateReason = str19;
        this.tipAndRateDetailsResponse = tipAndRateDetailsResponse;
        this.tenders = list3;
    }

    /* renamed from: A, reason: from getter */
    public final HybrisPrice getEbtNonEligibleTotal() {
        return this.ebtNonEligibleTotal;
    }

    /* renamed from: A0, reason: from getter */
    public final HybrisTipAmount getTipAmount() {
        return this.tipAmount;
    }

    /* renamed from: B, reason: from getter */
    public final HybrisPrice getEbtSurchargePrice() {
        return this.ebtSurchargePrice;
    }

    /* renamed from: B0, reason: from getter */
    public final TipAndRateDetailsResponse getTipAndRateDetailsResponse() {
        return this.tipAndRateDetailsResponse;
    }

    /* renamed from: C, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    /* renamed from: C0, reason: from getter */
    public final String getTipAuthCode() {
        return this.tipAuthCode;
    }

    public final List<EntryJson> D() {
        return this.entries;
    }

    /* renamed from: D0, reason: from getter */
    public final String getTipCode() {
        return this.tipCode;
    }

    /* renamed from: E, reason: from getter */
    public final String getExpirationTime() {
        return this.expirationTime;
    }

    /* renamed from: E0, reason: from getter */
    public final String getTipDate() {
        return this.tipDate;
    }

    /* renamed from: F, reason: from getter */
    public final HybrisPrice getExtendedDeliveryCost() {
        return this.extendedDeliveryCost;
    }

    /* renamed from: F0, reason: from getter */
    public final boolean getTippablePartner() {
        return this.tippablePartner;
    }

    /* renamed from: G, reason: from getter */
    public final String getFulfillmentEligibility() {
        return this.fulfillmentEligibility;
    }

    /* renamed from: G0, reason: from getter */
    public final boolean getTippedAndRated() {
        return this.tippedAndRated;
    }

    /* renamed from: H, reason: from getter */
    public final boolean getGuestCustomer() {
        return this.guestCustomer;
    }

    /* renamed from: H0, reason: from getter */
    public final HybrisPrice getTotalCosts() {
        return this.totalCosts;
    }

    /* renamed from: I, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: I0, reason: from getter */
    public final HybrisPrice getTotalDiscounts() {
        return this.totalDiscounts;
    }

    /* renamed from: J, reason: from getter */
    public final HybrisPrice getItemsTotal() {
        return this.itemsTotal;
    }

    /* renamed from: J0, reason: from getter */
    public final HybrisPrice getTotalDiscountsWithQuoteDiscounts() {
        return this.totalDiscountsWithQuoteDiscounts;
    }

    public final List<HybrisLightningCartReward> K() {
        return this.lightningCartReward;
    }

    /* renamed from: K0, reason: from getter */
    public final int getTotalItems() {
        return this.totalItems;
    }

    /* renamed from: L, reason: from getter */
    public final String getMerchantCustomerId() {
        return this.merchantCustomerId;
    }

    /* renamed from: L0, reason: from getter */
    public final HybrisPrice getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: M, reason: from getter */
    public final HybrisSavings getMperksSavings() {
        return this.mperksSavings;
    }

    /* renamed from: M0, reason: from getter */
    public final HybrisPrice getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    /* renamed from: N, reason: from getter */
    public final MultiTenderPaymentInfoResponse getMultiTenderPaymentInfo() {
        return this.multiTenderPaymentInfo;
    }

    /* renamed from: N0, reason: from getter */
    public final HybrisSavings getTotalSavings() {
        return this.totalSavings;
    }

    /* renamed from: O, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: O0, reason: from getter */
    public final HybrisPrice getTotalTax() {
        return this.totalTax;
    }

    /* renamed from: P, reason: from getter */
    public final boolean getNet() {
        return this.net;
    }

    public final List<HybrisTotalTaxValue> P0() {
        return this.totalTaxValues;
    }

    /* renamed from: Q, reason: from getter */
    public final HybrisPrice getOrderDiscounts() {
        return this.orderDiscounts;
    }

    /* renamed from: Q0, reason: from getter */
    public final int getTotalUnitCount() {
        return this.totalUnitCount;
    }

    /* renamed from: R, reason: from getter */
    public final String getOrderNotes() {
        return this.orderNotes;
    }

    public final List<OrderEntryJson> R0() {
        return this.unconsignedEntries;
    }

    public final List<HybrisOrderPrice> S() {
        return this.orderPrices;
    }

    public final List<EntryJson> S0() {
        return this.unfulfilledEntries;
    }

    /* renamed from: T, reason: from getter */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: T0, reason: from getter */
    public final HybrisPrincipal getUser() {
        return this.user;
    }

    /* renamed from: U, reason: from getter */
    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    /* renamed from: U0, reason: from getter */
    public final String getValidAgeAcknowledgementTime() {
        return this.validAgeAcknowledgementTime;
    }

    /* renamed from: V, reason: from getter */
    public final HybrisPickupSlotInfo getOriginalPickUpSlotInfo() {
        return this.originalPickUpSlotInfo;
    }

    /* renamed from: V0, reason: from getter */
    public final String getVehicleDescription() {
        return this.vehicleDescription;
    }

    /* renamed from: W, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: W0, reason: from getter */
    public final boolean getIsMfc() {
        return this.isMfc;
    }

    /* renamed from: X, reason: from getter */
    public final PaymentDetails getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: Y, reason: from getter */
    public final boolean getPhoneNumberTextable() {
        return this.phoneNumberTextable;
    }

    /* renamed from: Z, reason: from getter */
    public final HybrisPickupPerson getPickUpPerson() {
        return this.pickUpPerson;
    }

    public final List<HybrisPromotionResult> a() {
        return this.appliedOrderPromotions;
    }

    /* renamed from: a0, reason: from getter */
    public final HybrisPickupSlotInfo getPickUpSlotInfo() {
        return this.pickUpSlotInfo;
    }

    public final List<HybrisPromotionResult> b() {
        return this.appliedProductPromotions;
    }

    /* renamed from: b0, reason: from getter */
    public final int getPickupItemsQuantity() {
        return this.pickupItemsQuantity;
    }

    public final List<HybrisVoucher> c() {
        return this.appliedVouchers;
    }

    public final List<PickupOrderGroup> c0() {
        return this.pickupOrderGroups;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getCalculated() {
        return this.calculated;
    }

    /* renamed from: d0, reason: from getter */
    public final HybrisPointOfService getPointOfService() {
        return this.pointOfService;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getCancellable() {
        return this.cancellable;
    }

    /* renamed from: e0, reason: from getter */
    public final HybrisPrice getProductDiscounts() {
        return this.productDiscounts;
    }

    /* renamed from: f, reason: from getter */
    public final String getCaptureAuthCode() {
        return this.captureAuthCode;
    }

    /* renamed from: f0, reason: from getter */
    public final HybrisPrice getQuoteDiscounts() {
        return this.quoteDiscounts;
    }

    /* renamed from: g, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: g0, reason: from getter */
    public final double getQuoteDiscountsRate() {
        return this.quoteDiscountsRate;
    }

    /* renamed from: h, reason: from getter */
    public final HybrisPrice getConvenienceFee() {
        return this.convenienceFee;
    }

    /* renamed from: h0, reason: from getter */
    public final String getQuoteDiscountsType() {
        return this.quoteDiscountsType;
    }

    /* renamed from: i, reason: from getter */
    public final HybrisSavings getCouponsSavings() {
        return this.couponsSavings;
    }

    /* renamed from: i0, reason: from getter */
    public final Integer getRating() {
        return this.rating;
    }

    /* renamed from: j, reason: from getter */
    public final String getCreated() {
        return this.created;
    }

    /* renamed from: j0, reason: from getter */
    public final boolean getReturnable() {
        return this.returnable;
    }

    /* renamed from: k, reason: from getter */
    public final HybrisPrice getCreditTransactionAmount() {
        return this.creditTransactionAmount;
    }

    /* renamed from: k0, reason: from getter */
    public final HybrisPrice getRtsCapturedBalance() {
        return this.rtsCapturedBalance;
    }

    /* renamed from: l, reason: from getter */
    public final CustomerDataResponse getCustomerData() {
        return this.customerData;
    }

    /* renamed from: l0, reason: from getter */
    public final String getRtsCartId() {
        return this.rtsCartId;
    }

    /* renamed from: m, reason: from getter */
    public final HybrisCustomerAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* renamed from: m0, reason: from getter */
    public final HybrisShopperInfo getShopperInfo() {
        return this.shopperInfo;
    }

    /* renamed from: n, reason: from getter */
    public final HybrisPrice getDeliveryCost() {
        return this.deliveryCost;
    }

    /* renamed from: n0, reason: from getter */
    public final String getSite() {
        return this.site;
    }

    /* renamed from: o, reason: from getter */
    public final int getDeliveryItemsQuantity() {
        return this.deliveryItemsQuantity;
    }

    /* renamed from: o0, reason: from getter */
    public final HybrisSavings getSpecialsSavings() {
        return this.specialsSavings;
    }

    /* renamed from: p, reason: from getter */
    public final HybrisDeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    /* renamed from: p0, reason: from getter */
    public final String getStatusDisplay() {
        return this.statusDisplay;
    }

    /* renamed from: q, reason: from getter */
    public final String getDeliveryNote() {
        return this.deliveryNote;
    }

    /* renamed from: q0, reason: from getter */
    public final String getStatusUpdateReason() {
        return this.statusUpdateReason;
    }

    public final List<DeliveryOrderGroup> r() {
        return this.deliveryOrderGroups;
    }

    /* renamed from: r0, reason: from getter */
    public final String getStatusUpdateTimestamp() {
        return this.statusUpdateTimestamp;
    }

    /* renamed from: s, reason: from getter */
    public final String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /* renamed from: s0, reason: from getter */
    public final String getStore() {
        return this.store;
    }

    /* renamed from: t, reason: from getter */
    public final String getDeliveryStatusDisplay() {
        return this.deliveryStatusDisplay;
    }

    /* renamed from: t0, reason: from getter */
    public final HybrisPrice getSubTotal() {
        return this.subTotal;
    }

    /* renamed from: u, reason: from getter */
    public final HybrisPrice getDepositPrice() {
        return this.depositPrice;
    }

    /* renamed from: u0, reason: from getter */
    public final HybrisPrice getSubTotalWithDiscounts() {
        return this.subTotalWithDiscounts;
    }

    /* renamed from: v, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: v0, reason: from getter */
    public final HybrisPrice getSubTotalWithoutQuoteDiscounts() {
        return this.subTotalWithoutQuoteDiscounts;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getEarlyDelivery() {
        return this.earlyDelivery;
    }

    /* renamed from: w0, reason: from getter */
    public final HybrisSubstitutePreference getSubstitutePreference() {
        return this.substitutePreference;
    }

    /* renamed from: x, reason: from getter */
    public final HybrisPrice getEbtCapturedBalance() {
        return this.ebtCapturedBalance;
    }

    /* renamed from: x0, reason: from getter */
    public final HybrisSavings getTeamMemberSavings() {
        return this.teamMemberSavings;
    }

    public final List<EbtTransactionResponse> y() {
        return this.ebtEditOrderDetailInfoResponse;
    }

    public final List<TenderResponse> y0() {
        return this.tenders;
    }

    /* renamed from: z, reason: from getter */
    public final HybrisPrice getEbtEligibleTotal() {
        return this.ebtEligibleTotal;
    }

    /* renamed from: z0, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderDetailResponse(String str, String str2, String str3, String str4, boolean z10, HybrisPrice hybrisPrice, HybrisPrice hybrisPrice2, HybrisPrice hybrisPrice3, HybrisPrice hybrisPrice4, HybrisPrice hybrisPrice5, HybrisPrice hybrisPrice6, HybrisPrice hybrisPrice7, HybrisPrice hybrisPrice8, HybrisPrice hybrisPrice9, HybrisPrice hybrisPrice10, List list, int i10, HybrisDeliveryMode hybrisDeliveryMode, HybrisCustomerAddress hybrisCustomerAddress, PaymentDetails paymentDetails, List list2, List list3, HybrisPrice hybrisPrice11, HybrisPrice hybrisPrice12, HybrisPrice hybrisPrice13, double d10, String str5, HybrisPrice hybrisPrice14, HybrisSavings hybrisSavings, HybrisPrice hybrisPrice15, HybrisPrice hybrisPrice16, String str6, String str7, HybrisSavings hybrisSavings2, HybrisSavings hybrisSavings3, HybrisSavings hybrisSavings4, String str8, HybrisSavings hybrisSavings5, String str9, boolean z11, List list4, HybrisPrincipal hybrisPrincipal, List list5, List list6, int i11, int i12, int i13, List list7, String str10, HybrisPrice hybrisPrice17, HybrisPointOfService hybrisPointOfService, HybrisSubstitutePreference hybrisSubstitutePreference, boolean z12, HybrisPickupSlotInfo hybrisPickupSlotInfo, HybrisPickupSlotInfo hybrisPickupSlotInfo2, String str11, String str12, CustomerDataResponse customerDataResponse, boolean z13, String str13, String str14, boolean z14, boolean z15, HybrisShopperInfo hybrisShopperInfo, HybrisPrice hybrisPrice18, String str15, boolean z16, HybrisTipAmount hybrisTipAmount, String str16, String str17, Integer num, boolean z17, String str18, String str19, String str20, String str21, boolean z18, String str22, String str23, List list8, String str24, String str25, HybrisPrice hybrisPrice19, HybrisPrice hybrisPrice20, HybrisPrice hybrisPrice21, HybrisPrice hybrisPrice22, HybrisPrice hybrisPrice23, List list9, MultiTenderPaymentInfoResponse multiTenderPaymentInfoResponse, boolean z19, boolean z20, String str26, String str27, List list10, List list11, HybrisPickupPerson hybrisPickupPerson, String str28, List list12, String str29, TipAndRateDetailsResponse tipAndRateDetailsResponse, List list13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        String str30 = (i14 & 1) != 0 ? "-1" : str;
        String str31 = (i14 & 2) != 0 ? null : str2;
        String str32 = (i14 & 4) != 0 ? null : str3;
        String str33 = (i14 & 8) != 0 ? null : str4;
        boolean z21 = (i14 & 16) != 0 ? false : z10;
        HybrisPrice hybrisPrice24 = (i14 & 32) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice;
        HybrisPrice hybrisPrice25 = (i14 & 64) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice2;
        HybrisPrice hybrisPrice26 = (i14 & 128) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice3;
        HybrisPrice hybrisPrice27 = (i14 & 256) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice4;
        HybrisPrice hybrisPrice28 = (i14 & 512) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice5;
        HybrisPrice hybrisPrice29 = (i14 & 1024) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice6;
        HybrisPrice hybrisPrice30 = (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice7;
        HybrisPrice hybrisPrice31 = (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : hybrisPrice8;
        String str34 = str30;
        HybrisPrice hybrisPrice32 = (i14 & 8192) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice9;
        HybrisPrice hybrisPrice33 = (i14 & 16384) != 0 ? null : hybrisPrice10;
        List listM = (i14 & 32768) != 0 ? CollectionsKt.m() : list;
        int i18 = (i14 & 65536) != 0 ? 0 : i10;
        HybrisDeliveryMode hybrisDeliveryMode2 = (i14 & 131072) != 0 ? null : hybrisDeliveryMode;
        HybrisCustomerAddress hybrisCustomerAddress2 = (i14 & 262144) != 0 ? null : hybrisCustomerAddress;
        PaymentDetails paymentDetails2 = (i14 & 524288) != 0 ? null : paymentDetails;
        List listM2 = (i14 & 1048576) != 0 ? CollectionsKt.m() : list2;
        List listM3 = (i14 & 2097152) != 0 ? CollectionsKt.m() : list3;
        HybrisPrice hybrisPrice34 = (i14 & 4194304) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice11;
        HybrisPrice hybrisPrice35 = (i14 & 8388608) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice12;
        HybrisPrice hybrisPrice36 = (i14 & 16777216) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice13;
        double d11 = (i14 & 33554432) != 0 ? 0.0d : d10;
        String str35 = (i14 & 67108864) != 0 ? "" : str5;
        HybrisPrice hybrisPrice37 = (i14 & 134217728) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice14;
        HybrisSavings hybrisSavings6 = (i14 & 268435456) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings;
        HybrisPrice hybrisPrice38 = (i14 & 536870912) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice15;
        HybrisPrice hybrisPrice39 = (i14 & 1073741824) != 0 ? null : hybrisPrice16;
        String str36 = (i14 & Integer.MIN_VALUE) != 0 ? "" : str6;
        this(str34, str31, str32, str33, z21, hybrisPrice24, hybrisPrice25, hybrisPrice26, hybrisPrice27, hybrisPrice28, hybrisPrice29, hybrisPrice30, hybrisPrice31, hybrisPrice32, hybrisPrice33, listM, i18, hybrisDeliveryMode2, hybrisCustomerAddress2, paymentDetails2, listM2, listM3, hybrisPrice34, hybrisPrice35, hybrisPrice36, d11, str35, hybrisPrice37, hybrisSavings6, hybrisPrice38, hybrisPrice39, str36, (i15 & 1) != 0 ? "" : str7, (i15 & 2) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings2, (i15 & 4) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings3, (i15 & 8) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings4, (i15 & 16) != 0 ? null : str8, (i15 & 32) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings5, (i15 & 64) != 0 ? "" : str9, (i15 & 128) != 0 ? false : z11, (i15 & 256) != 0 ? CollectionsKt.m() : list4, (i15 & 512) != 0 ? null : hybrisPrincipal, (i15 & 1024) != 0 ? CollectionsKt.m() : list5, (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? CollectionsKt.m() : list6, (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : i11, (i15 & 8192) != 0 ? 0 : i12, (i15 & 16384) != 0 ? 0 : i13, (i15 & 32768) != 0 ? CollectionsKt.m() : list7, (i15 & 65536) != 0 ? "" : str10, (i15 & 131072) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice17, (i15 & 262144) != 0 ? null : hybrisPointOfService, (i15 & 524288) != 0 ? null : hybrisSubstitutePreference, (i15 & 1048576) != 0 ? false : z12, (i15 & 2097152) != 0 ? new HybrisPickupSlotInfo(null, null, null, null, null, null, false, null, null, null, null, null, false, 8191, null) : hybrisPickupSlotInfo, (i15 & 4194304) != 0 ? new HybrisPickupSlotInfo(null, null, null, null, null, null, false, null, null, null, null, null, false, 8191, null) : hybrisPickupSlotInfo2, (i15 & 8388608) != 0 ? null : str11, (i15 & 16777216) != 0 ? null : str12, (i15 & 33554432) != 0 ? null : customerDataResponse, (i15 & 67108864) != 0 ? false : z13, (i15 & 134217728) != 0 ? null : str13, (i15 & 268435456) != 0 ? null : str14, (i15 & 536870912) != 0 ? false : z14, (i15 & 1073741824) != 0 ? false : z15, (i15 & Integer.MIN_VALUE) != 0 ? null : hybrisShopperInfo, (i16 & 1) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice18, (i16 & 2) != 0 ? null : str15, (i16 & 4) != 0 ? false : z16, (i16 & 8) != 0 ? null : hybrisTipAmount, (i16 & 16) != 0 ? null : str16, (i16 & 32) != 0 ? null : str17, (i16 & 64) != 0 ? null : num, (i16 & 128) != 0 ? false : z17, (i16 & 256) != 0 ? null : str18, (i16 & 512) != 0 ? null : str19, (i16 & 1024) != 0 ? "" : str20, (i16 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str21, (i16 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z18, (i16 & 8192) != 0 ? null : str22, (i16 & 16384) != 0 ? null : str23, (i16 & 32768) != 0 ? CollectionsKt.m() : list8, (i16 & 65536) != 0 ? null : str24, (i16 & 131072) != 0 ? null : str25, (i16 & 262144) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice19, (i16 & 524288) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice20, (i16 & 1048576) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice21, (i16 & 2097152) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice22, (i16 & 4194304) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice23, (i16 & 8388608) != 0 ? null : list9, (i16 & 16777216) != 0 ? null : multiTenderPaymentInfoResponse, (i16 & 33554432) != 0 ? false : z19, (i16 & 67108864) != 0 ? false : z20, (i16 & 134217728) != 0 ? "" : str26, (i16 & 268435456) == 0 ? str27 : "", (i16 & 536870912) != 0 ? CollectionsKt.m() : list10, (i16 & 1073741824) != 0 ? CollectionsKt.m() : list11, (i16 & Integer.MIN_VALUE) != 0 ? null : hybrisPickupPerson, (i17 & 1) != 0 ? null : str28, (i17 & 2) != 0 ? CollectionsKt.m() : list12, (i17 & 4) != 0 ? null : str29, (i17 & 8) != 0 ? new TipAndRateDetailsResponse(false, null, null, 7, null) : tipAndRateDetailsResponse, (i17 & 16) != 0 ? null : list13);
    }
}

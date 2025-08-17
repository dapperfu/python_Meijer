package com.meijer.mobile.meijer;

import Hh.C3668a;
import Hh.C3669b;
import Hh.C3670c;
import Hh.C3671d;
import Il.C3754b;
import Il.C3756d;
import Il.C3757e;
import Il.C3758f;
import Il.C3759g;
import Jd.InterfaceC3769c;
import Jk.AppVersion;
import Mp.d;
import O8.EmarsysConfig;
import Qn.C5138b;
import Qn.C5139c;
import Qn.C5145i;
import Qn.C5146j;
import Qo.l;
import Tr.C5283b;
import Vs.b;
import Zm.u0;
import Zm.w0;
import ai.C5605a;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Geocoder;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.C5996L;
import androidx.work.WorkerParameters;
import ap.InterfaceC6143a;
import aq.C6144a;
import bj.C6258c;
import bj.C6259d;
import bj.C6260e;
import bp.C6275b;
import bp.C6276c;
import bq.C6278b;
import br.C6280b;
import br.C6281c;
import cj.C6401a;
import cj.C6403c;
import cj.C6404d;
import cj.C6405e;
import cj.C6406f;
import cl.C6412d;
import com.bazaarvoice.bvandroidsdk.BVConversationsClient;
import com.bazaarvoice.bvandroidsdk.BVPixel;
import com.bazaarvoice.bvandroidsdk.BVSDK;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.launchdarkly.sdk.LDContext;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.accounts.ux.addresses.AddressesScreenActivity;
import com.meijer.mobile.accounts.ux.basescreen.AccountOverviewActivity;
import com.meijer.mobile.accounts.ux.basescreen.YourAccountActivity;
import com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity;
import com.meijer.mobile.accounts.ux.payments.PaymentsScreenActivity;
import com.meijer.mobile.accounts.ux.preferences.PreferenceScreenActivity;
import com.meijer.mobile.accounts.ux.profile.ProfileScreenActivity;
import com.meijer.mobile.accounts.ux.unauthenticated.UnauthenticatedBottomSheetActivity;
import com.meijer.mobile.authentication.okta.ux.A;
import com.meijer.mobile.authentication.okta.ux.OktaLoginActivity;
import com.meijer.mobile.authentication.okta.ux.OktaLogoutActivity;
import com.meijer.mobile.chatbot.ux.ChatBotActivity;
import com.meijer.mobile.coupon.detail.CouponDetailActivity;
import com.meijer.mobile.coupon.di.CouponFeatureActivity;
import com.meijer.mobile.coupon.list.CouponListActivity;
import com.meijer.mobile.coupon.list.CouponListTabsActivity;
import com.meijer.mobile.featurenavigation.content.DailyAlarmService;
import com.meijer.mobile.home.ux.HomeComposeActivity;
import com.meijer.mobile.home.ux.k0;
import com.meijer.mobile.home.ux.p0;
import com.meijer.mobile.legacy.notifications.broadcastreceiver.NotificationDismissedReceiver;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import com.meijer.mobile.meijer.activity.ShortcutRedirectActivity;
import com.meijer.mobile.meijer.activity.UniversalDeepLinkRedirectActivity;
import com.meijer.mobile.meijer.activity.UniversalLinkBypassActivity;
import com.meijer.mobile.meijer.activity.cart.C11740f0;
import com.meijer.mobile.meijer.activity.cart.CartActivity;
import com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment;
import com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewActivity;
import com.meijer.mobile.meijer.activity.cart.E0;
import com.meijer.mobile.meijer.activity.cart.EditCartActivity;
import com.meijer.mobile.meijer.activity.cart.G0;
import com.meijer.mobile.meijer.activity.cart.H0;
import com.meijer.mobile.meijer.activity.cart.I0;
import com.meijer.mobile.meijer.activity.cart.S0;
import com.meijer.mobile.meijer.activity.cart.T0;
import com.meijer.mobile.meijer.activity.cart.U0;
import com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity;
import com.meijer.mobile.meijer.activity.cart.V0;
import com.meijer.mobile.meijer.activity.cart.entrynote.EntryNoteActivity;
import com.meijer.mobile.meijer.activity.cart.r1;
import com.meijer.mobile.meijer.activity.cart.s1;
import com.meijer.mobile.meijer.activity.cart.t1;
import com.meijer.mobile.meijer.activity.cart.u1;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity;
import com.meijer.mobile.meijer.activity.checkout.contactinformation.DeliveryContactInformationFormActivity;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.w1;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.x1;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.y1;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.MperksInCartActivity;
import com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.C11894c;
import com.meijer.mobile.meijer.activity.checkout.payment.C11895d;
import com.meijer.mobile.meijer.activity.checkout.payment.C11896e;
import com.meijer.mobile.meijer.activity.checkout.payment.C11897f;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentUpdateCardActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.c0;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.EbtPinPadActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.l0;
import com.meijer.mobile.meijer.activity.checkout.payment.m0;
import com.meijer.mobile.meijer.activity.checkout.payment.n0;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.C11932p;
import com.meijer.mobile.meijer.activity.checkout.pickupperson.PickupPersonFormActivity;
import com.meijer.mobile.meijer.activity.checkout.review.A1;
import com.meijer.mobile.meijer.activity.checkout.review.C1;
import com.meijer.mobile.meijer.activity.checkout.review.C11945c0;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity;
import com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity;
import com.meijer.mobile.meijer.activity.coupons.CouponActivity;
import com.meijer.mobile.meijer.activity.coupons.CouponFilterActivity;
import com.meijer.mobile.meijer.activity.coupons.SpecialOffersActivity;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import com.meijer.mobile.meijer.activity.digitalreceipts.AddReceiptActivity;
import com.meijer.mobile.meijer.activity.digitalreceipts.C12022f;
import com.meijer.mobile.meijer.activity.digitalreceipts.C12054p;
import com.meijer.mobile.meijer.activity.digitalreceipts.C12060w;
import com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptDetailActivity;
import com.meijer.mobile.meijer.activity.digitalreceipts.ReceiptsAndSavingsActivity;
import com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity;
import com.meijer.mobile.meijer.activity.digitalreceipts.SelfRemediationHostActivity;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.C12031i;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormActivity;
import com.meijer.mobile.meijer.activity.enrollment.C12063a;
import com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentActivity;
import com.meijer.mobile.meijer.activity.enrollment.StoreActivity;
import com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentActivity;
import com.meijer.mobile.meijer.activity.enrollment.storeLocation.StoreListActivity;
import com.meijer.mobile.meijer.activity.find.C12074a0;
import com.meijer.mobile.meijer.activity.find.C12076b0;
import com.meijer.mobile.meijer.activity.find.C12078c0;
import com.meijer.mobile.meijer.activity.find.C12080d0;
import com.meijer.mobile.meijer.activity.find.C12090i0;
import com.meijer.mobile.meijer.activity.find.C12098m0;
import com.meijer.mobile.meijer.activity.find.FilteredProductsActivity;
import com.meijer.mobile.meijer.activity.find.FindActivity;
import com.meijer.mobile.meijer.activity.find.ImageDetailActivity;
import com.meijer.mobile.meijer.activity.find.SearchProductActivity;
import com.meijer.mobile.meijer.activity.find.filter.FilterActivity;
import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment;
import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragmentCompose;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailActivity;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailComposeActivity;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12208c1;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12231d1;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12248e1;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12251f1;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12258i;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12264k;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12267l;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12270m;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12273n;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12276o;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12279p;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12282q;
import com.meijer.mobile.meijer.activity.find.viewmodel.D0;
import com.meijer.mobile.meijer.activity.find.viewmodel.F0;
import com.meijer.mobile.meijer.activity.find.viewmodel.I1;
import com.meijer.mobile.meijer.activity.find.viewmodel.J1;
import com.meijer.mobile.meijer.activity.find.viewmodel.L1;
import com.meijer.mobile.meijer.activity.find.viewmodel.TierDepartmentsActivity;
import com.meijer.mobile.meijer.activity.gas_station.GasStationDetailActivity;
import com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment;
import com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment_MembersInjector;
import com.meijer.mobile.meijer.activity.home.HomeActivity;
import com.meijer.mobile.meijer.activity.home.HomeActivity_MembersInjector;
import com.meijer.mobile.meijer.activity.home.HomeFragment;
import com.meijer.mobile.meijer.activity.home.HomeFragment_MembersInjector;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.meijer.mobile.meijer.activity.home.HomeViewModel_HiltModules;
import com.meijer.mobile.meijer.activity.home.HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.meijer.mobile.meijer.activity.home.HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.meijer.mobile.meijer.activity.home.RoutingActivity;
import com.meijer.mobile.meijer.activity.home.RoutingActivity_MembersInjector;
import com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.OrderOptionsFulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.orders.C12399d;
import com.meijer.mobile.meijer.activity.orders.EditPhoneNumberActivity;
import com.meijer.mobile.meijer.activity.orders.FlyBuyActivity;
import com.meijer.mobile.meijer.activity.orders.OrderDetailActivity;
import com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity;
import com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity;
import com.meijer.mobile.meijer.activity.orders.OrdersActivity;
import com.meijer.mobile.meijer.activity.orders.x0;
import com.meijer.mobile.meijer.activity.personalized.modals.B0;
import com.meijer.mobile.meijer.activity.personalized.modals.C12437a;
import com.meijer.mobile.meijer.activity.personalized.modals.C12441c;
import com.meijer.mobile.meijer.activity.personalized.modals.C12479n0;
import com.meijer.mobile.meijer.activity.personalized.modals.PersonalizedShoppingListActivity;
import com.meijer.mobile.meijer.activity.personalized.modals.e1;
import com.meijer.mobile.meijer.activity.personalized.modals.f1;
import com.meijer.mobile.meijer.activity.personalized.modals.g1;
import com.meijer.mobile.meijer.activity.personalized.modals.h1;
import com.meijer.mobile.meijer.activity.personalized.modals.i1;
import com.meijer.mobile.meijer.activity.personalized.modals.j1;
import com.meijer.mobile.meijer.activity.personalized.modals.l1;
import com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity;
import com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity;
import com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity;
import com.meijer.mobile.meijer.activity.scan.ScanActivity;
import com.meijer.mobile.meijer.activity.settings.HelpActivity;
import com.meijer.mobile.meijer.activity.settings.SectionWalkthroughActivity;
import com.meijer.mobile.meijer.activity.settings.addresses.AddressDetailsActivity;
import com.meijer.mobile.meijer.activity.settings.addresses.AddressSearchActivity;
import com.meijer.mobile.meijer.activity.settings.billing.AddCardAurusActivity;
import com.meijer.mobile.meijer.activity.settings.debug.C12505b;
import com.meijer.mobile.meijer.activity.settings.debug.C12513j;
import com.meijer.mobile.meijer.activity.settings.debug.C12516m;
import com.meijer.mobile.meijer.activity.settings.debug.C12517n;
import com.meijer.mobile.meijer.activity.settings.debug.C12518o;
import com.meijer.mobile.meijer.activity.settings.debug.C12519p;
import com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity;
import com.meijer.mobile.meijer.activity.shoppinglist.LegacyShoppingListActivity;
import com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListBaseActivity;
import com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListFavoritesActivity;
import com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment;
import com.meijer.mobile.meijer.activity.shoppinglist.fragment.ShoppingListAuthenticatedFragment;
import com.meijer.mobile.meijer.activity.shoppinglist.fragment.ShoppingListUnauthenticatedFragment;
import com.meijer.mobile.meijer.activity.store.StoreDetailActivity;
import com.meijer.mobile.meijer.activity.substitution.FindSubstitutionActivity;
import com.meijer.mobile.meijer.activity.substitution.SuggestedProductFragment;
import com.meijer.mobile.meijer.search.B1;
import com.meijer.mobile.meijer.search.SearchProductActivityCompose;
import com.meijer.mobile.meijer.search.z1;
import com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker;
import com.meijer.mobile.meijer.service.GeoFenceTransitionsIntentService;
import com.meijer.mobile.models.CaptivePortalTester;
import com.meijer.mobile.models.account.MPerksAccountManager;
import com.meijer.mobile.models.account.SessionManagerModule_ProvideSessionManagerFactory;
import com.meijer.mobile.mperks.ux.MperksDashBoardActivity;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import com.meijer.mobile.mperks.ux.claim.autoClaim.AutoClaimDetailsActivity;
import com.meijer.mobile.mperks.ux.e0;
import com.meijer.mobile.mperks.ux.rewardDetail.RewardsDetailsActivity;
import com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity;
import com.meijer.mobile.rateandtip.ux.RateAndTipActivity;
import com.meijer.mobile.reviews.ux.productreview.C12711b0;
import com.meijer.mobile.reviews.ux.productreview.C12713c0;
import com.meijer.mobile.reviews.ux.productreview.C12715d0;
import com.meijer.mobile.reviews.ux.productreview.C12717e0;
import com.meijer.mobile.reviews.ux.productreview.C12719f0;
import com.meijer.mobile.reviews.ux.productreview.FilterAndSortActivity;
import com.meijer.mobile.reviews.ux.productreview.FullReviewActivity;
import com.meijer.mobile.reviews.ux.productreview.ReviewGalleryActivity;
import com.meijer.mobile.reviews.ux.productreview.ReviewListActivity;
import com.meijer.mobile.reviews.ux.rateandreview.ProductRateAndReviewActivity;
import com.meijer.mobile.reviews.ux.rateandreview.RateTermsAndConditionsActivity;
import com.meijer.mobile.scanner.ux.activity.ProductScanActivity;
import com.meijer.mobile.scanner.ux.activity.ReceiptScanActivity;
import com.meijer.mobile.scanner.ux.activity.ScannerDemoActivity;
import com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain;
import com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource;
import com.meijer.mobile.serverapi.rxjava.observables.store.GeocoderCall;
import com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall;
import com.meijer.mobile.shopandscan.ShopAndScanActivity;
import com.meijer.mobile.shopandscan.data.local.ShopAndScanDatabase;
import com.meijer.mobile.shoppinglist.activity.ShoppingListActivity;
import com.meijer.mobile.shoppinglist.di.ShoppingListFeatureActivity;
import com.meijer.mobile.shoppinglist.teacherlists.ux.K1;
import com.meijer.mobile.shoppinglist.teacherlists.ux.M1;
import com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity;
import com.meijer.mobile.shoppinglist.teacherlists.ux.v1;
import com.meijer.mobile.singlepagecheckout.C12906c;
import com.meijer.mobile.singlepagecheckout.C12910d;
import com.meijer.mobile.singlepagecheckout.C12914e;
import com.meijer.mobile.singlepagecheckout.C12917e2;
import com.meijer.mobile.singlepagecheckout.C12918f;
import com.meijer.mobile.singlepagecheckout.SinglePageCheckoutActivity;
import com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemActivity;
import com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity;
import com.meijer.mobile.subscription.ux.subscription.SubscriptionStaticConfig;
import com.meijer.mobile.weeklyad.WeeklyAdDetailActivity;
import com.meijer.mobile.weeklyad.WeeklyAdSelectionActivity;
import com.meijer.mobile.weeklyad.WeeklyAdViewActivity;
import com.meijer.mobile.wic.ux.WicLoginActivity;
import com.meijer.mobile.widget.BarCodeActivity;
import com.meijer.mobile.widget.UnauthFooterViewNewHomeScreen;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import cp.InterfaceC13412a;
import cq.C13413a;
import cq.C13414b;
import cq.C13415c;
import dk.C13535g;
import dk.C13536h;
import dp.C13552a;
import dq.C13553a;
import dq.C13554b;
import dq.C13555c;
import dq.C13556d;
import ei.C13666c;
import ei.C13668e;
import ei.InterfaceC13669f;
import eo.C13713a;
import eo.C13714b;
import eo.C13716d;
import eo.C13719g;
import ep.InterfaceC13720a;
import ep.InterfaceC13721b;
import er.InterfaceC13751a;
import fp.C13924b;
import fp.C13925c;
import gd.C14247f;
import gi.C14265e;
import gi.InterfaceC14261a;
import gi.InterfaceC14266f;
import gm.C14274a;
import go.InterfaceC14299a;
import go.InterfaceC14300b;
import go.InterfaceC14301c;
import go.InterfaceC14302d;
import gp.C14303a;
import gp.InterfaceC14304b;
import gp.InterfaceC14305c;
import gr.C14307a;
import hi.TrackingData;
import hl.C14488C;
import hl.C14490b;
import hl.C14492d;
import hl.C14493e;
import hl.C14496h;
import hl.InterfaceC14494f;
import hm.C14501c;
import ho.C14555b;
import ho.C14556c;
import hp.C14558b;
import hp.C14559c;
import hr.C14566b;
import im.C14742a;
import im.C14743b;
import iq.C14751A;
import iq.C14752B;
import ir.C14758a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn.C15063b;
import jn.C15064c;
import jn.C15065d;
import jp.C15068a;
import jp.C15069b;
import ko.C15197A;
import ko.C15198B;
import ko.C15199C;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kp.InterfaceC15297a;
import kq.C15298A;
import kr.C15309f;
import kv.InterfaceC15323a;
import lj.C15419b;
import ll.InterfaceC15422a;
import lm.C15425b;
import lp.C15461b;
import mm.C15641b;
import mm.C15643d;
import mm.C15645f;
import mm.InterfaceC15640a;
import mq.C15670B;
import mq.C15671C;
import mr.C15689a;
import mr.C15690b;
import mr.C15691c;
import mr.C15692d;
import nm.C15887a;
import np.C15916a;
import np.C15917b;
import np.C15918c;
import np.C15919d;
import np.C15921f;
import np.InterfaceC15920e;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import om.C16101c;
import om.C16103e;
import om.InterfaceC16099a;
import om.InterfaceC16102d;
import oo.b0;
import oo.d0;
import op.C16134b;
import op.C16136d;
import op.C16138f;
import op.C16140h;
import pk.C16315b;
import pk.C16316c;
import pl.InterfaceC16317a;
import pp.C16348c;
import pr.C16367d;
import pr.C16368e;
import pr.C16369f;
import pr.C16370g;
import ps.C16382L;
import ps.C16384N;
import ps.C16385O;
import ps.C16386P;
import qh.C16527b;
import qh.InterfaceC16526a;
import qm.C16537b;
import qm.C16539d;
import qm.C16547l;
import qm.InterfaceC16536a;
import qo.C16558I;
import qo.C16559J;
import qo.C16560K;
import qo.C16561L;
import qp.C16594b;
import qp.InterfaceC16593a;
import qp.InterfaceC16595c;
import qp.InterfaceC16596d;
import qq.InterfaceC16597a;
import qr.C16600a;
import qv.AbstractC16618K;
import qv.InterfaceC16622O;
import retrofit2.Retrofit;
import rj.C16793b;
import rj.C16794c;
import rj.InterfaceC16792a;
import rl.InterfaceC16796a;
import rn.C16800a;
import rn.C16801b;
import rn.C16802c;
import rn.C16803d;
import rn.C16807h;
import rn.C16808i;
import rn.C16809j;
import rn.C16810k;
import rn.C16811l;
import rn.C16812m;
import rn.C16813n;
import rn.C16814o;
import rn.C16816q;
import rn.C16817s;
import rn.C16818t;
import rn.h0;
import rn.j0;
import rn.o0;
import rn.q0;
import rn.r0;
import rq.C16829a;
import ru.InterfaceC16834a;
import sj.C16980b;
import sl.C16983b;
import sl.InterfaceC16984c;
import sp.C16992a;
import sq.C17017b;
import sq.C17018c;
import sq.C17019d;
import sq.C17020e;
import tp.C17129c;
import tq.C17130a;
import tq.C17131b;
import tq.C17132c;
import tq.C17133d;
import uj.C17268b;
import um.C17279b;
import uq.C17300a;
import uq.C17301b;
import vg.C17567a;
import vu.InterfaceC17621a;
import vu.InterfaceC17622b;
import vu.InterfaceC17623c;
import vu.InterfaceC17624d;
import vu.InterfaceC17625e;
import vu.InterfaceC17626f;
import wh.C17822b;
import wj.C17827c;
import wj.C17828d;
import wm.C17838h;
import wu.C17864a;
import x6.C18020b;
import xh.C18053b;
import xj.C18059b;
import xj.C18060c;
import xj.C18061d;
import xj.C18062e;
import xm.C18071d;
import xn.C18072a;
import xq.C18085d;
import xu.C18097c;
import yh.InterfaceC18213a;
import yj.C18216b;
import yj.InterfaceC18215a;
import yl.C18221D;
import yl.C18223b;
import yo.C18264a;
import yo.C18265b;
import yu.C18303a;
import yu.C18304b;
import yu.C18305c;
import zh.C18463a;
import zh.C18464b;
import zh.C18465c;
import zh.C18466d;
import zl.C18536d;
import zl.C18537e;
import zo.C18565b;

/* renamed from: com.meijer.mobile.meijer.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11682a {

    /* renamed from: com.meijer.mobile.meijer.a$a, reason: collision with other inner class name */
    private static final class C1400a implements InterfaceC17621a {

        /* renamed from: a, reason: collision with root package name */
        private final j f100471a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100472b;

        /* renamed from: c, reason: collision with root package name */
        private Activity f100473c;

        private C1400a(j jVar, d dVar) {
            this.f100471a = jVar;
            this.f100472b = dVar;
        }

        @Override // vu.InterfaceC17621a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public D build() {
            Bu.c.a(this.f100473c, Activity.class);
            return new b(this.f100471a, this.f100472b, this.f100473c);
        }

        @Override // vu.InterfaceC17621a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1400a a(Activity activity) {
            this.f100473c = (Activity) Bu.c.b(activity);
            return this;
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$b */
    private static final class b extends D {

        /* renamed from: a, reason: collision with root package name */
        private final j f100474a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100475b;

        /* renamed from: c, reason: collision with root package name */
        private final b f100476c = this;

        /* renamed from: d, reason: collision with root package name */
        Bu.d<A.b> f100477d;

        /* renamed from: e, reason: collision with root package name */
        Bu.d<d.a> f100478e;

        /* renamed from: com.meijer.mobile.meijer.a$b$a, reason: collision with other inner class name */
        private static final class C1401a<T> implements Bu.d<T> {

            /* renamed from: a, reason: collision with root package name */
            private final j f100479a;

            /* renamed from: b, reason: collision with root package name */
            private final d f100480b;

            /* renamed from: c, reason: collision with root package name */
            private final b f100481c;

            /* renamed from: d, reason: collision with root package name */
            private final int f100482d;

            /* renamed from: com.meijer.mobile.meijer.a$b$a$a, reason: collision with other inner class name */
            class C1402a implements A.b {
                C1402a() {
                }

                @Override // com.meijer.mobile.authentication.okta.ux.A.b
                public com.meijer.mobile.authentication.okta.ux.A b(boolean z10) {
                    return new com.meijer.mobile.authentication.okta.ux.A(C1401a.this.f100479a.f100627X.get(), C1401a.this.f100479a.f100707l1.get(), C1401a.this.f100479a.f100700k.get(), C1401a.this.f100479a.f100735r.get(), C1401a.this.f100479a.f100532E.get(), z10);
                }
            }

            /* renamed from: com.meijer.mobile.meijer.a$b$a$b, reason: collision with other inner class name */
            class C1403b implements d.a {
                C1403b() {
                }

                @Override // Mp.d.a
                public Mp.d a(Function1<? super List<? extends C17567a>, Unit> function1) {
                    return new Mp.d(Mp.g.a(), function1);
                }
            }

            @Override // kv.InterfaceC15323a
            public T get() {
                int i10 = this.f100482d;
                if (i10 == 0) {
                    return (T) new C1402a();
                }
                if (i10 == 1) {
                    return (T) new C1403b();
                }
                throw new AssertionError(this.f100482d);
            }

            C1401a(j jVar, d dVar, b bVar, int i10) {
                this.f100479a = jVar;
                this.f100480b = dVar;
                this.f100481c = bVar;
                this.f100482d = i10;
            }
        }

        @Override // com.meijer.mobile.accounts.ux.payments.l
        public void H(PaymentsScreenActivity paymentsScreenActivity) {
        }

        @Override // com.meijer.mobile.accounts.ux.addresses.c
        public void L(AddressesScreenActivity addressesScreenActivity) {
        }

        @Override // com.meijer.mobile.meijer.search.X
        public void O(SearchProductActivityCompose searchProductActivityCompose) {
        }

        @Override // com.meijer.mobile.wic.ux.b
        public void U0(WicLoginActivity wicLoginActivity) {
        }

        @Override // com.meijer.mobile.reviews.ux.productreview.InterfaceC12734n
        public void W0(FilterAndSortActivity filterAndSortActivity) {
        }

        @Override // com.meijer.mobile.reviews.ux.productreview.h1
        public void d(ReviewGalleryActivity reviewGalleryActivity) {
        }

        @Override // com.meijer.mobile.reviews.ux.rateandreview.InterfaceC12776i0
        public void j0(RateTermsAndConditionsActivity rateTermsAndConditionsActivity) {
        }

        @Override // wu.c.InterfaceC2649c
        public Map<Class<?>, Boolean> y() {
            return Bu.b.a(Ce.M.b(108).f(com.meijer.mobile.accounts.ux.basescreen.s.f94301a, Boolean.valueOf(com.meijer.mobile.accounts.ux.basescreen.q.a())).f(com.meijer.mobile.accounts.ux.payments.h.f94445a, Boolean.valueOf(com.meijer.mobile.accounts.ux.payments.f.a())).f(Dn.z.f7039a, Boolean.valueOf(Dn.x.a())).f(Dn.F.f6791a, Boolean.valueOf(Dn.D.a())).f(C3671d.f12461a, Boolean.valueOf(C3669b.a())).f(com.meijer.mobile.accounts.ux.addresses.l.f94193a, Boolean.valueOf(com.meijer.mobile.accounts.ux.addresses.j.a())).f(xn.d.f169752a, Boolean.valueOf(xn.b.a())).f(Op.f.f24118a, Boolean.valueOf(Op.d.a())).f(I0.f101610a, Boolean.valueOf(G0.a())).f(V0.f101712a, Boolean.valueOf(T0.a())).f(C12918f.f118206a, Boolean.valueOf(C12910d.a())).f(C11897f.f103998a, Boolean.valueOf(C11895d.a())).f(c0.f103877a, Boolean.valueOf(com.meijer.mobile.meijer.activity.checkout.payment.a0.a())).f(n0.f104045a, Boolean.valueOf(l0.a())).f(C15692d.f150634a, Boolean.valueOf(C15690b.a())).f(C1.f104361a, Boolean.valueOf(A1.a())).f(C15199C.f142177a, Boolean.valueOf(C15197A.a())).f(Hh.h.f12483a, Boolean.valueOf(Hh.f.a())).f(com.meijer.mobile.coupon.detail.O.f96401a, Boolean.valueOf(com.meijer.mobile.coupon.detail.M.a())).f(Km.o.f17415a, Boolean.valueOf(Km.m.a())).f(com.meijer.mobile.coupon.list.P.f96707a, Boolean.valueOf(com.meijer.mobile.coupon.list.N.a())).f(com.meijer.mobile.coupon.list.V.f96829a, Boolean.valueOf(com.meijer.mobile.coupon.list.T.a())).f(com.meijer.mobile.accounts.ux.createaccount.p.f94367a, Boolean.valueOf(com.meijer.mobile.accounts.ux.createaccount.n.a())).f(C12519p.f112233a, Boolean.valueOf(C12517n.a())).f(com.meijer.mobile.meijer.activity.checkout.contactinformation.K.f102418a, Boolean.valueOf(com.meijer.mobile.meijer.activity.checkout.contactinformation.I.a())).f(C12270m.f108935a, Boolean.valueOf(C12264k.a())).f(Rm.j.f32522a, Boolean.valueOf(Rm.h.a())).f(d0.f154634a, Boolean.valueOf(b0.a())).f(com.meijer.mobile.meijer.activity.checkout.payment.ebt.u.f103997a, Boolean.valueOf(com.meijer.mobile.meijer.activity.checkout.payment.ebt.s.a())).f(C16803d.f159483a, Boolean.valueOf(C16801b.a())).f(com.meijer.mobile.meijer.activity.cart.entrynote.l.f101833a, Boolean.valueOf(com.meijer.mobile.meijer.activity.cart.entrynote.j.a())).f(com.meijer.mobile.meijer.activity.find.filter.r.f106765a, Boolean.valueOf(com.meijer.mobile.meijer.activity.find.filter.p.a())).f(C12080d0.f106683a, Boolean.valueOf(C12076b0.a())).f(com.meijer.mobile.meijer.activity.substitution.G.f112777a, Boolean.valueOf(com.meijer.mobile.meijer.activity.substitution.E.a())).f(C16810k.f159637a, Boolean.valueOf(C16808i.a())).f(C16814o.f159673a, Boolean.valueOf(C16812m.a())).f(C16818t.f159765a, Boolean.valueOf(rn.r.a())).f(com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.U.f105700a, Boolean.valueOf(com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.S.a())).f(Hl.e.f12744a, Boolean.valueOf(Hl.c.a())).f(y1.f103213a, Boolean.valueOf(w1.a())).f(C12719f0.f115751a, Boolean.valueOf(C12715d0.a())).f(com.meijer.mobile.meijer.activity.gas_station.i.f109150a, Boolean.valueOf(com.meijer.mobile.meijer.activity.gas_station.g.a())).f(p0.f98477a, Boolean.valueOf(com.meijer.mobile.home.ux.n0.a())).f(HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(HomeViewModel_HiltModules.KeyModule.provide())).f(C12282q.f108957a, Boolean.valueOf(C12276o.a())).f(xn.k.f169793a, Boolean.valueOf(xn.i.a())).f(com.meijer.mobile.mperks.ux.Z.f113885a, Boolean.valueOf(com.meijer.mobile.mperks.ux.X.a())).f(com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.J.f103260a, Boolean.valueOf(com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.H.a())).f(C16386P.f156429a, Boolean.valueOf(C16384N.a())).f(com.meijer.mobile.authentication.okta.ux.r.f95388a, Boolean.valueOf(com.meijer.mobile.authentication.okta.ux.p.a())).f(com.meijer.mobile.meijer.activity.checkout.confirmation.b0.f102127a, Boolean.valueOf(com.meijer.mobile.meijer.activity.checkout.confirmation.Z.a())).f(rn.P.f159352a, Boolean.valueOf(rn.N.a())).f(com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.q.f109947a, Boolean.valueOf(com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.o.a())).f(com.meijer.mobile.meijer.activity.orderoptions.B.f109819a, Boolean.valueOf(com.meijer.mobile.meijer.activity.orderoptions.z.a())).f(rn.X.f159445a, Boolean.valueOf(rn.V.a())).f(Hh.m.f12524a, Boolean.valueOf(Hh.k.a())).f(rn.l0.f159669a, Boolean.valueOf(j0.a())).f(com.meijer.mobile.meijer.activity.checkout.outofstock.r.f103537a, Boolean.valueOf(com.meijer.mobile.meijer.activity.checkout.outofstock.p.a())).f(Hh.r.f12559a, Boolean.valueOf(Hh.p.a())).f(com.meijer.mobile.accounts.ux.payments.v.f94585a, Boolean.valueOf(com.meijer.mobile.accounts.ux.payments.t.a())).f(com.meijer.mobile.meijer.activity.enrollment.r.f106192a, Boolean.valueOf(com.meijer.mobile.meijer.activity.enrollment.p.a())).f(com.meijer.mobile.meijer.activity.checkout.pickupperson.s.f104328a, Boolean.valueOf(com.meijer.mobile.meijer.activity.checkout.pickupperson.q.a())).f(com.meijer.mobile.accounts.ux.preferences.j.f94691a, Boolean.valueOf(com.meijer.mobile.accounts.ux.preferences.h.a())).f(F0.f107890a, Boolean.valueOf(D0.a())).f(C12251f1.f108830a, Boolean.valueOf(C12231d1.a())).f(com.meijer.mobile.reviews.ux.rateandreview.Z.f116203a, Boolean.valueOf(com.meijer.mobile.reviews.ux.rateandreview.X.a())).f(Op.j.f24166a, Boolean.valueOf(Op.h.a())).f(h1.f111450a, Boolean.valueOf(f1.a())).f(Hh.v.f12589a, Boolean.valueOf(Hh.t.a())).f(com.meijer.mobile.meijer.activity.enrollment.profile.t.f106168a, Boolean.valueOf(com.meijer.mobile.meijer.activity.enrollment.profile.r.a())).f(com.meijer.mobile.accounts.ux.profile.o.f94980a, Boolean.valueOf(com.meijer.mobile.accounts.ux.profile.m.a())).f(com.meijer.mobile.rateandtip.ux.F.f115035a, Boolean.valueOf(com.meijer.mobile.rateandtip.ux.D.a())).f(Rm.v.f32552a, Boolean.valueOf(Rm.t.a())).f(Op.n.f24182a, Boolean.valueOf(Op.l.a())).f(com.meijer.mobile.mperks.ux.rewardDetail.B.f114315a, Boolean.valueOf(com.meijer.mobile.mperks.ux.rewardDetail.z.a())).f(C16561L.f157366a, Boolean.valueOf(C16559J.a())).f(Rm.z.f32564a, Boolean.valueOf(Rm.x.a())).f(Dn.L.f6846a, Boolean.valueOf(Dn.J.a())).f(B1.f112913a, Boolean.valueOf(z1.a())).f(L1.f108078a, Boolean.valueOf(J1.a())).f(Rm.D.f32462a, Boolean.valueOf(Rm.B.a())).f(iq.D.f138344a, Boolean.valueOf(C14752B.a())).f(jq.n.f140992a, Boolean.valueOf(jq.l.a())).f(C15298A.f147553a, Boolean.valueOf(kq.y.a())).f(lq.W.f149196a, Boolean.valueOf(lq.U.a())).f(mq.D.f150350a, Boolean.valueOf(C15670B.a())).f(nq.F.f152270a, Boolean.valueOf(nq.D.a())).f(oq.s.f154900a, Boolean.valueOf(oq.q.a())).f(Pq.o.f28632a, Boolean.valueOf(Pq.m.a())).f(In.i.f14314a, Boolean.valueOf(In.g.a())).f(com.meijer.mobile.meijer.activity.enrollment.storeLocation.r.f106308a, Boolean.valueOf(com.meijer.mobile.meijer.activity.enrollment.storeLocation.p.a())).f(com.meijer.mobile.meijer.activity.enrollment.J.f105903a, Boolean.valueOf(com.meijer.mobile.meijer.activity.enrollment.H.a())).f(com.meijer.mobile.subscription.ux.subscribedItems.p.f118857a, Boolean.valueOf(com.meijer.mobile.subscription.ux.subscribedItems.n.a())).f(Hh.z.f12601a, Boolean.valueOf(Hh.x.a())).f(C16370g.f156317a, Boolean.valueOf(C16368e.a())).f(com.meijer.mobile.subscription.ux.subscription.G.f118939a, Boolean.valueOf(com.meijer.mobile.subscription.ux.subscription.E.a())).f(com.meijer.mobile.meijer.activity.checkout.substitutionpreference.y.f105304a, Boolean.valueOf(com.meijer.mobile.meijer.activity.checkout.substitutionpreference.w.a())).f(r0.f159763a, Boolean.valueOf(rn.p0.a())).f(M1.f117216a, Boolean.valueOf(K1.a())).f(com.meijer.mobile.meijer.activity.checkout.termsandconditions.i.f105340a, Boolean.valueOf(com.meijer.mobile.meijer.activity.checkout.termsandconditions.g.a())).f(com.meijer.mobile.mperks.ux.transactionHistory.G.f114670a, Boolean.valueOf(com.meijer.mobile.mperks.ux.transactionHistory.E.a())).f(u1.f101968a, Boolean.valueOf(s1.a())).f(Ps.h.f29179a, Boolean.valueOf(Ps.f.a())).f(Ps.l.f29219a, Boolean.valueOf(Ps.j.a())).f(Ps.s.f29323a, Boolean.valueOf(Ps.q.a())).f(com.meijer.mobile.wic.ux.x.f119462a, Boolean.valueOf(com.meijer.mobile.wic.ux.v.a())).f(com.meijer.mobile.accounts.ux.basescreen.K.f94275a, Boolean.valueOf(com.meijer.mobile.accounts.ux.basescreen.I.a())).f(Hh.D.f12431a, Boolean.valueOf(Hh.B.a())).a());
        }

        private AddressSearchActivity A1(AddressSearchActivity addressSearchActivity) {
            com.meijer.mobile.meijer.activity.o.c(addressSearchActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(addressSearchActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(addressSearchActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(addressSearchActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(addressSearchActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(addressSearchActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(addressSearchActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(addressSearchActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(addressSearchActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(addressSearchActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(addressSearchActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(addressSearchActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(addressSearchActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.settings.addresses.t.a(addressSearchActivity, this.f100474a.f100573M0.get());
            return addressSearchActivity;
        }

        private OrdersActivity A2(OrdersActivity ordersActivity) {
            x0.b(ordersActivity, this.f100474a.U());
            x0.c(ordersActivity, this.f100474a.f100577N.get());
            x0.d(ordersActivity, this.f100474a.f100717n1.get());
            x0.a(ordersActivity, this.f100474a.f100532E.get());
            return ordersActivity;
        }

        private AutoClaimDetailsActivity B1(AutoClaimDetailsActivity autoClaimDetailsActivity) {
            e0.g(autoClaimDetailsActivity, this.f100474a.f100695j.get());
            e0.b(autoClaimDetailsActivity, this.f100474a.f100745t.get());
            e0.a(autoClaimDetailsActivity, this.f100474a.f100735r.get());
            e0.f(autoClaimDetailsActivity, this.f100474a.f100756v0.get());
            e0.e(autoClaimDetailsActivity, this.f100474a.f100577N.get());
            e0.d(autoClaimDetailsActivity, this.f100474a.U());
            e0.c(autoClaimDetailsActivity, this.f100474a.f100532E.get());
            return autoClaimDetailsActivity;
        }

        private OutOfStockActivity B2(OutOfStockActivity outOfStockActivity) {
            com.meijer.mobile.meijer.activity.o.c(outOfStockActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(outOfStockActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(outOfStockActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(outOfStockActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(outOfStockActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(outOfStockActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(outOfStockActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(outOfStockActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(outOfStockActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(outOfStockActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(outOfStockActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(outOfStockActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(outOfStockActivity, this.f100474a.f100514A1.get());
            return outOfStockActivity;
        }

        private AvailableMccDetailsActivity C1(AvailableMccDetailsActivity availableMccDetailsActivity) {
            com.meijer.mobile.meijer.activity.o.c(availableMccDetailsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(availableMccDetailsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(availableMccDetailsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(availableMccDetailsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(availableMccDetailsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(availableMccDetailsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(availableMccDetailsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(availableMccDetailsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(availableMccDetailsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(availableMccDetailsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(availableMccDetailsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(availableMccDetailsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(availableMccDetailsActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.rewards.d.a(availableMccDetailsActivity, C3());
            return availableMccDetailsActivity;
        }

        private PersonalizedShoppingListActivity C2(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
            com.meijer.mobile.meijer.activity.o.c(personalizedShoppingListActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(personalizedShoppingListActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(personalizedShoppingListActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(personalizedShoppingListActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(personalizedShoppingListActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(personalizedShoppingListActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(personalizedShoppingListActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(personalizedShoppingListActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(personalizedShoppingListActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(personalizedShoppingListActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(personalizedShoppingListActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(personalizedShoppingListActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(personalizedShoppingListActivity, this.f100474a.f100514A1.get());
            C12479n0.a(personalizedShoppingListActivity, this.f100474a.f100534E1.get());
            C12479n0.b(personalizedShoppingListActivity, this.f100474a.f100544G1.get());
            return personalizedShoppingListActivity;
        }

        private BarCodeActivity D1(BarCodeActivity barCodeActivity) {
            com.meijer.mobile.meijer.activity.o.c(barCodeActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(barCodeActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(barCodeActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(barCodeActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(barCodeActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(barCodeActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(barCodeActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(barCodeActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(barCodeActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(barCodeActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(barCodeActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(barCodeActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(barCodeActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.widget.e.a(barCodeActivity, this.f100474a.f100624W1.get());
            return barCodeActivity;
        }

        private PhoneEnrollmentActivity D2(PhoneEnrollmentActivity phoneEnrollmentActivity) {
            com.meijer.mobile.meijer.activity.o.c(phoneEnrollmentActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(phoneEnrollmentActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(phoneEnrollmentActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(phoneEnrollmentActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(phoneEnrollmentActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(phoneEnrollmentActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(phoneEnrollmentActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(phoneEnrollmentActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(phoneEnrollmentActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(phoneEnrollmentActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(phoneEnrollmentActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(phoneEnrollmentActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(phoneEnrollmentActivity, this.f100474a.f100514A1.get());
            return phoneEnrollmentActivity;
        }

        private CartActivity E1(CartActivity cartActivity) {
            com.meijer.mobile.meijer.activity.o.c(cartActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(cartActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(cartActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(cartActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(cartActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(cartActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(cartActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(cartActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(cartActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(cartActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(cartActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(cartActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(cartActivity, this.f100474a.f100514A1.get());
            C11740f0.a(cartActivity, this.f100474a.f100534E1.get());
            C11740f0.c(cartActivity, this.f100474a.f100715n.get());
            C11740f0.b(cartActivity, this.f100474a.f100539F1.get());
            return cartActivity;
        }

        private PickupPersonFormActivity E2(PickupPersonFormActivity pickupPersonFormActivity) {
            com.meijer.mobile.meijer.activity.o.c(pickupPersonFormActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(pickupPersonFormActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(pickupPersonFormActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(pickupPersonFormActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(pickupPersonFormActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(pickupPersonFormActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(pickupPersonFormActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(pickupPersonFormActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(pickupPersonFormActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(pickupPersonFormActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(pickupPersonFormActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(pickupPersonFormActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(pickupPersonFormActivity, this.f100474a.f100514A1.get());
            return pickupPersonFormActivity;
        }

        private ChangeFulfillmentPreviewActivity F1(ChangeFulfillmentPreviewActivity changeFulfillmentPreviewActivity) {
            com.meijer.mobile.meijer.activity.o.c(changeFulfillmentPreviewActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(changeFulfillmentPreviewActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(changeFulfillmentPreviewActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(changeFulfillmentPreviewActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(changeFulfillmentPreviewActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(changeFulfillmentPreviewActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(changeFulfillmentPreviewActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(changeFulfillmentPreviewActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(changeFulfillmentPreviewActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(changeFulfillmentPreviewActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(changeFulfillmentPreviewActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(changeFulfillmentPreviewActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(changeFulfillmentPreviewActivity, this.f100474a.f100514A1.get());
            return changeFulfillmentPreviewActivity;
        }

        private PreferenceScreenActivity F2(PreferenceScreenActivity preferenceScreenActivity) {
            com.meijer.mobile.accounts.ux.preferences.c.a(preferenceScreenActivity, this.f100474a.f100577N.get());
            return preferenceScreenActivity;
        }

        private ChatBotActivity G1(ChatBotActivity chatBotActivity) {
            com.meijer.mobile.chatbot.ux.g.e(chatBotActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.chatbot.ux.g.b(chatBotActivity, p1());
            com.meijer.mobile.chatbot.ux.g.d(chatBotActivity, this.f100474a.f100567L.get());
            com.meijer.mobile.chatbot.ux.g.a(chatBotActivity, this.f100474a.f100532E.get());
            com.meijer.mobile.chatbot.ux.g.f(chatBotActivity, this.f100474a.f100537F.get());
            com.meijer.mobile.chatbot.ux.g.c(chatBotActivity, Kn.r.f17432a.a());
            return chatBotActivity;
        }

        private ProductDetailActivity G2(ProductDetailActivity productDetailActivity) {
            com.meijer.mobile.meijer.activity.o.c(productDetailActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(productDetailActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(productDetailActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(productDetailActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(productDetailActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(productDetailActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(productDetailActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(productDetailActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(productDetailActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(productDetailActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(productDetailActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(productDetailActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(productDetailActivity, this.f100474a.f100514A1.get());
            return productDetailActivity;
        }

        private CheckoutActivity H1(CheckoutActivity checkoutActivity) {
            com.meijer.mobile.meijer.activity.o.c(checkoutActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(checkoutActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(checkoutActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(checkoutActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(checkoutActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(checkoutActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(checkoutActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(checkoutActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(checkoutActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(checkoutActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(checkoutActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(checkoutActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(checkoutActivity, this.f100474a.f100514A1.get());
            C11945c0.b(checkoutActivity, this.f100474a.f100577N.get());
            C11945c0.a(checkoutActivity, this.f100474a.f100539F1.get());
            return checkoutActivity;
        }

        private ProductDetailComposeActivity H2(ProductDetailComposeActivity productDetailComposeActivity) {
            com.meijer.mobile.meijer.activity.find.productdetail.V0.b(productDetailComposeActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.find.productdetail.V0.d(productDetailComposeActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.find.productdetail.V0.c(productDetailComposeActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.find.productdetail.V0.a(productDetailComposeActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.find.productdetail.V0.e(productDetailComposeActivity, this.f100474a.f100695j.get());
            return productDetailComposeActivity;
        }

        private CheckoutPaymentHostActivity I1(CheckoutPaymentHostActivity checkoutPaymentHostActivity) {
            com.meijer.mobile.meijer.activity.o.c(checkoutPaymentHostActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(checkoutPaymentHostActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(checkoutPaymentHostActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(checkoutPaymentHostActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(checkoutPaymentHostActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(checkoutPaymentHostActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(checkoutPaymentHostActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(checkoutPaymentHostActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(checkoutPaymentHostActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(checkoutPaymentHostActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(checkoutPaymentHostActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(checkoutPaymentHostActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(checkoutPaymentHostActivity, this.f100474a.f100514A1.get());
            return checkoutPaymentHostActivity;
        }

        private ProductRateAndReviewActivity I2(ProductRateAndReviewActivity productRateAndReviewActivity) {
            com.meijer.mobile.reviews.ux.rateandreview.V.a(productRateAndReviewActivity, this.f100474a.U());
            com.meijer.mobile.reviews.ux.rateandreview.V.b(productRateAndReviewActivity, this.f100474a.f100756v0.get());
            return productRateAndReviewActivity;
        }

        private CheckoutPaymentOptionsActivity J1(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity) {
            com.meijer.mobile.meijer.activity.o.c(checkoutPaymentOptionsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(checkoutPaymentOptionsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(checkoutPaymentOptionsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(checkoutPaymentOptionsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(checkoutPaymentOptionsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(checkoutPaymentOptionsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(checkoutPaymentOptionsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(checkoutPaymentOptionsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(checkoutPaymentOptionsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(checkoutPaymentOptionsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(checkoutPaymentOptionsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(checkoutPaymentOptionsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(checkoutPaymentOptionsActivity, this.f100474a.f100514A1.get());
            return checkoutPaymentOptionsActivity;
        }

        private ProductScanActivity J2(ProductScanActivity productScanActivity) {
            com.meijer.mobile.scanner.ux.activity.l.a(productScanActivity, this.f100474a.f100756v0.get());
            return productScanActivity;
        }

        private CheckoutPaymentUpdateCardActivity K1(CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity) {
            com.meijer.mobile.meijer.activity.o.c(checkoutPaymentUpdateCardActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(checkoutPaymentUpdateCardActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(checkoutPaymentUpdateCardActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(checkoutPaymentUpdateCardActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(checkoutPaymentUpdateCardActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(checkoutPaymentUpdateCardActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(checkoutPaymentUpdateCardActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(checkoutPaymentUpdateCardActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(checkoutPaymentUpdateCardActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(checkoutPaymentUpdateCardActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(checkoutPaymentUpdateCardActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(checkoutPaymentUpdateCardActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(checkoutPaymentUpdateCardActivity, this.f100474a.f100514A1.get());
            return checkoutPaymentUpdateCardActivity;
        }

        private ProfileEnrollmentActivity K2(ProfileEnrollmentActivity profileEnrollmentActivity) {
            com.meijer.mobile.meijer.activity.o.c(profileEnrollmentActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(profileEnrollmentActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(profileEnrollmentActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(profileEnrollmentActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(profileEnrollmentActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(profileEnrollmentActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(profileEnrollmentActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(profileEnrollmentActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(profileEnrollmentActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(profileEnrollmentActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(profileEnrollmentActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(profileEnrollmentActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(profileEnrollmentActivity, this.f100474a.f100514A1.get());
            return profileEnrollmentActivity;
        }

        private CouponActivity L1(CouponActivity couponActivity) {
            com.meijer.mobile.meijer.activity.o.c(couponActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(couponActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(couponActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(couponActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(couponActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(couponActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(couponActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(couponActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(couponActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(couponActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(couponActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(couponActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(couponActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.coupons.f.a(couponActivity, this.f100474a.f100715n.get());
            return couponActivity;
        }

        private ProfileScreenActivity L2(ProfileScreenActivity profileScreenActivity) {
            com.meijer.mobile.accounts.ux.profile.k.d(profileScreenActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.accounts.ux.profile.k.c(profileScreenActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.accounts.ux.profile.k.b(profileScreenActivity, this.f100474a.U());
            com.meijer.mobile.accounts.ux.profile.k.e(profileScreenActivity, this.f100474a.f100517B.get());
            com.meijer.mobile.accounts.ux.profile.k.a(profileScreenActivity, this.f100474a.f100735r.get());
            return profileScreenActivity;
        }

        private CouponDetailActivity M1(CouponDetailActivity couponDetailActivity) {
            com.meijer.mobile.coupon.di.d.f(couponDetailActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.coupon.di.d.d(couponDetailActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.coupon.di.d.e(couponDetailActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.coupon.di.d.c(couponDetailActivity, this.f100474a.U());
            com.meijer.mobile.coupon.di.d.a(couponDetailActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.coupon.di.d.b(couponDetailActivity, this.f100474a.f100532E.get());
            return couponDetailActivity;
        }

        private RateAndTipActivity M2(RateAndTipActivity rateAndTipActivity) {
            com.meijer.mobile.rateandtip.ux.k.a(rateAndTipActivity, this.f100474a.f100717n1.get());
            return rateAndTipActivity;
        }

        private CouponFeatureActivity N1(CouponFeatureActivity couponFeatureActivity) {
            com.meijer.mobile.coupon.di.d.f(couponFeatureActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.coupon.di.d.d(couponFeatureActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.coupon.di.d.e(couponFeatureActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.coupon.di.d.c(couponFeatureActivity, this.f100474a.U());
            com.meijer.mobile.coupon.di.d.a(couponFeatureActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.coupon.di.d.b(couponFeatureActivity, this.f100474a.f100532E.get());
            return couponFeatureActivity;
        }

        private ReceiptDetailActivity N2(ReceiptDetailActivity receiptDetailActivity) {
            com.meijer.mobile.meijer.activity.o.c(receiptDetailActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(receiptDetailActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(receiptDetailActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(receiptDetailActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(receiptDetailActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(receiptDetailActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(receiptDetailActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(receiptDetailActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(receiptDetailActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(receiptDetailActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(receiptDetailActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(receiptDetailActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(receiptDetailActivity, this.f100474a.f100514A1.get());
            return receiptDetailActivity;
        }

        private CouponFilterActivity O1(CouponFilterActivity couponFilterActivity) {
            com.meijer.mobile.meijer.activity.o.c(couponFilterActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(couponFilterActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(couponFilterActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(couponFilterActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(couponFilterActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(couponFilterActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(couponFilterActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(couponFilterActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(couponFilterActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(couponFilterActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(couponFilterActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(couponFilterActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(couponFilterActivity, this.f100474a.f100514A1.get());
            return couponFilterActivity;
        }

        private ReceiptScanActivity O2(ReceiptScanActivity receiptScanActivity) {
            com.meijer.mobile.scanner.ux.activity.s.a(receiptScanActivity, this.f100474a.f100756v0.get());
            return receiptScanActivity;
        }

        private CouponListActivity P1(CouponListActivity couponListActivity) {
            com.meijer.mobile.coupon.di.d.f(couponListActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.coupon.di.d.d(couponListActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.coupon.di.d.e(couponListActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.coupon.di.d.c(couponListActivity, this.f100474a.U());
            com.meijer.mobile.coupon.di.d.a(couponListActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.coupon.di.d.b(couponListActivity, this.f100474a.f100532E.get());
            return couponListActivity;
        }

        private ReceiptsAndSavingsActivity P2(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
            C12054p.d(receiptsAndSavingsActivity, this.f100474a.f100700k.get());
            C12054p.a(receiptsAndSavingsActivity, this.f100474a.f100735r.get());
            C12054p.b(receiptsAndSavingsActivity, this.f100474a.f100532E.get());
            C12054p.c(receiptsAndSavingsActivity, this.f100474a.f100577N.get());
            return receiptsAndSavingsActivity;
        }

        private CouponListTabsActivity Q1(CouponListTabsActivity couponListTabsActivity) {
            com.meijer.mobile.coupon.di.d.f(couponListTabsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.coupon.di.d.d(couponListTabsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.coupon.di.d.e(couponListTabsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.coupon.di.d.c(couponListTabsActivity, this.f100474a.U());
            com.meijer.mobile.coupon.di.d.a(couponListTabsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.coupon.di.d.b(couponListTabsActivity, this.f100474a.f100532E.get());
            return couponListTabsActivity;
        }

        private ReviewListActivity Q2(ReviewListActivity reviewListActivity) {
            com.meijer.mobile.reviews.ux.productreview.s1.b(reviewListActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.reviews.ux.productreview.s1.a(reviewListActivity, this.f100474a.f100577N.get());
            return reviewListActivity;
        }

        private CreateAccountActivity R1(CreateAccountActivity createAccountActivity) {
            com.meijer.mobile.accounts.ux.createaccount.e.a(createAccountActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.accounts.ux.createaccount.e.b(createAccountActivity, this.f100474a.f100702k1.get());
            return createAccountActivity;
        }

        private RewardsDetailsActivity R2(RewardsDetailsActivity rewardsDetailsActivity) {
            e0.g(rewardsDetailsActivity, this.f100474a.f100695j.get());
            e0.b(rewardsDetailsActivity, this.f100474a.f100745t.get());
            e0.a(rewardsDetailsActivity, this.f100474a.f100735r.get());
            e0.f(rewardsDetailsActivity, this.f100474a.f100756v0.get());
            e0.e(rewardsDetailsActivity, this.f100474a.f100577N.get());
            e0.d(rewardsDetailsActivity, this.f100474a.U());
            e0.c(rewardsDetailsActivity, this.f100474a.f100532E.get());
            return rewardsDetailsActivity;
        }

        private DebugOptionsActivity S1(DebugOptionsActivity debugOptionsActivity) {
            com.meijer.mobile.meijer.activity.o.c(debugOptionsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(debugOptionsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(debugOptionsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(debugOptionsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(debugOptionsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(debugOptionsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(debugOptionsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(debugOptionsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(debugOptionsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(debugOptionsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(debugOptionsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(debugOptionsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(debugOptionsActivity, this.f100474a.f100514A1.get());
            C12513j.c(debugOptionsActivity, this.f100474a.f100715n.get());
            C12513j.a(debugOptionsActivity, this.f100474a.f100518B0.get());
            C12513j.b(debugOptionsActivity, this.f100474a.f100538F0.get());
            return debugOptionsActivity;
        }

        private RoutingActivity S2(RoutingActivity routingActivity) {
            RoutingActivity_MembersInjector.injectFeatureEntryPoint(routingActivity, this.f100474a.U());
            RoutingActivity_MembersInjector.injectAnalyticsEngine(routingActivity, this.f100474a.f100735r.get());
            return routingActivity;
        }

        private DeliveryContactInformationFormActivity T1(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
            com.meijer.mobile.meijer.activity.o.c(deliveryContactInformationFormActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(deliveryContactInformationFormActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(deliveryContactInformationFormActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(deliveryContactInformationFormActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(deliveryContactInformationFormActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(deliveryContactInformationFormActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(deliveryContactInformationFormActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(deliveryContactInformationFormActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(deliveryContactInformationFormActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(deliveryContactInformationFormActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(deliveryContactInformationFormActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(deliveryContactInformationFormActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(deliveryContactInformationFormActivity, this.f100474a.f100514A1.get());
            return deliveryContactInformationFormActivity;
        }

        private SavingsDetailActivity T2(SavingsDetailActivity savingsDetailActivity) {
            C12060w.a(savingsDetailActivity, this.f100474a.f100735r.get());
            return savingsDetailActivity;
        }

        private EbtPinPadActivity U1(EbtPinPadActivity ebtPinPadActivity) {
            com.meijer.mobile.meijer.activity.o.c(ebtPinPadActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(ebtPinPadActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(ebtPinPadActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(ebtPinPadActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(ebtPinPadActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(ebtPinPadActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(ebtPinPadActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(ebtPinPadActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(ebtPinPadActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(ebtPinPadActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(ebtPinPadActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(ebtPinPadActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(ebtPinPadActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.checkout.payment.ebt.e.a(ebtPinPadActivity, this.f100474a.f100539F1.get());
            return ebtPinPadActivity;
        }

        private ScanActivity U2(ScanActivity scanActivity) {
            com.meijer.mobile.meijer.activity.o.c(scanActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(scanActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(scanActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(scanActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(scanActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(scanActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(scanActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(scanActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(scanActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(scanActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(scanActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(scanActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(scanActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.scan.j.b(scanActivity, B3());
            com.meijer.mobile.meijer.activity.scan.j.a(scanActivity, uk.c.a());
            return scanActivity;
        }

        private EditCartActivity V1(EditCartActivity editCartActivity) {
            com.meijer.mobile.meijer.activity.o.c(editCartActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(editCartActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(editCartActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(editCartActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(editCartActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(editCartActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(editCartActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(editCartActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(editCartActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(editCartActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(editCartActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(editCartActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(editCartActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.cart.h1.a(editCartActivity, this.f100474a.f100534E1.get());
            com.meijer.mobile.meijer.activity.cart.h1.b(editCartActivity, this.f100474a.f100715n.get());
            return editCartActivity;
        }

        private ScannerDemoActivity V2(ScannerDemoActivity scannerDemoActivity) {
            com.meijer.mobile.scanner.ux.activity.B.a(scannerDemoActivity, this.f100478e.get());
            com.meijer.mobile.scanner.ux.activity.B.c(scannerDemoActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.scanner.ux.activity.B.b(scannerDemoActivity, this.f100474a.U());
            return scannerDemoActivity;
        }

        private EditPhoneNumberActivity W1(EditPhoneNumberActivity editPhoneNumberActivity) {
            com.meijer.mobile.meijer.activity.o.c(editPhoneNumberActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(editPhoneNumberActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(editPhoneNumberActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(editPhoneNumberActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(editPhoneNumberActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(editPhoneNumberActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(editPhoneNumberActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(editPhoneNumberActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(editPhoneNumberActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(editPhoneNumberActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(editPhoneNumberActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(editPhoneNumberActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(editPhoneNumberActivity, this.f100474a.f100514A1.get());
            return editPhoneNumberActivity;
        }

        private SearchProductActivity W2(SearchProductActivity searchProductActivity) {
            com.meijer.mobile.meijer.activity.o.c(searchProductActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(searchProductActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(searchProductActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(searchProductActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(searchProductActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(searchProductActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(searchProductActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(searchProductActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(searchProductActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(searchProductActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(searchProductActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(searchProductActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(searchProductActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.find.f1.c(searchProductActivity, this.f100474a.f100715n.get());
            com.meijer.mobile.meijer.activity.find.f1.b(searchProductActivity, this.f100474a.f100529D1.get());
            com.meijer.mobile.meijer.activity.find.f1.a(searchProductActivity, this.f100474a.f100756v0.get());
            return searchProductActivity;
        }

        private EntryNoteActivity X1(EntryNoteActivity entryNoteActivity) {
            com.meijer.mobile.meijer.activity.o.c(entryNoteActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(entryNoteActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(entryNoteActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(entryNoteActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(entryNoteActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(entryNoteActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(entryNoteActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(entryNoteActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(entryNoteActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(entryNoteActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(entryNoteActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(entryNoteActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(entryNoteActivity, this.f100474a.f100514A1.get());
            return entryNoteActivity;
        }

        private SectionWalkthroughActivity X2(SectionWalkthroughActivity sectionWalkthroughActivity) {
            com.meijer.mobile.meijer.activity.o.c(sectionWalkthroughActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(sectionWalkthroughActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(sectionWalkthroughActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(sectionWalkthroughActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(sectionWalkthroughActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(sectionWalkthroughActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(sectionWalkthroughActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(sectionWalkthroughActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(sectionWalkthroughActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(sectionWalkthroughActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(sectionWalkthroughActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(sectionWalkthroughActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(sectionWalkthroughActivity, this.f100474a.f100514A1.get());
            return sectionWalkthroughActivity;
        }

        private FilterActivity Y1(FilterActivity filterActivity) {
            com.meijer.mobile.meijer.activity.o.c(filterActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(filterActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(filterActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(filterActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(filterActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(filterActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(filterActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(filterActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(filterActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(filterActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(filterActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(filterActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(filterActivity, this.f100474a.f100514A1.get());
            return filterActivity;
        }

        private SelfRemediationHostActivity Y2(SelfRemediationHostActivity selfRemediationHostActivity) {
            com.meijer.mobile.meijer.activity.digitalreceipts.Y.a(selfRemediationHostActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.digitalreceipts.Y.c(selfRemediationHostActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.digitalreceipts.Y.b(selfRemediationHostActivity, this.f100474a.f100577N.get());
            return selfRemediationHostActivity;
        }

        private FilteredProductsActivity Z1(FilteredProductsActivity filteredProductsActivity) {
            com.meijer.mobile.meijer.activity.o.c(filteredProductsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(filteredProductsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(filteredProductsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(filteredProductsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(filteredProductsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(filteredProductsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(filteredProductsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(filteredProductsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(filteredProductsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(filteredProductsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(filteredProductsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(filteredProductsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(filteredProductsActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.find.L.a(filteredProductsActivity, this.f100474a.f100534E1.get());
            com.meijer.mobile.meijer.activity.find.L.b(filteredProductsActivity, this.f100474a.f100529D1.get());
            com.meijer.mobile.meijer.activity.find.L.c(filteredProductsActivity, this.f100474a.f100544G1.get());
            return filteredProductsActivity;
        }

        private ShopAndScanActivity Z2(ShopAndScanActivity shopAndScanActivity) {
            com.meijer.mobile.shopandscan.h.a(shopAndScanActivity, this.f100474a.f100614U1.get());
            return shopAndScanActivity;
        }

        private FindActivity a2(FindActivity findActivity) {
            com.meijer.mobile.meijer.activity.find.Y.a(findActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.find.Y.f(findActivity, this.f100474a.f100715n.get());
            com.meijer.mobile.meijer.activity.find.Y.b(findActivity, this.f100474a.f100532E.get());
            com.meijer.mobile.meijer.activity.find.Y.e(findActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.find.Y.d(findActivity, z3());
            com.meijer.mobile.meijer.activity.find.Y.c(findActivity, this.f100474a.f100577N.get());
            return findActivity;
        }

        private ShoppingListActivity a3(ShoppingListActivity shoppingListActivity) {
            com.meijer.mobile.shoppinglist.di.d.d(shoppingListActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.shoppinglist.di.d.c(shoppingListActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.shoppinglist.di.d.b(shoppingListActivity, this.f100474a.U());
            com.meijer.mobile.shoppinglist.di.d.a(shoppingListActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.shoppinglist.activity.e.b(shoppingListActivity, this.f100474a.f100715n.get());
            com.meijer.mobile.shoppinglist.activity.e.a(shoppingListActivity, this.f100474a.f100756v0.get());
            return shoppingListActivity;
        }

        private FindSubstitutionActivity b2(FindSubstitutionActivity findSubstitutionActivity) {
            com.meijer.mobile.meijer.activity.o.c(findSubstitutionActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(findSubstitutionActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(findSubstitutionActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(findSubstitutionActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(findSubstitutionActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(findSubstitutionActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(findSubstitutionActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(findSubstitutionActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(findSubstitutionActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(findSubstitutionActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(findSubstitutionActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(findSubstitutionActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(findSubstitutionActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.substitution.s.a(findSubstitutionActivity, this.f100474a.f100715n.get());
            return findSubstitutionActivity;
        }

        private ShoppingListBaseActivity b3(ShoppingListBaseActivity shoppingListBaseActivity) {
            com.meijer.mobile.meijer.activity.o.c(shoppingListBaseActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(shoppingListBaseActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(shoppingListBaseActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(shoppingListBaseActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(shoppingListBaseActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(shoppingListBaseActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(shoppingListBaseActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(shoppingListBaseActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(shoppingListBaseActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(shoppingListBaseActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(shoppingListBaseActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(shoppingListBaseActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(shoppingListBaseActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.shoppinglist.d.a(shoppingListBaseActivity, this.f100474a.f100715n.get());
            return shoppingListBaseActivity;
        }

        private FlyBuyActivity c2(FlyBuyActivity flyBuyActivity) {
            com.meijer.mobile.meijer.activity.o.c(flyBuyActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(flyBuyActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(flyBuyActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(flyBuyActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(flyBuyActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(flyBuyActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(flyBuyActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(flyBuyActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(flyBuyActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(flyBuyActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(flyBuyActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(flyBuyActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(flyBuyActivity, this.f100474a.f100514A1.get());
            C12399d.a(flyBuyActivity, this.f100474a.f100549H1.get());
            return flyBuyActivity;
        }

        private ShoppingListFavoritesActivity c3(ShoppingListFavoritesActivity shoppingListFavoritesActivity) {
            com.meijer.mobile.meijer.activity.o.c(shoppingListFavoritesActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(shoppingListFavoritesActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(shoppingListFavoritesActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(shoppingListFavoritesActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(shoppingListFavoritesActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(shoppingListFavoritesActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(shoppingListFavoritesActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(shoppingListFavoritesActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(shoppingListFavoritesActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(shoppingListFavoritesActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(shoppingListFavoritesActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(shoppingListFavoritesActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(shoppingListFavoritesActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.shoppinglist.d.a(shoppingListFavoritesActivity, this.f100474a.f100715n.get());
            com.meijer.mobile.meijer.activity.shoppinglist.h.d(shoppingListFavoritesActivity, this.f100474a.f100668e1.get());
            com.meijer.mobile.meijer.activity.shoppinglist.h.a(shoppingListFavoritesActivity, this.f100474a.f100609T1.get());
            com.meijer.mobile.meijer.activity.shoppinglist.h.c(shoppingListFavoritesActivity, B3());
            com.meijer.mobile.meijer.activity.shoppinglist.h.b(shoppingListFavoritesActivity, uk.c.a());
            return shoppingListFavoritesActivity;
        }

        private FuelReceiptFormActivity d2(FuelReceiptFormActivity fuelReceiptFormActivity) {
            e0.g(fuelReceiptFormActivity, this.f100474a.f100695j.get());
            e0.b(fuelReceiptFormActivity, this.f100474a.f100745t.get());
            e0.a(fuelReceiptFormActivity, this.f100474a.f100735r.get());
            e0.f(fuelReceiptFormActivity, this.f100474a.f100756v0.get());
            e0.e(fuelReceiptFormActivity, this.f100474a.f100577N.get());
            e0.d(fuelReceiptFormActivity, this.f100474a.U());
            e0.c(fuelReceiptFormActivity, this.f100474a.f100532E.get());
            C12031i.a(fuelReceiptFormActivity, this.f100474a.f100735r.get());
            return fuelReceiptFormActivity;
        }

        private ShoppingListFeatureActivity d3(ShoppingListFeatureActivity shoppingListFeatureActivity) {
            com.meijer.mobile.shoppinglist.di.d.d(shoppingListFeatureActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.shoppinglist.di.d.c(shoppingListFeatureActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.shoppinglist.di.d.b(shoppingListFeatureActivity, this.f100474a.U());
            com.meijer.mobile.shoppinglist.di.d.a(shoppingListFeatureActivity, this.f100474a.f100735r.get());
            return shoppingListFeatureActivity;
        }

        private FulfillmentSlotsActivity e2(FulfillmentSlotsActivity fulfillmentSlotsActivity) {
            com.meijer.mobile.meijer.activity.o.c(fulfillmentSlotsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(fulfillmentSlotsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(fulfillmentSlotsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(fulfillmentSlotsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(fulfillmentSlotsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(fulfillmentSlotsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(fulfillmentSlotsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(fulfillmentSlotsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(fulfillmentSlotsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(fulfillmentSlotsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(fulfillmentSlotsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(fulfillmentSlotsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(fulfillmentSlotsActivity, this.f100474a.f100514A1.get());
            return fulfillmentSlotsActivity;
        }

        private ShortcutRedirectActivity e3(ShortcutRedirectActivity shortcutRedirectActivity) {
            com.meijer.mobile.meijer.activity.q.a(shortcutRedirectActivity, this.f100474a.f100756v0.get());
            return shortcutRedirectActivity;
        }

        private FullReviewActivity f2(FullReviewActivity fullReviewActivity) {
            C12711b0.a(fullReviewActivity, this.f100474a.f100577N.get());
            return fullReviewActivity;
        }

        private SinglePageCheckoutActivity f3(SinglePageCheckoutActivity singlePageCheckoutActivity) {
            com.meijer.mobile.meijer.activity.o.c(singlePageCheckoutActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(singlePageCheckoutActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(singlePageCheckoutActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(singlePageCheckoutActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(singlePageCheckoutActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(singlePageCheckoutActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(singlePageCheckoutActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(singlePageCheckoutActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(singlePageCheckoutActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(singlePageCheckoutActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(singlePageCheckoutActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(singlePageCheckoutActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(singlePageCheckoutActivity, this.f100474a.f100514A1.get());
            C12917e2.a(singlePageCheckoutActivity, this.f100474a.f100539F1.get());
            return singlePageCheckoutActivity;
        }

        private GasStationDetailActivity g2(GasStationDetailActivity gasStationDetailActivity) {
            com.meijer.mobile.meijer.activity.o.c(gasStationDetailActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(gasStationDetailActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(gasStationDetailActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(gasStationDetailActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(gasStationDetailActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(gasStationDetailActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(gasStationDetailActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(gasStationDetailActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(gasStationDetailActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(gasStationDetailActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(gasStationDetailActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(gasStationDetailActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(gasStationDetailActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.gas_station.e.a(gasStationDetailActivity, this.f100474a.f100573M0.get());
            return gasStationDetailActivity;
        }

        private SpecialOffersActivity g3(SpecialOffersActivity specialOffersActivity) {
            com.meijer.mobile.meijer.activity.o.c(specialOffersActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(specialOffersActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(specialOffersActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(specialOffersActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(specialOffersActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(specialOffersActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(specialOffersActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(specialOffersActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(specialOffersActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(specialOffersActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(specialOffersActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(specialOffersActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(specialOffersActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.coupons.s.a(specialOffersActivity, this.f100474a.f100686h1.get());
            return specialOffersActivity;
        }

        private StoreActivity h3(StoreActivity storeActivity) {
            com.meijer.mobile.meijer.activity.o.c(storeActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(storeActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(storeActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(storeActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(storeActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(storeActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(storeActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(storeActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(storeActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(storeActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(storeActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(storeActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(storeActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.enrollment.E.a(storeActivity, this.f100474a.f100573M0.get());
            return storeActivity;
        }

        private HomeActivity i2(HomeActivity homeActivity) {
            com.meijer.mobile.meijer.activity.o.c(homeActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(homeActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(homeActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(homeActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(homeActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(homeActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(homeActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(homeActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(homeActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(homeActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(homeActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(homeActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(homeActivity, this.f100474a.f100514A1.get());
            HomeActivity_MembersInjector.injectNavBarItem(homeActivity, A3());
            HomeActivity_MembersInjector.injectInboxManager(homeActivity, this.f100474a.f100722o1.get());
            HomeActivity_MembersInjector.injectPreferencesRepository(homeActivity, this.f100474a.f100752u1.get());
            return homeActivity;
        }

        private StoreDetailActivity i3(StoreDetailActivity storeDetailActivity) {
            com.meijer.mobile.meijer.activity.store.f.c(storeDetailActivity, this.f100474a.Y());
            com.meijer.mobile.meijer.activity.store.f.f(storeDetailActivity, this.f100474a.f100710m.get());
            com.meijer.mobile.meijer.activity.store.f.a(storeDetailActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.store.f.e(storeDetailActivity, this.f100474a.f100568L0.get());
            com.meijer.mobile.meijer.activity.store.f.d(storeDetailActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.store.f.b(storeDetailActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.store.f.g(storeDetailActivity, this.f100474a.f100700k.get());
            return storeDetailActivity;
        }

        private HomeComposeActivity j2(HomeComposeActivity homeComposeActivity) {
            com.meijer.mobile.home.ux.U.f(homeComposeActivity, this.f100474a.U());
            com.meijer.mobile.home.ux.U.i(homeComposeActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.home.ux.U.a(homeComposeActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.home.ux.U.g(homeComposeActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.home.ux.U.m(homeComposeActivity, this.f100474a.f100715n.get());
            com.meijer.mobile.home.ux.U.n(homeComposeActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.home.ux.U.j(homeComposeActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.home.ux.U.e(homeComposeActivity, this.f100474a.f100532E.get());
            com.meijer.mobile.home.ux.U.b(homeComposeActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.home.ux.U.c(homeComposeActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.home.ux.U.d(homeComposeActivity, o1());
            com.meijer.mobile.home.ux.U.l(homeComposeActivity, this.f100474a.f100717n1.get());
            com.meijer.mobile.home.ux.U.h(homeComposeActivity, this.f100474a.f100722o1.get());
            com.meijer.mobile.home.ux.U.k(homeComposeActivity, this.f100474a.f100752u1.get());
            return homeComposeActivity;
        }

        private StoreListActivity j3(StoreListActivity storeListActivity) {
            com.meijer.mobile.meijer.activity.o.c(storeListActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(storeListActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(storeListActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(storeListActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(storeListActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(storeListActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(storeListActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(storeListActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(storeListActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(storeListActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(storeListActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(storeListActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(storeListActivity, this.f100474a.f100514A1.get());
            return storeListActivity;
        }

        private ImageDetailActivity k2(ImageDetailActivity imageDetailActivity) {
            C12090i0.a(imageDetailActivity, this.f100474a.f100735r.get());
            return imageDetailActivity;
        }

        private SubscribedItemActivity k3(SubscribedItemActivity subscribedItemActivity) {
            com.meijer.mobile.subscription.ux.subscribedItems.d.a(subscribedItemActivity, this.f100474a.f100756v0.get());
            return subscribedItemActivity;
        }

        private InProgressMccDetailActivity l2(InProgressMccDetailActivity inProgressMccDetailActivity) {
            com.meijer.mobile.meijer.activity.rewards.g.b(inProgressMccDetailActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.rewards.g.a(inProgressMccDetailActivity, this.f100474a.f100735r.get());
            return inProgressMccDetailActivity;
        }

        private SubscriptionActivity l3(SubscriptionActivity subscriptionActivity) {
            com.meijer.mobile.subscription.ux.subscription.w.a(subscriptionActivity, this.f100474a.f100756v0.get());
            return subscriptionActivity;
        }

        private LegacyShoppingListActivity m2(LegacyShoppingListActivity legacyShoppingListActivity) {
            com.meijer.mobile.meijer.activity.o.c(legacyShoppingListActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(legacyShoppingListActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(legacyShoppingListActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(legacyShoppingListActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(legacyShoppingListActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(legacyShoppingListActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(legacyShoppingListActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(legacyShoppingListActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(legacyShoppingListActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(legacyShoppingListActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(legacyShoppingListActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(legacyShoppingListActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(legacyShoppingListActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.shoppinglist.d.a(legacyShoppingListActivity, this.f100474a.f100715n.get());
            return legacyShoppingListActivity;
        }

        private SubstitutionPreferenceFormActivity m3(SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity) {
            com.meijer.mobile.meijer.activity.o.c(substitutionPreferenceFormActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(substitutionPreferenceFormActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(substitutionPreferenceFormActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(substitutionPreferenceFormActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(substitutionPreferenceFormActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(substitutionPreferenceFormActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(substitutionPreferenceFormActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(substitutionPreferenceFormActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(substitutionPreferenceFormActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(substitutionPreferenceFormActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(substitutionPreferenceFormActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(substitutionPreferenceFormActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(substitutionPreferenceFormActivity, this.f100474a.f100514A1.get());
            return substitutionPreferenceFormActivity;
        }

        private MccOptOutActivity n2(MccOptOutActivity mccOptOutActivity) {
            com.meijer.mobile.meijer.activity.o.c(mccOptOutActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(mccOptOutActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(mccOptOutActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(mccOptOutActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(mccOptOutActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(mccOptOutActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(mccOptOutActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(mccOptOutActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(mccOptOutActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(mccOptOutActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(mccOptOutActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(mccOptOutActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(mccOptOutActivity, this.f100474a.f100514A1.get());
            return mccOptOutActivity;
        }

        private TeacherListsActivity n3(TeacherListsActivity teacherListsActivity) {
            com.meijer.mobile.shoppinglist.teacherlists.ux.F.a(teacherListsActivity, this.f100474a.U());
            com.meijer.mobile.shoppinglist.teacherlists.ux.F.b(teacherListsActivity, this.f100474a.f100756v0.get());
            return teacherListsActivity;
        }

        private MeijerActivity o2(MeijerActivity meijerActivity) {
            com.meijer.mobile.meijer.activity.o.c(meijerActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(meijerActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(meijerActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(meijerActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(meijerActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(meijerActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(meijerActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(meijerActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(meijerActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(meijerActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(meijerActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(meijerActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(meijerActivity, this.f100474a.f100514A1.get());
            return meijerActivity;
        }

        private TermsAndConditionsActivity o3(TermsAndConditionsActivity termsAndConditionsActivity) {
            com.meijer.mobile.meijer.activity.o.c(termsAndConditionsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(termsAndConditionsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(termsAndConditionsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(termsAndConditionsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(termsAndConditionsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(termsAndConditionsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(termsAndConditionsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(termsAndConditionsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(termsAndConditionsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(termsAndConditionsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(termsAndConditionsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(termsAndConditionsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(termsAndConditionsActivity, this.f100474a.f100514A1.get());
            return termsAndConditionsActivity;
        }

        private MperksDashBoardActivity p2(MperksDashBoardActivity mperksDashBoardActivity) {
            e0.g(mperksDashBoardActivity, this.f100474a.f100695j.get());
            e0.b(mperksDashBoardActivity, this.f100474a.f100745t.get());
            e0.a(mperksDashBoardActivity, this.f100474a.f100735r.get());
            e0.f(mperksDashBoardActivity, this.f100474a.f100756v0.get());
            e0.e(mperksDashBoardActivity, this.f100474a.f100577N.get());
            e0.d(mperksDashBoardActivity, this.f100474a.U());
            e0.c(mperksDashBoardActivity, this.f100474a.f100532E.get());
            return mperksDashBoardActivity;
        }

        private TierDepartmentsActivity p3(TierDepartmentsActivity tierDepartmentsActivity) {
            com.meijer.mobile.meijer.activity.o.c(tierDepartmentsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(tierDepartmentsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(tierDepartmentsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(tierDepartmentsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(tierDepartmentsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(tierDepartmentsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(tierDepartmentsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(tierDepartmentsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(tierDepartmentsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(tierDepartmentsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(tierDepartmentsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(tierDepartmentsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(tierDepartmentsActivity, this.f100474a.f100514A1.get());
            return tierDepartmentsActivity;
        }

        private MperksFeatureActivity q2(MperksFeatureActivity mperksFeatureActivity) {
            e0.g(mperksFeatureActivity, this.f100474a.f100695j.get());
            e0.b(mperksFeatureActivity, this.f100474a.f100745t.get());
            e0.a(mperksFeatureActivity, this.f100474a.f100735r.get());
            e0.f(mperksFeatureActivity, this.f100474a.f100756v0.get());
            e0.e(mperksFeatureActivity, this.f100474a.f100577N.get());
            e0.d(mperksFeatureActivity, this.f100474a.U());
            e0.c(mperksFeatureActivity, this.f100474a.f100532E.get());
            return mperksFeatureActivity;
        }

        private TransactionHistoryActivity q3(TransactionHistoryActivity transactionHistoryActivity) {
            e0.g(transactionHistoryActivity, this.f100474a.f100695j.get());
            e0.b(transactionHistoryActivity, this.f100474a.f100745t.get());
            e0.a(transactionHistoryActivity, this.f100474a.f100735r.get());
            e0.f(transactionHistoryActivity, this.f100474a.f100756v0.get());
            e0.e(transactionHistoryActivity, this.f100474a.f100577N.get());
            e0.d(transactionHistoryActivity, this.f100474a.U());
            e0.c(transactionHistoryActivity, this.f100474a.f100532E.get());
            return transactionHistoryActivity;
        }

        private MperksInCartActivity r2(MperksInCartActivity mperksInCartActivity) {
            com.meijer.mobile.meijer.activity.o.c(mperksInCartActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(mperksInCartActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(mperksInCartActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(mperksInCartActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(mperksInCartActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(mperksInCartActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(mperksInCartActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(mperksInCartActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(mperksInCartActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(mperksInCartActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(mperksInCartActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(mperksInCartActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(mperksInCartActivity, this.f100474a.f100514A1.get());
            return mperksInCartActivity;
        }

        private UnauthenticatedBottomSheetActivity r3(UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity) {
            com.meijer.mobile.accounts.ux.unauthenticated.j.a(unauthenticatedBottomSheetActivity, this.f100474a.f100577N.get());
            return unauthenticatedBottomSheetActivity;
        }

        private OktaLoginActivity s2(OktaLoginActivity oktaLoginActivity) {
            com.meijer.mobile.authentication.okta.ux.k.b(oktaLoginActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.authentication.okta.ux.k.a(oktaLoginActivity, this.f100474a.f100528D0.get());
            return oktaLoginActivity;
        }

        private UnavailableForDeliveryActivity s3(UnavailableForDeliveryActivity unavailableForDeliveryActivity) {
            com.meijer.mobile.meijer.activity.o.c(unavailableForDeliveryActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(unavailableForDeliveryActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(unavailableForDeliveryActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(unavailableForDeliveryActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(unavailableForDeliveryActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(unavailableForDeliveryActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(unavailableForDeliveryActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(unavailableForDeliveryActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(unavailableForDeliveryActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(unavailableForDeliveryActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(unavailableForDeliveryActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(unavailableForDeliveryActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(unavailableForDeliveryActivity, this.f100474a.f100514A1.get());
            return unavailableForDeliveryActivity;
        }

        private OktaLogoutActivity t2(OktaLogoutActivity oktaLogoutActivity) {
            com.meijer.mobile.authentication.okta.ux.x.a(oktaLogoutActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.authentication.okta.ux.x.c(oktaLogoutActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.authentication.okta.ux.x.b(oktaLogoutActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.authentication.okta.ux.x.d(oktaLogoutActivity, this.f100477d.get());
            return oktaLogoutActivity;
        }

        private UniversalDeepLinkRedirectActivity t3(UniversalDeepLinkRedirectActivity universalDeepLinkRedirectActivity) {
            com.meijer.mobile.meijer.activity.t.b(universalDeepLinkRedirectActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.t.a(universalDeepLinkRedirectActivity, this.f100474a.f100735r.get());
            return universalDeepLinkRedirectActivity;
        }

        private OrderConfirmationActivity u2(OrderConfirmationActivity orderConfirmationActivity) {
            com.meijer.mobile.meijer.activity.o.c(orderConfirmationActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(orderConfirmationActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(orderConfirmationActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(orderConfirmationActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(orderConfirmationActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(orderConfirmationActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(orderConfirmationActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(orderConfirmationActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(orderConfirmationActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(orderConfirmationActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(orderConfirmationActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(orderConfirmationActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(orderConfirmationActivity, this.f100474a.f100514A1.get());
            return orderConfirmationActivity;
        }

        private UniversalLinkBypassActivity u3(UniversalLinkBypassActivity universalLinkBypassActivity) {
            com.meijer.mobile.meijer.activity.w.b(universalLinkBypassActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.w.a(universalLinkBypassActivity, this.f100474a.f100567L.get());
            return universalLinkBypassActivity;
        }

        private void v1(Activity activity) {
            this.f100477d = Bu.f.a(new C1401a(this.f100474a, this.f100475b, this.f100476c, 0));
            this.f100478e = Bu.f.a(new C1401a(this.f100474a, this.f100475b, this.f100476c, 1));
        }

        private OrderDetailActivity v2(OrderDetailActivity orderDetailActivity) {
            com.meijer.mobile.meijer.activity.o.c(orderDetailActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(orderDetailActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(orderDetailActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(orderDetailActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(orderDetailActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(orderDetailActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(orderDetailActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(orderDetailActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(orderDetailActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(orderDetailActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(orderDetailActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(orderDetailActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(orderDetailActivity, this.f100474a.f100514A1.get());
            return orderDetailActivity;
        }

        private WeeklyAdDetailActivity v3(WeeklyAdDetailActivity weeklyAdDetailActivity) {
            com.meijer.mobile.weeklyad.l.b(weeklyAdDetailActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.weeklyad.l.d(weeklyAdDetailActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.weeklyad.l.a(weeklyAdDetailActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.weeklyad.l.c(weeklyAdDetailActivity, t1());
            return weeklyAdDetailActivity;
        }

        private AccountOverviewActivity w1(AccountOverviewActivity accountOverviewActivity) {
            com.meijer.mobile.accounts.ux.basescreen.o.a(accountOverviewActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.accounts.ux.basescreen.o.b(accountOverviewActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.accounts.ux.basescreen.o.c(accountOverviewActivity, this.f100474a.f100756v0.get());
            return accountOverviewActivity;
        }

        private OrderOptionsActivity w2(OrderOptionsActivity orderOptionsActivity) {
            com.meijer.mobile.meijer.activity.o.c(orderOptionsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(orderOptionsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(orderOptionsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(orderOptionsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(orderOptionsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(orderOptionsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(orderOptionsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(orderOptionsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(orderOptionsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(orderOptionsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(orderOptionsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(orderOptionsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(orderOptionsActivity, this.f100474a.f100514A1.get());
            com.meijer.mobile.meijer.activity.orderoptions.q.a(orderOptionsActivity, this.f100474a.f100573M0.get());
            return orderOptionsActivity;
        }

        private WeeklyAdSelectionActivity w3(WeeklyAdSelectionActivity weeklyAdSelectionActivity) {
            com.meijer.mobile.weeklyad.s.b(weeklyAdSelectionActivity, this.f100474a.f100532E.get());
            com.meijer.mobile.weeklyad.s.a(weeklyAdSelectionActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.weeklyad.s.c(weeklyAdSelectionActivity, this.f100474a.U());
            com.meijer.mobile.weeklyad.s.e(weeklyAdSelectionActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.weeklyad.s.d(weeklyAdSelectionActivity, this.f100474a.f100577N.get());
            return weeklyAdSelectionActivity;
        }

        private AddCardAurusActivity x1(AddCardAurusActivity addCardAurusActivity) {
            com.meijer.mobile.meijer.activity.o.c(addCardAurusActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(addCardAurusActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(addCardAurusActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(addCardAurusActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(addCardAurusActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(addCardAurusActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(addCardAurusActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(addCardAurusActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(addCardAurusActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(addCardAurusActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(addCardAurusActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(addCardAurusActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(addCardAurusActivity, this.f100474a.f100514A1.get());
            return addCardAurusActivity;
        }

        private OrderOptionsFulfillmentSlotsActivity x2(OrderOptionsFulfillmentSlotsActivity orderOptionsFulfillmentSlotsActivity) {
            com.meijer.mobile.meijer.activity.o.c(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(orderOptionsFulfillmentSlotsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(orderOptionsFulfillmentSlotsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(orderOptionsFulfillmentSlotsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(orderOptionsFulfillmentSlotsActivity, this.f100474a.f100514A1.get());
            return orderOptionsFulfillmentSlotsActivity;
        }

        private WeeklyAdViewActivity x3(WeeklyAdViewActivity weeklyAdViewActivity) {
            com.meijer.mobile.weeklyad.A.b(weeklyAdViewActivity, this.f100474a.U());
            com.meijer.mobile.weeklyad.A.c(weeklyAdViewActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.weeklyad.A.a(weeklyAdViewActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.weeklyad.A.d(weeklyAdViewActivity, this.f100474a.f100715n.get());
            return weeklyAdViewActivity;
        }

        private AddReceiptActivity y1(AddReceiptActivity addReceiptActivity) {
            e0.g(addReceiptActivity, this.f100474a.f100695j.get());
            e0.b(addReceiptActivity, this.f100474a.f100745t.get());
            e0.a(addReceiptActivity, this.f100474a.f100735r.get());
            e0.f(addReceiptActivity, this.f100474a.f100756v0.get());
            e0.e(addReceiptActivity, this.f100474a.f100577N.get());
            e0.d(addReceiptActivity, this.f100474a.U());
            e0.c(addReceiptActivity, this.f100474a.f100532E.get());
            C12022f.a(addReceiptActivity, this.f100474a.f100735r.get());
            return addReceiptActivity;
        }

        private OrderSubstitutionsActivity y2(OrderSubstitutionsActivity orderSubstitutionsActivity) {
            com.meijer.mobile.meijer.activity.o.c(orderSubstitutionsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(orderSubstitutionsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(orderSubstitutionsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(orderSubstitutionsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(orderSubstitutionsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(orderSubstitutionsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(orderSubstitutionsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(orderSubstitutionsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(orderSubstitutionsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(orderSubstitutionsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(orderSubstitutionsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(orderSubstitutionsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(orderSubstitutionsActivity, this.f100474a.f100514A1.get());
            return orderSubstitutionsActivity;
        }

        private YourAccountActivity y3(YourAccountActivity yourAccountActivity) {
            com.meijer.mobile.accounts.ux.basescreen.G.b(yourAccountActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.accounts.ux.basescreen.G.a(yourAccountActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.accounts.ux.basescreen.G.c(yourAccountActivity, this.f100474a.f100756v0.get());
            return yourAccountActivity;
        }

        private AddressDetailsActivity z1(AddressDetailsActivity addressDetailsActivity) {
            com.meijer.mobile.meijer.activity.o.c(addressDetailsActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(addressDetailsActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(addressDetailsActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(addressDetailsActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(addressDetailsActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(addressDetailsActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(addressDetailsActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(addressDetailsActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(addressDetailsActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(addressDetailsActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(addressDetailsActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(addressDetailsActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(addressDetailsActivity, this.f100474a.f100514A1.get());
            return addressDetailsActivity;
        }

        private OrderSummaryActivity z2(OrderSummaryActivity orderSummaryActivity) {
            com.meijer.mobile.meijer.activity.o.c(orderSummaryActivity, this.f100474a.f100745t.get());
            com.meijer.mobile.meijer.activity.o.e(orderSummaryActivity, this.f100474a.f100740s.get());
            com.meijer.mobile.meijer.activity.o.b(orderSummaryActivity, this.f100474a.f100638Z0.get());
            com.meijer.mobile.meijer.activity.o.m(orderSummaryActivity, this.f100474a.f100695j.get());
            com.meijer.mobile.meijer.activity.o.l(orderSummaryActivity, this.f100474a.f100518B0.get());
            com.meijer.mobile.meijer.activity.o.i(orderSummaryActivity, this.f100474a.f100528D0.get());
            com.meijer.mobile.meijer.activity.o.f(orderSummaryActivity, r1());
            com.meijer.mobile.meijer.activity.o.h(orderSummaryActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.o.d(orderSummaryActivity, o1());
            com.meijer.mobile.meijer.activity.o.k(orderSummaryActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.o.g(orderSummaryActivity, this.f100474a.U());
            com.meijer.mobile.meijer.activity.o.a(orderSummaryActivity, this.f100474a.f100735r.get());
            com.meijer.mobile.meijer.activity.o.j(orderSummaryActivity, this.f100474a.f100514A1.get());
            return orderSummaryActivity;
        }

        NavBarItem A3() {
            return new NavBarItem(this.f100474a.f100695j.get(), this.f100474a.f100715n.get(), this.f100474a.f100736r0.get(), this.f100474a.f100735r.get(), this.f100474a.f100577N.get());
        }

        Ro.c B3() {
            return new Ro.c(this.f100474a.f100715n.get(), this.f100474a.f100695j.get(), this.f100474a.f100577N.get(), this.f100474a.F0(), this.f100474a.f100529D1.get(), q1(), this.f100474a.f100726p0.get(), this.f100474a.f100544G1.get(), n1(), uk.c.a());
        }

        Zn.a C3() {
            return new Zn.a(D3());
        }

        Zn.b D3() {
            return new Zn.b(this.f100474a.f100554I1.get(), this.f100474a.f100632Y.get(), uk.c.a());
        }

        @Override // xu.j.b
        public InterfaceC17625e Y() {
            return new k(this.f100474a, this.f100475b, this.f100476c);
        }

        @Override // wu.c.InterfaceC2649c
        public InterfaceC17626f i1() {
            return new m(this.f100474a, this.f100475b);
        }

        @Override // xu.C18101g.a
        public InterfaceC17623c j1() {
            return new f(this.f100474a, this.f100475b, this.f100476c);
        }

        So.b n1() {
            return new So.b(this.f100474a.f100594Q1.get(), this.f100474a.f100524C1.get(), this.f100474a.f100695j.get(), uk.c.a());
        }

        C18223b o1() {
            return new C18223b(this.f100474a.f100577N.get(), this.f100474a.f100745t.get(), this.f100474a.f100695j.get(), this.f100474a.f100532E.get());
        }

        tj.b p1() {
            return new tj.b(this.f100474a.f100632Y.get(), this.f100474a.f100715n.get(), this.f100474a.f100695j.get(), this.f100474a.f100712m1.get(), this.f100474a.f100532E.get());
        }

        Sk.a q1() {
            return new Sk.a(this.f100474a.f100579N1.get(), uk.c.a());
        }

        C5145i r1() {
            return new C5145i(this.f100474a.f100762w1.get(), this.f100474a.f100740s.get(), this.f100474a.f100767x1.get());
        }

        Ks.b s1() {
            return new Ks.b(this.f100474a.W(), Os.c.a(), Os.d.a(), uk.c.a());
        }

        Ls.b t1() {
            return new Ls.b(s1(), uk.c.a());
        }

        Dn.G u1() {
            return new Dn.G(this.f100474a.f100695j.get());
        }

        C12098m0 z3() {
            return new C12098m0(this.f100474a.X());
        }

        b(j jVar, d dVar, Activity activity) {
            this.f100474a = jVar;
            this.f100475b = dVar;
            v1(activity);
        }

        private HelpActivity h2(HelpActivity helpActivity) {
            com.meijer.mobile.meijer.activity.settings.k.c(helpActivity, u1());
            com.meijer.mobile.meijer.activity.settings.k.d(helpActivity, this.f100474a.f100756v0.get());
            com.meijer.mobile.meijer.activity.settings.k.b(helpActivity, this.f100474a.f100577N.get());
            com.meijer.mobile.meijer.activity.settings.k.a(helpActivity, this.f100474a.f100532E.get());
            return helpActivity;
        }

        @Override // com.meijer.mobile.meijer.activity.rewards.j
        public void A(MccOptOutActivity mccOptOutActivity) {
            n2(mccOptOutActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.scan.i
        public void A0(ScanActivity scanActivity) {
            U2(scanActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.orders.L
        public void B(OrderDetailActivity orderDetailActivity) {
            v2(orderDetailActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.cart.entrynote.f
        public void B0(EntryNoteActivity entryNoteActivity) {
            X1(entryNoteActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.review.InterfaceC11942b0
        public void C(CheckoutActivity checkoutActivity) {
            H1(checkoutActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.cart.p1
        public void C0(UnavailableForDeliveryActivity unavailableForDeliveryActivity) {
            s3(unavailableForDeliveryActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.find.e1
        public void D(SearchProductActivity searchProductActivity) {
            W2(searchProductActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.settings.billing.i
        public void D0(AddCardAurusActivity addCardAurusActivity) {
            x1(addCardAurusActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.cart.g1
        public void E(EditCartActivity editCartActivity) {
            V1(editCartActivity);
        }

        @Override // com.meijer.mobile.authentication.okta.ux.j
        public void E0(OktaLoginActivity oktaLoginActivity) {
            s2(oktaLoginActivity);
        }

        @Override // com.meijer.mobile.scanner.ux.activity.r
        public void F(ReceiptScanActivity receiptScanActivity) {
            O2(receiptScanActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.A
        public void F0(MperksInCartActivity mperksInCartActivity) {
            r2(mperksInCartActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.orders.InterfaceC12397c
        public void G(FlyBuyActivity flyBuyActivity) {
            c2(flyBuyActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.orders.w0
        public void G0(OrdersActivity ordersActivity) {
            A2(ordersActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.confirmation.InterfaceC11793n
        public void H0(OrderConfirmationActivity orderConfirmationActivity) {
            u2(orderConfirmationActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.coupons.e
        public void I(CouponActivity couponActivity) {
            L1(couponActivity);
        }

        @Override // com.meijer.mobile.accounts.ux.profile.j
        public void I0(ProfileScreenActivity profileScreenActivity) {
            L2(profileScreenActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.enrollment.profile.n
        public void J(ProfileEnrollmentActivity profileEnrollmentActivity) {
            K2(profileEnrollmentActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.cart.InterfaceC11738e0
        public void J0(CartActivity cartActivity) {
            E1(cartActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.personalized.modals.InterfaceC12477m0
        public void K(PersonalizedShoppingListActivity personalizedShoppingListActivity) {
            C2(personalizedShoppingListActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.settings.addresses.s
        public void K0(AddressSearchActivity addressSearchActivity) {
            A1(addressSearchActivity);
        }

        @Override // com.meijer.mobile.shopandscan.g
        public void L0(ShopAndScanActivity shopAndScanActivity) {
            Z2(shopAndScanActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.substitutionpreference.c
        public void M(SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity) {
            m3(substitutionPreferenceFormActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.shoppinglist.g
        public void M0(ShoppingListFavoritesActivity shoppingListFavoritesActivity) {
            c3(shoppingListFavoritesActivity);
        }

        @Override // com.meijer.mobile.shoppinglist.activity.d
        public void N(ShoppingListActivity shoppingListActivity) {
            a3(shoppingListActivity);
        }

        @Override // com.meijer.mobile.coupon.list.InterfaceC11622n
        public void N0(CouponListActivity couponListActivity) {
            P1(couponListActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.store.e
        public void O0(StoreDetailActivity storeDetailActivity) {
            i3(storeDetailActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.p
        public void P(ShortcutRedirectActivity shortcutRedirectActivity) {
            e3(shortcutRedirectActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.find.productdetail.U0
        public void P0(ProductDetailComposeActivity productDetailComposeActivity) {
            H2(productDetailComposeActivity);
        }

        @Override // com.meijer.mobile.mperks.ux.S
        public void Q(MperksDashBoardActivity mperksDashBoardActivity) {
            p2(mperksDashBoardActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.InterfaceC11848i0
        public void Q0(FulfillmentSlotsActivity fulfillmentSlotsActivity) {
            e2(fulfillmentSlotsActivity);
        }

        @Override // com.meijer.mobile.reviews.ux.rateandreview.U
        public void R(ProductRateAndReviewActivity productRateAndReviewActivity) {
            I2(productRateAndReviewActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.outofstock.i
        public void R0(OutOfStockActivity outOfStockActivity) {
            B2(outOfStockActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.settings.debug.InterfaceC12512i
        public void S(DebugOptionsActivity debugOptionsActivity) {
            S1(debugOptionsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.payment.ebt.d
        public void S0(EbtPinPadActivity ebtPinPadActivity) {
            U1(ebtPinPadActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.digitalreceipts.InterfaceC12021e
        public void T(AddReceiptActivity addReceiptActivity) {
            y1(addReceiptActivity);
        }

        @Override // com.meijer.mobile.coupon.di.c
        public void T0(CouponFeatureActivity couponFeatureActivity) {
            N1(couponFeatureActivity);
        }

        @Override // com.meijer.mobile.widget.d
        public void U(BarCodeActivity barCodeActivity) {
            D1(barCodeActivity);
        }

        @Override // com.meijer.mobile.accounts.ux.createaccount.d
        public void V(CreateAccountActivity createAccountActivity) {
            R1(createAccountActivity);
        }

        @Override // com.meijer.mobile.weeklyad.r
        public void V0(WeeklyAdSelectionActivity weeklyAdSelectionActivity) {
            w3(weeklyAdSelectionActivity);
        }

        @Override // com.meijer.mobile.shoppinglist.di.c
        public void W(ShoppingListFeatureActivity shoppingListFeatureActivity) {
            d3(shoppingListFeatureActivity);
        }

        @Override // com.meijer.mobile.weeklyad.k
        public void X(WeeklyAdDetailActivity weeklyAdDetailActivity) {
            v3(weeklyAdDetailActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.cart.M0
        public void X0(ChangeFulfillmentPreviewActivity changeFulfillmentPreviewActivity) {
            F1(changeFulfillmentPreviewActivity);
        }

        @Override // com.meijer.mobile.scanner.ux.activity.k
        public void Y0(ProductScanActivity productScanActivity) {
            J2(productScanActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.payment.InterfaceC11893b
        public void Z(CheckoutPaymentHostActivity checkoutPaymentHostActivity) {
            I1(checkoutPaymentHostActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.settings.x
        public void Z0(SectionWalkthroughActivity sectionWalkthroughActivity) {
            X2(sectionWalkthroughActivity);
        }

        @Override // wu.C17864a.InterfaceC2648a
        public C17864a.c a() {
            return wu.b.a(y(), new m(this.f100474a, this.f100475b));
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.payment.h0
        public void a0(CheckoutPaymentUpdateCardActivity checkoutPaymentUpdateCardActivity) {
            K1(checkoutPaymentUpdateCardActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.coupons.r
        public void a1(SpecialOffersActivity specialOffersActivity) {
            g3(specialOffersActivity);
        }

        @Override // com.meijer.mobile.subscription.ux.subscribedItems.c
        public void b(SubscribedItemActivity subscribedItemActivity) {
            k3(subscribedItemActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.find.filter.f
        public void b0(FilterActivity filterActivity) {
            Y1(filterActivity);
        }

        @Override // com.meijer.mobile.accounts.ux.preferences.b
        public void b1(PreferenceScreenActivity preferenceScreenActivity) {
            F2(preferenceScreenActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.gas_station.d
        public void c(GasStationDetailActivity gasStationDetailActivity) {
            g2(gasStationDetailActivity);
        }

        @Override // com.meijer.mobile.mperks.ux.rewardDetail.g
        public void c0(RewardsDetailsActivity rewardsDetailsActivity) {
            R2(rewardsDetailsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.n
        public void c1(MeijerActivity meijerActivity) {
            o2(meijerActivity);
        }

        @Override // com.meijer.mobile.weeklyad.z
        public void d0(WeeklyAdViewActivity weeklyAdViewActivity) {
            x3(weeklyAdViewActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.InterfaceC12030h
        public void d1(FuelReceiptFormActivity fuelReceiptFormActivity) {
            d2(fuelReceiptFormActivity);
        }

        @Override // com.meijer.mobile.rateandtip.ux.j
        public void e(RateAndTipActivity rateAndTipActivity) {
            M2(rateAndTipActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.coupons.l
        public void e0(CouponFilterActivity couponFilterActivity) {
            O1(couponFilterActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.termsandconditions.d
        public void e1(TermsAndConditionsActivity termsAndConditionsActivity) {
            o3(termsAndConditionsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.substitution.r
        public void f(FindSubstitutionActivity findSubstitutionActivity) {
            b2(findSubstitutionActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.U1
        public void f0(TierDepartmentsActivity tierDepartmentsActivity) {
            p3(tierDepartmentsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.s
        public void f1(UniversalDeepLinkRedirectActivity universalDeepLinkRedirectActivity) {
            t3(universalDeepLinkRedirectActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.digitalreceipts.InterfaceC12053o
        public void g(ReceiptsAndSavingsActivity receiptsAndSavingsActivity) {
            P2(receiptsAndSavingsActivity);
        }

        @Override // com.meijer.mobile.subscription.ux.subscription.v
        public void g0(SubscriptionActivity subscriptionActivity) {
            l3(subscriptionActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.v
        public void g1(UniversalLinkBypassActivity universalLinkBypassActivity) {
            u3(universalLinkBypassActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.digitalreceipts.InterfaceC12045g
        public void h(ReceiptDetailActivity receiptDetailActivity) {
            N2(receiptDetailActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.orders.InterfaceC12398c0
        public void h0(OrderSubstitutionsActivity orderSubstitutionsActivity) {
            y2(orderSubstitutionsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.rewards.c
        public void h1(AvailableMccDetailsActivity availableMccDetailsActivity) {
            C1(availableMccDetailsActivity);
        }

        @Override // com.meijer.mobile.chatbot.ux.f
        public void i(ChatBotActivity chatBotActivity) {
            G1(chatBotActivity);
        }

        @Override // com.meijer.mobile.accounts.ux.unauthenticated.i
        public void i0(UnauthenticatedBottomSheetActivity unauthenticatedBottomSheetActivity) {
            r3(unauthenticatedBottomSheetActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.home.HomeActivity_GeneratedInjector
        public void injectHomeActivity(HomeActivity homeActivity) {
            i2(homeActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.home.RoutingActivity_GeneratedInjector
        public void injectRoutingActivity(RoutingActivity routingActivity) {
            S2(routingActivity);
        }

        @Override // com.meijer.mobile.mperks.ux.d0
        public void j(MperksFeatureActivity mperksFeatureActivity) {
            q2(mperksFeatureActivity);
        }

        @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.E
        public void k(TeacherListsActivity teacherListsActivity) {
            n3(teacherListsActivity);
        }

        @Override // com.meijer.mobile.singlepagecheckout.InterfaceC12913d2
        public void k0(SinglePageCheckoutActivity singlePageCheckoutActivity) {
            f3(singlePageCheckoutActivity);
        }

        @Override // com.meijer.mobile.accounts.ux.basescreen.n
        public void k1(AccountOverviewActivity accountOverviewActivity) {
            w1(accountOverviewActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.orders.r0
        public void l(OrderSummaryActivity orderSummaryActivity) {
            z2(orderSummaryActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.shoppinglist.b
        public void l0(LegacyShoppingListActivity legacyShoppingListActivity) {
            m2(legacyShoppingListActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.shoppinglist.c
        public void l1(ShoppingListBaseActivity shoppingListBaseActivity) {
            b3(shoppingListBaseActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.find.InterfaceC12088h0
        public void m(ImageDetailActivity imageDetailActivity) {
            k2(imageDetailActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.orderoptions.p
        public void m0(OrderOptionsActivity orderOptionsActivity) {
            w2(orderOptionsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.digitalreceipts.InterfaceC12059v
        public void m1(SavingsDetailActivity savingsDetailActivity) {
            T2(savingsDetailActivity);
        }

        @Override // com.meijer.mobile.reviews.ux.productreview.InterfaceC12709a0
        public void n(FullReviewActivity fullReviewActivity) {
            f2(fullReviewActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.rewards.f
        public void n0(InProgressMccDetailActivity inProgressMccDetailActivity) {
            l2(inProgressMccDetailActivity);
        }

        @Override // com.meijer.mobile.scanner.ux.activity.A
        public void o(ScannerDemoActivity scannerDemoActivity) {
            V2(scannerDemoActivity);
        }

        @Override // com.meijer.mobile.authentication.okta.ux.w
        public void o0(OktaLogoutActivity oktaLogoutActivity) {
            t2(oktaLogoutActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.settings.addresses.m
        public void p(AddressDetailsActivity addressDetailsActivity) {
            z1(addressDetailsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.payment.O
        public void p0(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity) {
            J1(checkoutPaymentOptionsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.enrollment.D
        public void q(StoreActivity storeActivity) {
            h3(storeActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.find.K
        public void q0(FilteredProductsActivity filteredProductsActivity) {
            Z1(filteredProductsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.digitalreceipts.X
        public void r(SelfRemediationHostActivity selfRemediationHostActivity) {
            Y2(selfRemediationHostActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.enrollment.storeLocation.j
        public void r0(StoreListActivity storeListActivity) {
            j3(storeListActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.enrollment.k
        public void s(PhoneEnrollmentActivity phoneEnrollmentActivity) {
            D2(phoneEnrollmentActivity);
        }

        @Override // com.meijer.mobile.mperks.ux.transactionHistory.InterfaceC12688f
        public void s0(TransactionHistoryActivity transactionHistoryActivity) {
            q3(transactionHistoryActivity);
        }

        @Override // com.meijer.mobile.accounts.ux.basescreen.F
        public void t(YourAccountActivity yourAccountActivity) {
            y3(yourAccountActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.pickupperson.InterfaceC11926j
        public void t0(PickupPersonFormActivity pickupPersonFormActivity) {
            E2(pickupPersonFormActivity);
        }

        @Override // com.meijer.mobile.home.ux.T
        public void u(HomeComposeActivity homeComposeActivity) {
            j2(homeComposeActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.find.X
        public void u0(FindActivity findActivity) {
            a2(findActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.e
        public void v(OrderOptionsFulfillmentSlotsActivity orderOptionsFulfillmentSlotsActivity) {
            x2(orderOptionsFulfillmentSlotsActivity);
        }

        @Override // com.meijer.mobile.reviews.ux.productreview.r1
        public void v0(ReviewListActivity reviewListActivity) {
            Q2(reviewListActivity);
        }

        @Override // com.meijer.mobile.mperks.ux.claim.autoClaim.w
        public void w(AutoClaimDetailsActivity autoClaimDetailsActivity) {
            B1(autoClaimDetailsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.settings.j
        public void w0(HelpActivity helpActivity) {
            h2(helpActivity);
        }

        @Override // com.meijer.mobile.coupon.list.H
        public void x(CouponListTabsActivity couponListTabsActivity) {
            Q1(couponListTabsActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.orders.InterfaceC12393a
        public void x0(EditPhoneNumberActivity editPhoneNumberActivity) {
            W1(editPhoneNumberActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.checkout.contactinformation.z
        public void y0(DeliveryContactInformationFormActivity deliveryContactInformationFormActivity) {
            T1(deliveryContactInformationFormActivity);
        }

        @Override // com.meijer.mobile.coupon.detail.q
        public void z(CouponDetailActivity couponDetailActivity) {
            M1(couponDetailActivity);
        }

        @Override // com.meijer.mobile.meijer.activity.find.productdetail.S
        public void z0(ProductDetailActivity productDetailActivity) {
            G2(productDetailActivity);
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$c */
    private static final class c implements InterfaceC17622b {

        /* renamed from: a, reason: collision with root package name */
        private final j f100485a;

        /* renamed from: b, reason: collision with root package name */
        private xu.h f100486b;

        private c(j jVar) {
            this.f100485a = jVar;
        }

        @Override // vu.InterfaceC17622b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public E build() {
            Bu.c.a(this.f100486b, xu.h.class);
            return new d(this.f100485a, this.f100486b);
        }

        @Override // vu.InterfaceC17622b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a(xu.h hVar) {
            this.f100486b = (xu.h) Bu.c.b(hVar);
            return this;
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$d */
    private static final class d extends E {

        /* renamed from: a, reason: collision with root package name */
        private final j f100487a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100488b = this;

        /* renamed from: c, reason: collision with root package name */
        Bu.d<InterfaceC16834a> f100489c;

        /* renamed from: com.meijer.mobile.meijer.a$d$a, reason: collision with other inner class name */
        private static final class C1404a<T> implements Bu.d<T> {

            /* renamed from: a, reason: collision with root package name */
            private final j f100490a;

            /* renamed from: b, reason: collision with root package name */
            private final d f100491b;

            /* renamed from: c, reason: collision with root package name */
            private final int f100492c;

            @Override // kv.InterfaceC15323a
            public T get() {
                if (this.f100492c == 0) {
                    return (T) C18097c.a();
                }
                throw new AssertionError(this.f100492c);
            }

            C1404a(j jVar, d dVar, int i10) {
                this.f100490a = jVar;
                this.f100491b = dVar;
                this.f100492c = i10;
            }
        }

        private void c(xu.h hVar) {
            this.f100489c = Bu.a.b(new C1404a(this.f100487a, this.f100488b, 0));
        }

        @Override // xu.C18095a.InterfaceC2733a
        public InterfaceC17621a a() {
            return new C1400a(this.f100487a, this.f100488b);
        }

        @Override // xu.C18096b.d
        public InterfaceC16834a b() {
            return this.f100489c.get();
        }

        d(j jVar, xu.h hVar) {
            this.f100487a = jVar;
            c(hVar);
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private C5139c f100493a;

        /* renamed from: b, reason: collision with root package name */
        private C18303a f100494b;

        /* renamed from: c, reason: collision with root package name */
        private C13535g f100495c;

        /* renamed from: d, reason: collision with root package name */
        private C17130a f100496d;

        /* renamed from: e, reason: collision with root package name */
        private C15064c f100497e;

        /* renamed from: f, reason: collision with root package name */
        private Kn.t f100498f;

        /* renamed from: g, reason: collision with root package name */
        private C17300a f100499g;

        private e() {
        }

        public H b() {
            if (this.f100493a == null) {
                this.f100493a = new C5139c();
            }
            Bu.c.a(this.f100494b, C18303a.class);
            if (this.f100495c == null) {
                this.f100495c = new C13535g();
            }
            if (this.f100496d == null) {
                this.f100496d = new C17130a();
            }
            if (this.f100497e == null) {
                this.f100497e = new C15064c();
            }
            if (this.f100498f == null) {
                this.f100498f = new Kn.t();
            }
            if (this.f100499g == null) {
                this.f100499g = new C17300a();
            }
            return new j(this.f100493a, this.f100494b, this.f100495c, this.f100496d, this.f100497e, this.f100498f, this.f100499g);
        }

        public e a(C18303a c18303a) {
            this.f100494b = (C18303a) Bu.c.b(c18303a);
            return this;
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$f */
    private static final class f implements InterfaceC17623c {

        /* renamed from: a, reason: collision with root package name */
        private final j f100500a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100501b;

        /* renamed from: c, reason: collision with root package name */
        private final b f100502c;

        /* renamed from: d, reason: collision with root package name */
        private Fragment f100503d;

        private f(j jVar, d dVar, b bVar) {
            this.f100500a = jVar;
            this.f100501b = dVar;
            this.f100502c = bVar;
        }

        @Override // vu.InterfaceC17623c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public F build() {
            Bu.c.a(this.f100503d, Fragment.class);
            return new g(this.f100500a, this.f100501b, this.f100502c, this.f100503d);
        }

        @Override // vu.InterfaceC17623c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f a(Fragment fragment) {
            this.f100503d = (Fragment) Bu.c.b(fragment);
            return this;
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$g */
    private static final class g extends F {

        /* renamed from: a, reason: collision with root package name */
        private final j f100504a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100505b;

        /* renamed from: c, reason: collision with root package name */
        private final b f100506c;

        /* renamed from: d, reason: collision with root package name */
        private final g f100507d = this;

        @Override // com.meijer.mobile.meijer.activity.cart.InterfaceC11748j0
        public void j(CartBottomSheetDialogFragment cartBottomSheetDialogFragment) {
        }

        private CouponsFragment k(CouponsFragment couponsFragment) {
            Jm.u.k(couponsFragment, this.f100504a.f100740s.get());
            Jm.u.n(couponsFragment, this.f100504a.f100695j.get());
            Jm.u.a(couponsFragment, this.f100504a.f100735r.get());
            Jm.u.c(couponsFragment, this.f100504a.f100745t.get());
            Jm.u.e(couponsFragment, this.f100504a.f100633Y0.get());
            Jm.u.b(couponsFragment, this.f100504a.f100638Z0.get());
            Jm.u.l(couponsFragment, this.f100504a.f100668e1.get());
            Jm.u.f(couponsFragment, this.f100504a.f100686h1.get());
            Jm.u.m(couponsFragment, this.f100504a.f100715n.get());
            Jm.u.h(couponsFragment, this.f100504a.f100577N.get());
            Jm.u.g(couponsFragment, this.f100504a.U());
            Jm.u.d(couponsFragment, this.f100504a.f100736r0.get());
            Jm.u.j(couponsFragment, this.f100504a.f100756v0.get());
            Jm.u.i(couponsFragment, uk.c.a());
            return couponsFragment;
        }

        private ExpiryPointsDialogFragment l(ExpiryPointsDialogFragment expiryPointsDialogFragment) {
            ExpiryPointsDialogFragment_MembersInjector.injectFeatureEntryPoint(expiryPointsDialogFragment, this.f100504a.U());
            ExpiryPointsDialogFragment_MembersInjector.injectAnalyticsEngine(expiryPointsDialogFragment, this.f100504a.f100735r.get());
            return expiryPointsDialogFragment;
        }

        private HomeFragment m(HomeFragment homeFragment) {
            HomeFragment_MembersInjector.injectMeijerIntent(homeFragment, this.f100504a.f100756v0.get());
            HomeFragment_MembersInjector.injectAppPrefManager(homeFragment, this.f100504a.f100745t.get());
            HomeFragment_MembersInjector.injectFeatureManager(homeFragment, this.f100504a.f100577N.get());
            HomeFragment_MembersInjector.injectStoreProvider(homeFragment, this.f100504a.f100715n.get());
            HomeFragment_MembersInjector.injectUserManager(homeFragment, this.f100504a.f100695j.get());
            HomeFragment_MembersInjector.injectFeatureEntryPoint(homeFragment, this.f100504a.U());
            HomeFragment_MembersInjector.injectAnalyticsEngine(homeFragment, this.f100504a.f100735r.get());
            HomeFragment_MembersInjector.injectAppBackgroundManager(homeFragment, this.f100504a.f100638Z0.get());
            HomeFragment_MembersInjector.injectRateAndTipUpdater(homeFragment, this.f100504a.f100717n1.get());
            HomeFragment_MembersInjector.injectAppVersion(homeFragment, this.f100504a.f100532E.get());
            return homeFragment;
        }

        private ProductsFragment n(ProductsFragment productsFragment) {
            w0.c(productsFragment, this.f100504a.f100534E1.get());
            w0.i(productsFragment, this.f100504a.f100695j.get());
            w0.b(productsFragment, this.f100504a.f100745t.get());
            w0.e(productsFragment, this.f100504a.f100577N.get());
            w0.a(productsFragment, this.f100504a.f100735r.get());
            w0.g(productsFragment, this.f100504a.f100529D1.get());
            w0.f(productsFragment, this.f100504a.f100756v0.get());
            w0.d(productsFragment, this.f100504a.U());
            w0.h(productsFragment, this.f100504a.f100544G1.get());
            return productsFragment;
        }

        private ProductsFragmentCompose o(ProductsFragmentCompose productsFragmentCompose) {
            u0.c(productsFragmentCompose, this.f100504a.f100534E1.get());
            u0.i(productsFragmentCompose, this.f100504a.f100695j.get());
            u0.b(productsFragmentCompose, this.f100504a.f100745t.get());
            u0.e(productsFragmentCompose, this.f100504a.f100577N.get());
            u0.a(productsFragmentCompose, this.f100504a.f100735r.get());
            u0.g(productsFragmentCompose, this.f100504a.f100529D1.get());
            u0.f(productsFragmentCompose, this.f100504a.f100756v0.get());
            u0.d(productsFragmentCompose, this.f100504a.U());
            u0.h(productsFragmentCompose, this.f100504a.f100544G1.get());
            return productsFragmentCompose;
        }

        private ShoppingListAuthenticatedFragment p(ShoppingListAuthenticatedFragment shoppingListAuthenticatedFragment) {
            Fn.i.b(shoppingListAuthenticatedFragment, this.f100504a.f100638Z0.get());
            Fn.i.o(shoppingListAuthenticatedFragment, this.f100504a.f100695j.get());
            Fn.i.a(shoppingListAuthenticatedFragment, this.f100504a.f100735r.get());
            Fn.i.c(shoppingListAuthenticatedFragment, this.f100504a.f100745t.get());
            Fn.i.m(shoppingListAuthenticatedFragment, this.f100504a.f100668e1.get());
            Fn.i.g(shoppingListAuthenticatedFragment, this.f100504a.f100609T1.get());
            Fn.i.e(shoppingListAuthenticatedFragment, this.f100506c.r1());
            Fn.i.d(shoppingListAuthenticatedFragment, this.f100504a.f100740s.get());
            Fn.i.l(shoppingListAuthenticatedFragment, this.f100506c.B3());
            Fn.i.n(shoppingListAuthenticatedFragment, this.f100504a.f100715n.get());
            Fn.i.i(shoppingListAuthenticatedFragment, this.f100504a.f100577N.get());
            Fn.i.h(shoppingListAuthenticatedFragment, this.f100504a.U());
            Fn.i.f(shoppingListAuthenticatedFragment, this.f100504a.f100686h1.get());
            Fn.i.k(shoppingListAuthenticatedFragment, this.f100504a.f100756v0.get());
            Fn.i.j(shoppingListAuthenticatedFragment, uk.c.a());
            return shoppingListAuthenticatedFragment;
        }

        private ShoppingListItemDialogFragment q(ShoppingListItemDialogFragment shoppingListItemDialogFragment) {
            com.meijer.mobile.meijer.activity.shoppinglist.o.a(shoppingListItemDialogFragment, this.f100504a.f100735r.get());
            return shoppingListItemDialogFragment;
        }

        private ShoppingListUnauthenticatedFragment r(ShoppingListUnauthenticatedFragment shoppingListUnauthenticatedFragment) {
            Fn.k.a(shoppingListUnauthenticatedFragment, this.f100504a.f100577N.get());
            return shoppingListUnauthenticatedFragment;
        }

        private SuggestedProductFragment s(SuggestedProductFragment suggestedProductFragment) {
            com.meijer.mobile.meijer.activity.substitution.M.b(suggestedProductFragment, this.f100504a.U());
            com.meijer.mobile.meijer.activity.substitution.M.a(suggestedProductFragment, this.f100504a.f100534E1.get());
            com.meijer.mobile.meijer.activity.substitution.M.c(suggestedProductFragment, this.f100504a.f100577N.get());
            return suggestedProductFragment;
        }

        @Override // wu.C17864a.b
        public C17864a.c a() {
            return this.f100506c.a();
        }

        @Override // xu.j.c
        public vu.g f() {
            return new o(this.f100504a, this.f100505b, this.f100506c, this.f100507d);
        }

        g(j jVar, d dVar, b bVar, Fragment fragment) {
            this.f100504a = jVar;
            this.f100505b = dVar;
            this.f100506c = bVar;
        }

        @Override // Fn.j
        public void b(ShoppingListUnauthenticatedFragment shoppingListUnauthenticatedFragment) {
            r(shoppingListUnauthenticatedFragment);
        }

        @Override // Zm.v0
        public void c(ProductsFragment productsFragment) {
            n(productsFragment);
        }

        @Override // com.meijer.mobile.meijer.activity.substitution.L
        public void d(SuggestedProductFragment suggestedProductFragment) {
            s(suggestedProductFragment);
        }

        @Override // Jm.t
        public void e(CouponsFragment couponsFragment) {
            k(couponsFragment);
        }

        @Override // Zm.t0
        public void g(ProductsFragmentCompose productsFragmentCompose) {
            o(productsFragmentCompose);
        }

        @Override // com.meijer.mobile.meijer.activity.shoppinglist.n
        public void h(ShoppingListItemDialogFragment shoppingListItemDialogFragment) {
            q(shoppingListItemDialogFragment);
        }

        @Override // Fn.h
        public void i(ShoppingListAuthenticatedFragment shoppingListAuthenticatedFragment) {
            p(shoppingListAuthenticatedFragment);
        }

        @Override // com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment_GeneratedInjector
        public void injectExpiryPointsDialogFragment(ExpiryPointsDialogFragment expiryPointsDialogFragment) {
            l(expiryPointsDialogFragment);
        }

        @Override // com.meijer.mobile.meijer.activity.home.HomeFragment_GeneratedInjector
        public void injectHomeFragment(HomeFragment homeFragment) {
            m(homeFragment);
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$h */
    private static final class h implements InterfaceC17624d {

        /* renamed from: a, reason: collision with root package name */
        private final j f100508a;

        /* renamed from: b, reason: collision with root package name */
        private Service f100509b;

        private h(j jVar) {
            this.f100508a = jVar;
        }

        @Override // vu.InterfaceC17624d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public G build() {
            Bu.c.a(this.f100509b, Service.class);
            return new i(this.f100508a, this.f100509b);
        }

        @Override // vu.InterfaceC17624d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h a(Service service) {
            this.f100509b = (Service) Bu.c.b(service);
            return this;
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$i */
    private static final class i extends G {

        /* renamed from: a, reason: collision with root package name */
        private final j f100510a;

        /* renamed from: b, reason: collision with root package name */
        private final i f100511b = this;

        private DailyAlarmService c(DailyAlarmService dailyAlarmService) {
            Cl.b.b(dailyAlarmService, this.f100510a.f100695j.get());
            Cl.b.a(dailyAlarmService, this.f100510a.f100740s.get());
            return dailyAlarmService;
        }

        private GeoFenceTransitionsIntentService d(GeoFenceTransitionsIntentService geoFenceTransitionsIntentService) {
            Tn.c.b(geoFenceTransitionsIntentService, this.f100510a.f100695j.get());
            Tn.c.a(geoFenceTransitionsIntentService, this.f100510a.f100518B0.get());
            return geoFenceTransitionsIntentService;
        }

        i(j jVar, Service service) {
            this.f100510a = jVar;
        }

        @Override // Cl.a
        public void a(DailyAlarmService dailyAlarmService) {
            c(dailyAlarmService);
        }

        @Override // Tn.b
        public void b(GeoFenceTransitionsIntentService geoFenceTransitionsIntentService) {
            d(geoFenceTransitionsIntentService);
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$j */
    private static final class j extends H {

        /* renamed from: A, reason: collision with root package name */
        Bu.d<Integer> f100512A;

        /* renamed from: A0, reason: collision with root package name */
        Bu.d<InterfaceC18213a> f100513A0;

        /* renamed from: A1, reason: collision with root package name */
        Bu.d<InterfaceC18215a> f100514A1;

        /* renamed from: A2, reason: collision with root package name */
        Bu.d<jl.d> f100515A2;

        /* renamed from: A3, reason: collision with root package name */
        Bu.d<Ml.a> f100516A3;

        /* renamed from: B, reason: collision with root package name */
        Bu.d<String> f100517B;

        /* renamed from: B0, reason: collision with root package name */
        Bu.d<C17838h> f100518B0;

        /* renamed from: B1, reason: collision with root package name */
        Bu.d<String> f100519B1;

        /* renamed from: B2, reason: collision with root package name */
        Bu.d<String> f100520B2;

        /* renamed from: B3, reason: collision with root package name */
        Bu.d<HttpUrl> f100521B3;

        /* renamed from: C, reason: collision with root package name */
        Bu.d<Boolean> f100522C;

        /* renamed from: C0, reason: collision with root package name */
        Bu.d<FirebaseAnalytics> f100523C0;

        /* renamed from: C1, reason: collision with root package name */
        Bu.d<Du.v> f100524C1;

        /* renamed from: C2, reason: collision with root package name */
        Bu.d<BVConversationsClient> f100525C2;

        /* renamed from: C3, reason: collision with root package name */
        Bu.d<Ll.b> f100526C3;

        /* renamed from: D, reason: collision with root package name */
        Bu.d<Boolean> f100527D;

        /* renamed from: D0, reason: collision with root package name */
        Bu.d<C17828d> f100528D0;

        /* renamed from: D1, reason: collision with root package name */
        Bu.d<Ro.a> f100529D1;

        /* renamed from: D2, reason: collision with root package name */
        Bu.d<BVPixel> f100530D2;

        /* renamed from: D3, reason: collision with root package name */
        Bu.d<Ml.b> f100531D3;

        /* renamed from: E, reason: collision with root package name */
        Bu.d<AppVersion> f100532E;

        /* renamed from: E0, reason: collision with root package name */
        Bu.d<OkHttpClient> f100533E0;

        /* renamed from: E1, reason: collision with root package name */
        Bu.d<wr.f> f100534E1;

        /* renamed from: E2, reason: collision with root package name */
        Bu.d<Hp.c> f100535E2;

        /* renamed from: E3, reason: collision with root package name */
        Bu.d<HttpUrl> f100536E3;

        /* renamed from: F, reason: collision with root package name */
        Bu.d<pk.k> f100537F;

        /* renamed from: F0, reason: collision with root package name */
        Bu.d<com.squareup.picasso.o> f100538F0;

        /* renamed from: F1, reason: collision with root package name */
        Bu.d<Gm.f> f100539F1;

        /* renamed from: F2, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.preferences.a> f100540F2;

        /* renamed from: F3, reason: collision with root package name */
        Bu.d<OkHttpClient> f100541F3;

        /* renamed from: G, reason: collision with root package name */
        Bu.d<iw.a> f100542G;

        /* renamed from: G0, reason: collision with root package name */
        Bu.d<String> f100543G0;

        /* renamed from: G1, reason: collision with root package name */
        Bu.d<pp.e> f100544G1;

        /* renamed from: G2, reason: collision with root package name */
        Bu.d<HttpUrl> f100545G2;

        /* renamed from: G3, reason: collision with root package name */
        Bu.d<Retrofit.Builder> f100546G3;

        /* renamed from: H, reason: collision with root package name */
        Bu.d<Kl.c> f100547H;

        /* renamed from: H0, reason: collision with root package name */
        Bu.d<Qn.I> f100548H0;

        /* renamed from: H1, reason: collision with root package name */
        Bu.d<C15063b> f100549H1;

        /* renamed from: H2, reason: collision with root package name */
        Bu.d<InterfaceC6143a> f100550H2;

        /* renamed from: H3, reason: collision with root package name */
        Bu.d<InterfaceC16102d> f100551H3;

        /* renamed from: I, reason: collision with root package name */
        Bu.d<SharedPreferences> f100552I;

        /* renamed from: I0, reason: collision with root package name */
        Bu.d<com.google.firebase.crashlytics.a> f100553I0;

        /* renamed from: I1, reason: collision with root package name */
        Bu.d<Wn.a> f100554I1;

        /* renamed from: I2, reason: collision with root package name */
        Bu.d<Zo.c> f100555I2;

        /* renamed from: I3, reason: collision with root package name */
        Bu.d<HttpUrl> f100556I3;

        /* renamed from: J, reason: collision with root package name */
        Bu.d<yl.s> f100557J;

        /* renamed from: J0, reason: collision with root package name */
        Bu.d<Zq.a> f100558J0;

        /* renamed from: J1, reason: collision with root package name */
        Bu.d<InterfaceC13721b> f100559J1;

        /* renamed from: J2, reason: collision with root package name */
        Bu.d<com.squareup.moshi.t> f100560J2;

        /* renamed from: J3, reason: collision with root package name */
        Bu.d<InterfaceC16099a> f100561J3;

        /* renamed from: K, reason: collision with root package name */
        Bu.d<com.launchdarkly.sdk.android.b0> f100562K;

        /* renamed from: K0, reason: collision with root package name */
        Bu.d<com.squareup.moshi.t> f100563K0;

        /* renamed from: K1, reason: collision with root package name */
        Bu.d<InterfaceC13720a> f100564K1;

        /* renamed from: K2, reason: collision with root package name */
        Bu.d<Retrofit.Builder> f100565K2;

        /* renamed from: K3, reason: collision with root package name */
        Bu.d<C16103e> f100566K3;

        /* renamed from: L, reason: collision with root package name */
        Bu.d<Headers> f100567L;

        /* renamed from: L0, reason: collision with root package name */
        Bu.d<Zq.b> f100568L0;

        /* renamed from: L1, reason: collision with root package name */
        Bu.d<InterfaceC14305c> f100569L1;

        /* renamed from: L2, reason: collision with root package name */
        Bu.d<HttpUrl> f100570L2;

        /* renamed from: L3, reason: collision with root package name */
        Bu.d<C15887a> f100571L3;

        /* renamed from: M, reason: collision with root package name */
        Bu.d<C18221D> f100572M;

        /* renamed from: M0, reason: collision with root package name */
        Bu.d<LocationManager> f100573M0;

        /* renamed from: M1, reason: collision with root package name */
        Bu.d<InterfaceC14304b> f100574M1;

        /* renamed from: M2, reason: collision with root package name */
        Bu.d<InterfaceC16526a> f100575M2;

        /* renamed from: M3, reason: collision with root package name */
        Bu.d<Rl.b> f100576M3;

        /* renamed from: N, reason: collision with root package name */
        Bu.d<yl.k> f100577N;

        /* renamed from: N0, reason: collision with root package name */
        Bu.d<Object> f100578N0;

        /* renamed from: N1, reason: collision with root package name */
        Bu.d<Tk.a> f100579N1;

        /* renamed from: N2, reason: collision with root package name */
        Bu.d<OkHttpClient> f100580N2;

        /* renamed from: N3, reason: collision with root package name */
        Bu.d<Wp.b> f100581N3;

        /* renamed from: O, reason: collision with root package name */
        Bu.d<Long> f100582O;

        /* renamed from: O0, reason: collision with root package name */
        Bu.d<InterfaceC16622O> f100583O0;

        /* renamed from: O1, reason: collision with root package name */
        Bu.d<OkHttpClient.Builder> f100584O1;

        /* renamed from: O2, reason: collision with root package name */
        Bu.d<Bp.a> f100585O2;

        /* renamed from: O3, reason: collision with root package name */
        Bu.d<zq.d> f100586O3;

        /* renamed from: P, reason: collision with root package name */
        Bu.d<OkHttpClient> f100587P;

        /* renamed from: P0, reason: collision with root package name */
        Bu.d<C12560p> f100588P0;

        /* renamed from: P1, reason: collision with root package name */
        Bu.d<HttpUrl> f100589P1;

        /* renamed from: P2, reason: collision with root package name */
        Bu.d<com.squareup.moshi.t> f100590P2;

        /* renamed from: P3, reason: collision with root package name */
        Bu.d<InterfaceC16597a> f100591P3;

        /* renamed from: Q, reason: collision with root package name */
        Bu.d<InterfaceC16792a> f100592Q;

        /* renamed from: Q0, reason: collision with root package name */
        Bu.d<Z4.h> f100593Q0;

        /* renamed from: Q1, reason: collision with root package name */
        Bu.d<C18020b> f100594Q1;

        /* renamed from: Q2, reason: collision with root package name */
        Bu.d<Ep.b> f100595Q2;

        /* renamed from: Q3, reason: collision with root package name */
        Bu.d<HttpUrl> f100596Q3;

        /* renamed from: R, reason: collision with root package name */
        Bu.d<HttpUrl> f100597R;

        /* renamed from: R0, reason: collision with root package name */
        Bu.d<C18466d> f100598R0;

        /* renamed from: R1, reason: collision with root package name */
        Bu.d<Hq.b> f100599R1;

        /* renamed from: R2, reason: collision with root package name */
        Bu.d<Ep.g> f100600R2;

        /* renamed from: R3, reason: collision with root package name */
        Bu.d<InterfaceC15640a> f100601R3;

        /* renamed from: S, reason: collision with root package name */
        Bu.d<C6401a> f100602S;

        /* renamed from: S0, reason: collision with root package name */
        Bu.d<zh.n> f100603S0;

        /* renamed from: S1, reason: collision with root package name */
        Bu.d<Hq.a> f100604S1;

        /* renamed from: S2, reason: collision with root package name */
        Bu.d<HttpUrl> f100605S2;

        /* renamed from: S3, reason: collision with root package name */
        Bu.d<C15641b> f100606S3;

        /* renamed from: T, reason: collision with root package name */
        Bu.d<Interceptor> f100607T;

        /* renamed from: T0, reason: collision with root package name */
        Bu.d<String> f100608T0;

        /* renamed from: T1, reason: collision with root package name */
        Bu.d<Eq.a> f100609T1;

        /* renamed from: T2, reason: collision with root package name */
        Bu.d<Bp.b> f100610T2;

        /* renamed from: T3, reason: collision with root package name */
        Bu.d<C15645f> f100611T3;

        /* renamed from: U, reason: collision with root package name */
        Bu.d<Interceptor> f100612U;

        /* renamed from: U0, reason: collision with root package name */
        Bu.d<EmarsysConfig> f100613U0;

        /* renamed from: U1, reason: collision with root package name */
        Bu.d<C18085d> f100614U1;

        /* renamed from: U2, reason: collision with root package name */
        Bu.d<Ep.e> f100615U2;

        /* renamed from: U3, reason: collision with root package name */
        Bu.d<HttpUrl> f100616U3;

        /* renamed from: V, reason: collision with root package name */
        Bu.d<OkHttpClient> f100617V;

        /* renamed from: V0, reason: collision with root package name */
        Bu.d<L8.d> f100618V0;

        /* renamed from: V1, reason: collision with root package name */
        Bu.d<yh.c> f100619V1;

        /* renamed from: V2, reason: collision with root package name */
        Bu.d<Ep.d> f100620V2;

        /* renamed from: V3, reason: collision with root package name */
        Bu.d<InterfaceC16536a> f100621V3;

        /* renamed from: W, reason: collision with root package name */
        Bu.d<String> f100622W;

        /* renamed from: W0, reason: collision with root package name */
        Bu.d<Un.f> f100623W0;

        /* renamed from: W1, reason: collision with root package name */
        Bu.d<Bh.e> f100624W1;

        /* renamed from: W2, reason: collision with root package name */
        Bu.d<InterfaceC15297a> f100625W2;

        /* renamed from: W3, reason: collision with root package name */
        Bu.d<C16537b> f100626W3;

        /* renamed from: X, reason: collision with root package name */
        Bu.d<b.Companion> f100627X;

        /* renamed from: X0, reason: collision with root package name */
        Bu.d<Un.b> f100628X0;

        /* renamed from: X1, reason: collision with root package name */
        Bu.d<C18464b> f100629X1;

        /* renamed from: X2, reason: collision with root package name */
        Bu.d<C15069b> f100630X2;

        /* renamed from: X3, reason: collision with root package name */
        Bu.d<C16547l> f100631X3;

        /* renamed from: Y, reason: collision with root package name */
        Bu.d<Xi.a> f100632Y;

        /* renamed from: Y0, reason: collision with root package name */
        Bu.d<C5283b> f100633Y0;

        /* renamed from: Y1, reason: collision with root package name */
        Bu.d<HttpUrl> f100634Y1;

        /* renamed from: Y2, reason: collision with root package name */
        Bu.d<Geocoder> f100635Y2;

        /* renamed from: Y3, reason: collision with root package name */
        Bu.d<Jd.r> f100636Y3;

        /* renamed from: Z, reason: collision with root package name */
        Bu.d<C16794c> f100637Z;

        /* renamed from: Z0, reason: collision with root package name */
        Bu.d<C17279b> f100638Z0;

        /* renamed from: Z1, reason: collision with root package name */
        Bu.d<HttpUrl> f100639Z1;

        /* renamed from: Z2, reason: collision with root package name */
        Bu.d<BVSDK> f100640Z2;

        /* renamed from: Z3, reason: collision with root package name */
        Bu.d<vq.e> f100641Z3;

        /* renamed from: a, reason: collision with root package name */
        private final C18303a f100642a;

        /* renamed from: a0, reason: collision with root package name */
        Bu.d<C14490b> f100643a0;

        /* renamed from: a1, reason: collision with root package name */
        Bu.d<HttpUrl> f100644a1;

        /* renamed from: a2, reason: collision with root package name */
        Bu.d<Ti.a> f100645a2;

        /* renamed from: a3, reason: collision with root package name */
        Bu.d<String> f100646a3;

        /* renamed from: a4, reason: collision with root package name */
        Bu.d<C16829a> f100647a4;

        /* renamed from: b, reason: collision with root package name */
        private final C5139c f100648b;

        /* renamed from: b0, reason: collision with root package name */
        Bu.d<C14488C> f100649b0;

        /* renamed from: b1, reason: collision with root package name */
        Bu.d<Hq.d> f100650b1;

        /* renamed from: b2, reason: collision with root package name */
        Bu.d<PlacesClient> f100651b2;

        /* renamed from: b3, reason: collision with root package name */
        Bu.d<com.meijer.mobile.reviews.service.a> f100652b3;

        /* renamed from: b4, reason: collision with root package name */
        Bu.d<SubscriptionStaticConfig> f100653b4;

        /* renamed from: c, reason: collision with root package name */
        private final Kn.t f100654c;

        /* renamed from: c0, reason: collision with root package name */
        Bu.d<InterfaceC14494f> f100655c0;

        /* renamed from: c1, reason: collision with root package name */
        Bu.d<Hq.e> f100656c1;

        /* renamed from: c2, reason: collision with root package name */
        Bu.d<yh.b> f100657c2;

        /* renamed from: c3, reason: collision with root package name */
        Bu.d<Kp.g> f100658c3;

        /* renamed from: c4, reason: collision with root package name */
        Bu.d<HttpUrl> f100659c4;

        /* renamed from: d, reason: collision with root package name */
        private final C13535g f100660d;

        /* renamed from: d0, reason: collision with root package name */
        Bu.d<Xi.c> f100661d0;

        /* renamed from: d1, reason: collision with root package name */
        Bu.d<Hq.c> f100662d1;

        /* renamed from: d2, reason: collision with root package name */
        Bu.d<HttpUrl> f100663d2;

        /* renamed from: d3, reason: collision with root package name */
        Bu.d<Bp.c> f100664d3;

        /* renamed from: d4, reason: collision with root package name */
        Bu.d<Oq.a> f100665d4;

        /* renamed from: e, reason: collision with root package name */
        private final C15064c f100666e;

        /* renamed from: e0, reason: collision with root package name */
        Bu.d<MPerksAccountManager> f100667e0;

        /* renamed from: e1, reason: collision with root package name */
        Bu.d<Eq.b> f100668e1;

        /* renamed from: e2, reason: collision with root package name */
        Bu.d<InterfaceC15422a> f100669e2;

        /* renamed from: e3, reason: collision with root package name */
        Bu.d<C14274a> f100670e3;

        /* renamed from: e4, reason: collision with root package name */
        Bu.d<HttpUrl> f100671e4;

        /* renamed from: f, reason: collision with root package name */
        private final C17130a f100672f;

        /* renamed from: f0, reason: collision with root package name */
        Bu.d<HttpUrl> f100673f0;

        /* renamed from: f1, reason: collision with root package name */
        Bu.d<HttpUrl> f100674f1;

        /* renamed from: f2, reason: collision with root package name */
        Bu.d<ll.d> f100675f2;

        /* renamed from: f3, reason: collision with root package name */
        Bu.d<Xl.a> f100676f3;

        /* renamed from: f4, reason: collision with root package name */
        Bu.d<Oq.b> f100677f4;

        /* renamed from: g, reason: collision with root package name */
        private final C17300a f100678g;

        /* renamed from: g0, reason: collision with root package name */
        Bu.d<hl.p> f100679g0;

        /* renamed from: g1, reason: collision with root package name */
        Bu.d<Zk.b> f100680g1;

        /* renamed from: g2, reason: collision with root package name */
        Bu.d<ll.e> f100681g2;

        /* renamed from: g3, reason: collision with root package name */
        Bu.d<Xl.c> f100682g3;

        /* renamed from: g4, reason: collision with root package name */
        Bu.d<Nq.a> f100683g4;

        /* renamed from: h, reason: collision with root package name */
        private final j f100684h = this;

        /* renamed from: h0, reason: collision with root package name */
        Bu.d<HttpUrl> f100685h0;

        /* renamed from: h1, reason: collision with root package name */
        Bu.d<C6412d> f100686h1;

        /* renamed from: h2, reason: collision with root package name */
        Bu.d<HttpUrl> f100687h2;

        /* renamed from: h3, reason: collision with root package name */
        Bu.d<Nv.a> f100688h3;

        /* renamed from: h4, reason: collision with root package name */
        Bu.d<Lq.b> f100689h4;

        /* renamed from: i, reason: collision with root package name */
        Bu.d<SharedPreferences> f100690i;

        /* renamed from: i0, reason: collision with root package name */
        Bu.d<com.squareup.moshi.t> f100691i0;

        /* renamed from: i1, reason: collision with root package name */
        Bu.d<com.squareup.moshi.t> f100692i1;

        /* renamed from: i2, reason: collision with root package name */
        Bu.d<InterfaceC16796a> f100693i2;

        /* renamed from: i3, reason: collision with root package name */
        Bu.d<com.squareup.moshi.t> f100694i3;

        /* renamed from: j, reason: collision with root package name */
        Bu.d<yo.k> f100695j;

        /* renamed from: j0, reason: collision with root package name */
        Bu.d<InterfaceC16596d> f100696j0;

        /* renamed from: j1, reason: collision with root package name */
        Bu.d<th.h> f100697j1;

        /* renamed from: j2, reason: collision with root package name */
        Bu.d<HttpUrl> f100698j2;

        /* renamed from: j3, reason: collision with root package name */
        Bu.d<Nv.b> f100699j3;

        /* renamed from: k, reason: collision with root package name */
        Bu.d<Cs.b> f100700k;

        /* renamed from: k0, reason: collision with root package name */
        Bu.d<HttpUrl> f100701k0;

        /* renamed from: k1, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.createaccount.t> f100702k1;

        /* renamed from: k2, reason: collision with root package name */
        Bu.d<Dl.a> f100703k2;

        /* renamed from: k3, reason: collision with root package name */
        Bu.d<Xl.b> f100704k3;

        /* renamed from: l, reason: collision with root package name */
        Bu.d<SharedPreferences> f100705l;

        /* renamed from: l0, reason: collision with root package name */
        Bu.d<InterfaceC16595c> f100706l0;

        /* renamed from: l1, reason: collision with root package name */
        Bu.d<Xi.b> f100707l1;

        /* renamed from: l2, reason: collision with root package name */
        Bu.d<InterfaceC16317a> f100708l2;

        /* renamed from: l3, reason: collision with root package name */
        Bu.d<OkHttpClient> f100709l3;

        /* renamed from: m, reason: collision with root package name */
        Bu.d<yo.f> f100710m;

        /* renamed from: m0, reason: collision with root package name */
        Bu.d<FirebaseMessaging> f100711m0;

        /* renamed from: m1, reason: collision with root package name */
        Bu.d<HttpUrl> f100712m1;

        /* renamed from: m2, reason: collision with root package name */
        Bu.d<HttpUrl> f100713m2;

        /* renamed from: m3, reason: collision with root package name */
        Bu.d<InterfaceC16593a> f100714m3;

        /* renamed from: n, reason: collision with root package name */
        Bu.d<Tq.j> f100715n;

        /* renamed from: n0, reason: collision with root package name */
        Bu.d<String> f100716n0;

        /* renamed from: n1, reason: collision with root package name */
        Bu.d<C17129c> f100717n1;

        /* renamed from: n2, reason: collision with root package name */
        Bu.d<ql.c> f100718n2;

        /* renamed from: n3, reason: collision with root package name */
        Bu.d<C16594b> f100719n3;

        /* renamed from: o, reason: collision with root package name */
        Bu.d<C17827c> f100720o;

        /* renamed from: o0, reason: collision with root package name */
        Bu.d<C13666c> f100721o0;

        /* renamed from: o1, reason: collision with root package name */
        Bu.d<Fh.b> f100722o1;

        /* renamed from: o2, reason: collision with root package name */
        Bu.d<com.squareup.moshi.t> f100723o2;

        /* renamed from: o3, reason: collision with root package name */
        Bu.d<InterfaceC13751a> f100724o3;

        /* renamed from: p, reason: collision with root package name */
        Bu.d<xj.i> f100725p;

        /* renamed from: p0, reason: collision with root package name */
        Bu.d<C16348c> f100726p0;

        /* renamed from: p1, reason: collision with root package name */
        Bu.d<yh.l> f100727p1;

        /* renamed from: p2, reason: collision with root package name */
        Bu.d<com.meijer.mobile.digitalshopping.api.orders.a> f100728p2;

        /* renamed from: p3, reason: collision with root package name */
        Bu.d<C14758a> f100729p3;

        /* renamed from: q, reason: collision with root package name */
        Bu.d<C14265e> f100730q;

        /* renamed from: q0, reason: collision with root package name */
        Bu.d<hl.y> f100731q0;

        /* renamed from: q1, reason: collision with root package name */
        Bu.d<yh.j> f100732q1;

        /* renamed from: q2, reason: collision with root package name */
        Bu.d<InterfaceC16984c> f100733q2;

        /* renamed from: q3, reason: collision with root package name */
        Bu.d<Bh.b> f100734q3;

        /* renamed from: r, reason: collision with root package name */
        Bu.d<InterfaceC14261a> f100735r;

        /* renamed from: r0, reason: collision with root package name */
        Bu.d<hl.m> f100736r0;

        /* renamed from: r1, reason: collision with root package name */
        Bu.d<HttpUrl> f100737r1;

        /* renamed from: r2, reason: collision with root package name */
        Bu.d<sl.g> f100738r2;

        /* renamed from: r3, reason: collision with root package name */
        Bu.d<C12063a> f100739r3;

        /* renamed from: s, reason: collision with root package name */
        Bu.d<Ck.b> f100740s;

        /* renamed from: s0, reason: collision with root package name */
        Bu.d<C14247f> f100741s0;

        /* renamed from: s1, reason: collision with root package name */
        Bu.d<OkHttpClient> f100742s1;

        /* renamed from: s2, reason: collision with root package name */
        Bu.d<C16983b> f100743s2;

        /* renamed from: s3, reason: collision with root package name */
        Bu.d<up.f> f100744s3;

        /* renamed from: t, reason: collision with root package name */
        Bu.d<C18264a> f100745t;

        /* renamed from: t0, reason: collision with root package name */
        Bu.d<Qn.P> f100746t0;

        /* renamed from: t1, reason: collision with root package name */
        Bu.d<yh.k> f100747t1;

        /* renamed from: t2, reason: collision with root package name */
        Bu.d<sl.h> f100748t2;

        /* renamed from: t3, reason: collision with root package name */
        Bu.d<up.e> f100749t3;

        /* renamed from: u, reason: collision with root package name */
        Bu.d<C18265b> f100750u;

        /* renamed from: u0, reason: collision with root package name */
        Bu.d<Cl.g> f100751u0;

        /* renamed from: u1, reason: collision with root package name */
        Bu.d<Bh.d> f100752u1;

        /* renamed from: u2, reason: collision with root package name */
        Bu.d<jl.t> f100753u2;

        /* renamed from: u3, reason: collision with root package name */
        Bu.d<Pm.b> f100754u3;

        /* renamed from: v, reason: collision with root package name */
        Bu.d<NotificationManager> f100755v;

        /* renamed from: v0, reason: collision with root package name */
        Bu.d<Cl.e> f100756v0;

        /* renamed from: v1, reason: collision with root package name */
        Bu.d<WifiManager> f100757v1;

        /* renamed from: v2, reason: collision with root package name */
        Bu.d<InterfaceC14301c> f100758v2;

        /* renamed from: v3, reason: collision with root package name */
        Bu.d<ShopAndScanDatabase> f100759v3;

        /* renamed from: w, reason: collision with root package name */
        Bu.d<HttpUrl> f100760w;

        /* renamed from: w0, reason: collision with root package name */
        Bu.d<AlarmManager> f100761w0;

        /* renamed from: w1, reason: collision with root package name */
        Bu.d<C5146j> f100762w1;

        /* renamed from: w2, reason: collision with root package name */
        Bu.d<InterfaceC14300b> f100763w2;

        /* renamed from: w3, reason: collision with root package name */
        Bu.d<Tp.g> f100764w3;

        /* renamed from: x, reason: collision with root package name */
        Bu.d<String> f100765x;

        /* renamed from: x0, reason: collision with root package name */
        Bu.d<Qn.V> f100766x0;

        /* renamed from: x1, reason: collision with root package name */
        Bu.d<CaptivePortalTester> f100767x1;

        /* renamed from: x2, reason: collision with root package name */
        Bu.d<InterfaceC14299a> f100768x2;

        /* renamed from: x3, reason: collision with root package name */
        Bu.d<Tp.a> f100769x3;

        /* renamed from: y, reason: collision with root package name */
        Bu.d<ConnectivityManager> f100770y;

        /* renamed from: y0, reason: collision with root package name */
        Bu.d<HttpUrl> f100771y0;

        /* renamed from: y1, reason: collision with root package name */
        Bu.d<Rf.d> f100772y1;

        /* renamed from: y2, reason: collision with root package name */
        Bu.d<InterfaceC14302d> f100773y2;

        /* renamed from: y3, reason: collision with root package name */
        Bu.d<HttpUrl> f100774y3;

        /* renamed from: z, reason: collision with root package name */
        Bu.d<String> f100775z;

        /* renamed from: z0, reason: collision with root package name */
        Bu.d<OkHttpClient> f100776z0;

        /* renamed from: z1, reason: collision with root package name */
        Bu.d<C18216b> f100777z1;

        /* renamed from: z2, reason: collision with root package name */
        Bu.d<pp.d> f100778z2;

        /* renamed from: z3, reason: collision with root package name */
        Bu.d<Ll.a> f100779z3;

        /* renamed from: com.meijer.mobile.meijer.a$j$a, reason: collision with other inner class name */
        private static final class C1405a<T> implements Bu.d<T> {

            /* renamed from: a, reason: collision with root package name */
            private final j f100780a;

            /* renamed from: b, reason: collision with root package name */
            private final int f100781b;

            /* renamed from: com.meijer.mobile.meijer.a$j$a$a, reason: collision with other inner class name */
            class C1406a implements P2.b {
                C1406a() {
                }

                @Override // P2.b
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public GeoFenceStoreSetupWorker a(Context context, WorkerParameters workerParameters) {
                    return new GeoFenceStoreSetupWorker(context, workerParameters, C1405a.this.f100780a.f100568L0.get(), C1405a.this.f100780a.f100715n.get(), C1405a.this.f100780a.f100740s.get(), C1405a.this.f100780a.f100573M0.get(), uk.c.a());
                }
            }

            private T b() {
                switch (this.f100781b) {
                    case 0:
                        return (T) C18060c.a(this.f100780a.f100730q.get());
                    case 1:
                        return (T) new C14265e(this.f100780a.f100700k.get(), this.f100780a.f100715n.get(), this.f100780a.w0());
                    case 2:
                        return (T) C18565b.a(this.f100780a.f100695j.get());
                    case 3:
                        return (T) new yo.k(this.f100780a.f100690i.get());
                    case 4:
                        return (T) Kn.g.a(C18305c.a(this.f100780a.f100642a));
                    case 5:
                        return (T) yo.i.a(this.f100780a.f100710m.get());
                    case 6:
                        return (T) new yo.f(this.f100780a.f100705l.get());
                    case 7:
                        return (T) Kn.c.a(C18305c.a(this.f100780a.f100642a));
                    case 8:
                        return (T) new C17827c();
                    case 9:
                        return (T) new xj.i();
                    case 10:
                        return (T) new MPerksAccountManager(this.f100780a.f100740s.get(), this.f100780a.f100695j.get(), this.f100780a.f100710m.get(), this.f100780a.f100745t.get(), this.f100780a.f100750u.get(), this.f100780a.f100755v.get(), this.f100780a.f100655c0.get(), this.f100780a.f100661d0.get());
                    case 11:
                        return (T) new Ck.b();
                    case 12:
                        return (T) new C18264a(this.f100780a.f100705l.get());
                    case 13:
                        return (T) new C18265b(C18305c.a(this.f100780a.f100642a), this.f100780a.f100695j.get(), uk.c.a());
                    case 14:
                        return (T) Kn.a.f17427a.g(C18305c.a(this.f100780a.f100642a));
                    case 15:
                        return (T) C14496h.a(this.f100780a.f100649b0.get());
                    case 16:
                        return (T) new C14488C(this.f100780a.f100715n.get(), this.f100780a.f100700k.get(), this.f100780a.K(), this.f100780a.f100643a0.get());
                    case 17:
                        return (T) C16980b.a(this.f100780a.f100760w.get(), this.f100780a.f100587P.get());
                    case 18:
                        return (T) Il.t.a();
                    case 19:
                        return (T) Jl.b.a(this.f100780a.f100765x.get(), this.f100780a.B0(), this.f100780a.f100537F.get(), this.f100780a.f100542G.get(), this.f100780a.f100547H.get(), this.f100780a.f100577N.get(), this.f100780a.f100582O.get().longValue());
                    case 20:
                        return (T) Il.G.a();
                    case 21:
                        return (T) Kn.a.f17427a.f(C18305c.a(this.f100780a.f100642a));
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                        return (T) new pk.k(this.f100780a.f100532E.get());
                    case 23:
                        return (T) new AppVersion(this.f100780a.f100775z.get(), this.f100780a.f100512A.get().intValue(), this.f100780a.f100517B.get(), this.f100780a.f100522C.get().booleanValue(), this.f100780a.f100527D.get().booleanValue());
                    case 24:
                        return (T) Kn.i.a();
                    case 25:
                        return (T) Integer.valueOf(Kn.h.f17428a.b());
                    case 26:
                        return (T) Kn.j.a();
                    case 27:
                        return (T) Boolean.valueOf(Kn.h.f17428a.d());
                    case 28:
                        return (T) Boolean.valueOf(Kn.h.f17428a.c());
                    case 29:
                        return (T) pk.d.a(this.f100780a.f100532E.get());
                    case 30:
                        return (T) new Kl.c();
                    case 31:
                        return (T) new yl.k(this.f100780a.f100557J.get(), this.f100780a.f100572M.get());
                    case l3.f92486e /* 32 */:
                        return (T) new yl.s(this.f100780a.f100552I.get(), this.f100780a.f100522C.get().booleanValue());
                    case 33:
                        return (T) yl.j.a(C18305c.a(this.f100780a.f100642a));
                    case 34:
                        return (T) new C18221D(this.f100780a.f100695j.get(), this.f100780a.f100715n.get(), this.f100780a.f100562K.get(), this.f100780a.f100567L.get());
                    case 35:
                        return (T) C18536d.a(C18304b.a(this.f100780a.f100642a), this.f100780a.r0(), this.f100780a.s0());
                    case 36:
                        return (T) zk.c.a(this.f100780a.f100532E.get());
                    case 37:
                        return (T) Long.valueOf(C16315b.f155784a.g(this.f100780a.f100532E.get()));
                    case 38:
                        return (T) C6405e.a(this.f100780a.C0());
                    case 39:
                        return (T) C6258c.a(C18305c.a(this.f100780a.f100642a), this.f100780a.f100617V.get(), this.f100780a.f100597R.get(), this.f100780a.f100622W.get());
                    case 40:
                        return (T) C6259d.a(this.f100780a.A0());
                    case 41:
                        return (T) C6403c.a(this.f100780a.f100602S.get());
                    case 42:
                        return (T) new C6401a(C18305c.a(this.f100780a.f100642a), this.f100780a.f100597R.get());
                    case 43:
                        return (T) Il.u.a();
                    case 44:
                        return (T) C6404d.a(this.f100780a.f100537F.get());
                    case 45:
                        return (T) Wi.b.a();
                    case 46:
                        return (T) new C14490b(this.f100780a.f100637Z.get(), this.f100780a.f100715n.get());
                    case 47:
                        return (T) new C16794c(this.f100780a.f100632Y.get(), this.f100780a.f100592Q.get(), uk.c.a());
                    case 48:
                        return (T) C6406f.a(this.f100780a.C0());
                    case 49:
                        return (T) new hl.m(this.f100780a.f100632Y.get(), this.f100780a.f100715n.get(), this.f100780a.f100649b0.get(), this.f100780a.K(), this.f100780a.f100679g0.get(), this.f100780a.f100643a0.get(), this.f100780a.f100577N.get(), this.f100780a.f100726p0.get(), this.f100780a.t0(), this.f100780a.f100731q0.get(), uk.c.a());
                    case 50:
                        return (T) C14492d.a(this.f100780a.f100673f0.get(), this.f100780a.f100587P.get());
                    case 51:
                        return (T) Il.j.a();
                    case 52:
                        return (T) new C16348c(this.f100780a.f100700k.get(), this.f100780a.f100715n.get(), this.f100780a.f100696j0.get(), this.f100780a.f100706l0.get(), this.f100780a.S(), uk.c.a());
                    case 53:
                        return (T) rp.e.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get(), this.f100780a.f100691i0.get());
                    case 54:
                        return (T) Il.h.a();
                    case 55:
                        return (T) Fu.j.c();
                    case 56:
                        return (T) rp.d.a(this.f100780a.f100701k0.get(), this.f100780a.f100587P.get(), this.f100780a.f100691i0.get());
                    case 57:
                        return (T) C3759g.a();
                    case 58:
                        return (T) new C13666c(C18305c.a(this.f100780a.f100642a), this.f100780a.f100577N.get(), this.f100780a.f100711m0.get(), this.f100780a.f100532E.get(), this.f100780a.f100716n0.get(), uk.c.a());
                    case 59:
                        return (T) Kn.o.a();
                    case 60:
                        return (T) C5138b.a();
                    case 61:
                        return (T) C14493e.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 62:
                        return (T) new Qn.P(C18305c.a(this.f100780a.f100642a), this.f100780a.f100740s.get(), this.f100780a.f100695j.get(), this.f100780a.f100741s0.get());
                    case 63:
                        return (T) Qn.S.a();
                    case 64:
                        return (T) new Qn.V(C18305c.a(this.f100780a.f100642a), this.f100780a.f100740s.get(), this.f100780a.f100695j.get(), this.f100780a.Y(), this.f100780a.f100756v0.get(), this.f100780a.f100761w0.get());
                    case 65:
                        return (T) new Cl.e(this.f100780a.f100577N.get(), this.f100780a.f100715n.get(), this.f100780a.f100695j.get(), this.f100780a.U(), this.f100780a.f100751u0.get(), this.f100780a.f100532E.get());
                    case 66:
                        return (T) Cl.d.a();
                    case 67:
                        return (T) this.f100780a.f100648b.a(C18305c.a(this.f100780a.f100642a));
                    case 68:
                        return (T) new C17838h(C18305c.a(this.f100780a.f100642a), this.f100780a.f100740s.get(), this.f100780a.f100755v.get(), this.f100780a.f100695j.get(), this.f100780a.Z(), this.f100780a.f100756v0.get(), this.f100780a.f100735r.get());
                    case 69:
                        return (T) C18053b.a(this.f100780a.f100771y0.get(), this.f100780a.f100776z0.get());
                    case 70:
                        return (T) Il.m.a();
                    case 71:
                        return (T) pk.e.a(this.f100780a.B0(), this.f100780a.f100537F.get(), this.f100780a.f100542G.get(), this.f100780a.f100567L.get());
                    case 72:
                        return (T) C18062e.a(this.f100780a.f100523C0.get(), this.f100780a.f100517B.get());
                    case 73:
                        return (T) C18061d.a(C18305c.a(this.f100780a.f100642a));
                    case 74:
                        return (T) Kn.u.a(this.f100780a.f100654c, C18305c.a(this.f100780a.f100642a), this.f100780a.f100533E0.get());
                    case 75:
                        return (T) Kn.v.a(this.f100780a.f100654c, this.f100780a.f100567L.get(), this.f100780a.f100537F.get());
                    case 76:
                        return (T) new Qn.I(C18305c.a(this.f100780a.f100642a), this.f100780a.f100711m0.get(), this.f100780a.f100755v.get(), this.f100780a.f100695j.get(), this.f100780a.f100756v0.get(), this.f100780a.f100543G0.get());
                    case 77:
                        return (T) Kn.q.a();
                    case 78:
                        return (T) Kn.n.a();
                    case 79:
                        return (T) new C1406a();
                    case BinsView.LABEL_WIDTH_DP /* 80 */:
                        return (T) new Zq.b(this.f100780a.f100558J0.get(), this.f100780a.f100563K0.get(), uk.c.a());
                    case 81:
                        return (T) C6280b.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 82:
                        return (T) C6281c.a();
                    case 83:
                        return (T) Kn.a.f17427a.e(C18305c.a(this.f100780a.f100642a));
                    case 84:
                        return (T) new C12560p(this.f100780a.f100695j.get(), this.f100780a.f100655c0.get(), this.f100780a.f100715n.get(), this.f100780a.f100583O0.get());
                    case 85:
                        return (T) Kn.b.a(uk.b.a());
                    case 86:
                        return (T) C13536h.a(this.f100780a.f100660d, C18305c.a(this.f100780a.f100642a), this.f100780a.f100567L.get(), uk.c.a(), this.f100780a.f100537F.get(), this.f100780a.f100532E.get());
                    case 87:
                        return (T) new Un.b(this.f100780a.f100695j.get(), this.f100780a.f100603S0.get(), this.f100780a.f100690i.get(), this.f100780a.f100755v.get(), this.f100780a.f100583O0.get(), this.f100780a.f100618V0.get(), this.f100780a.f100623W0.get());
                    case 88:
                        return (T) zh.m.a(this.f100780a.f100598R0.get());
                    case 89:
                        return (T) new C18466d(this.f100780a.f100711m0.get());
                    case 90:
                        return (T) Un.e.a(this.f100780a.f100613U0.get());
                    case 91:
                        return (T) Un.d.a(C18304b.a(this.f100780a.f100642a), this.f100780a.f100608T0.get(), this.f100780a.f100532E.get());
                    case 92:
                        return (T) Kn.l.a();
                    case 93:
                        return (T) new Un.f(this.f100780a.f100756v0.get());
                    case 94:
                        return (T) new C5283b();
                    case 95:
                        return (T) new C17279b(this.f100780a.f100740s.get(), this.f100780a.f100695j.get());
                    case 96:
                        return (T) new Eq.b(this.f100780a.f100662d1.get(), this.f100780a.f100532E.get(), uk.c.a());
                    case 97:
                        return (T) com.meijer.mobile.shoppinglist.di.h.a(this.f100780a.f100656c1.get());
                    case 98:
                        return (T) new Hq.e(this.f100780a.f100650b1.get(), this.f100780a.f100632Y.get(), uk.c.a());
                    case 99:
                        return (T) com.meijer.mobile.shoppinglist.di.g.a(this.f100780a.f100644a1.get(), this.f100780a.f100587P.get());
                    default:
                        throw new AssertionError(this.f100781b);
                }
            }

            private T c() {
                switch (this.f100781b) {
                    case HttpResponseStatus.INFORMATIONAL_CONTINUE /* 100 */:
                        return (T) Il.i.a();
                    case 101:
                        return (T) new C6412d(this.f100780a.Q(), this.f100780a.f100715n.get(), uk.c.a());
                    case 102:
                        return (T) bl.c.a(this.f100780a.f100674f1.get(), this.f100780a.f100587P.get());
                    case 103:
                        return (T) Il.n.a();
                    case 104:
                        return (T) wh.c.a(this.f100780a.q0(), this.f100780a.f100644a1.get(), this.f100780a.f100587P.get());
                    case 105:
                        return (T) wh.d.a();
                    case 106:
                        return (T) new com.meijer.mobile.accounts.ux.createaccount.t();
                    case 107:
                        return (T) SessionManagerModule_ProvideSessionManagerFactory.provideSessionManager(this.f100780a.f100667e0.get());
                    case 108:
                        return (T) C3754b.a();
                    case 109:
                        return (T) new C17129c();
                    case 110:
                        return (T) new Fh.b(this.f100780a.f100745t.get(), this.f100780a.f100532E.get());
                    case 111:
                        return (T) new Bh.d(this.f100780a.E0(), this.f100780a.f100695j.get());
                    case 112:
                        return (T) yh.i.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 113:
                        return (T) yh.g.a(this.f100780a.f100771y0.get(), this.f100780a.f100776z0.get());
                    case 114:
                        return (T) yh.h.a(this.f100780a.f100737r1.get(), this.f100780a.f100742s1.get());
                    case 115:
                        return (T) Il.q.a();
                    case 116:
                        return (T) C16316c.a(this.f100780a.B0(), this.f100780a.f100537F.get(), this.f100780a.f100542G.get(), this.f100780a.f100567L.get(), this.f100780a.f100582O.get().longValue());
                    case 117:
                        return (T) new C5146j(this.f100780a.f100770y.get(), this.f100780a.f100757v1.get(), this.f100780a.f100740s.get());
                    case 118:
                        return (T) Kn.a.f17427a.j(C18305c.a(this.f100780a.f100642a));
                    case 119:
                        return (T) new CaptivePortalTester(this.f100780a.f100742s1.get());
                    case BinsView.TOTE_HEIGHT_DP /* 120 */:
                        return (T) xj.f.a(this.f100780a.f100777z1.get());
                    case 121:
                        return (T) new C18216b(this.f100780a.f100772y1.get());
                    case 122:
                        return (T) xj.g.a();
                    case 123:
                        return (T) new wr.f(this.f100780a.f100736r0.get(), this.f100780a.f100529D1.get(), this.f100780a.f100583O0.get());
                    case 124:
                        return (T) new Ro.a(this.f100780a.f100524C1.get(), this.f100780a.f100700k.get());
                    case 125:
                        return (T) C6276c.a(C18305c.a(this.f100780a.f100642a), this.f100780a.f100519B1.get());
                    case 126:
                        return (T) C17268b.a();
                    case l3.f92485d /* 127 */:
                        return (T) new Gm.f();
                    case 128:
                        return (T) new pp.e();
                    case 129:
                        return (T) C15065d.a(this.f100780a.f100666e);
                    case 130:
                        return (T) Yn.b.a(this.f100780a.f100674f1.get(), this.f100780a.f100587P.get());
                    case 131:
                        return (T) C13925c.a(this.f100780a.f100760w.get(), this.f100780a.f100587P.get());
                    case 132:
                        return (T) C13924b.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 133:
                        return (T) C14559c.a(this.f100780a.O());
                    case 134:
                        return (T) C14558b.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get(), this.f100780a.f100691i0.get());
                    case 135:
                        return (T) Vk.b.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get(), this.f100780a.f100691i0.get());
                    case 136:
                        return (T) Uo.b.a(this.f100780a.f100584O1.get(), this.f100780a.f100589P1.get());
                    case 137:
                        return (T) Uo.c.a(this.f100780a.f100537F.get(), this.f100780a.f100542G.get());
                    case 138:
                        return (T) Il.l.a();
                    case 139:
                        return (T) new Eq.a(this.f100780a.f100604S1.get(), this.f100780a.f100532E.get());
                    case 140:
                        return (T) com.meijer.mobile.shoppinglist.di.f.a(this.f100780a.f100599R1.get());
                    case 141:
                        return (T) new Hq.b(this.f100780a.f100650b1.get(), this.f100780a.f100632Y.get(), uk.c.a());
                    case 142:
                        return (T) C17020e.a();
                    case 143:
                        return (T) new Bh.e(this.f100780a.P0(), this.f100780a.f100568L0.get(), this.f100780a.f100695j.get(), this.f100780a.f100710m.get(), this.f100780a.f100750u.get());
                    case 144:
                        return (T) yh.f.a(this.f100780a.f100644a1.get(), this.f100780a.f100587P.get());
                    case 145:
                        return (T) Ah.c.a();
                    case 146:
                        return (T) Il.o.a();
                    case 147:
                        return (T) Ui.b.a(this.f100780a.f100639Z1.get(), this.f100780a.f100587P.get());
                    case 148:
                        return (T) C3757e.a();
                    case 149:
                        return (T) Kn.x.a(C18305c.a(this.f100780a.f100642a));
                    case BinsView.TOTE_WIDTH_DP /* 150 */:
                        return (T) yh.e.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 151:
                        return (T) new com.meijer.mobile.digitalshopping.api.orders.a(this.f100780a.f100632Y.get(), this.f100780a.f100715n.get(), this.f100780a.f100669e2.get(), this.f100780a.f100675f2.get(), this.f100780a.f100681g2.get(), this.f100780a.f100693i2.get(), this.f100780a.f100703k2.get(), this.f100780a.f100708l2.get(), this.f100780a.f100718n2.get(), this.f100780a.f100649b0.get(), this.f100780a.f100723o2.get(), uk.c.a());
                    case 152:
                        return (T) ll.c.a(this.f100780a.f100663d2.get(), this.f100780a.f100587P.get());
                    case 153:
                        return (T) C3758f.a();
                    case 154:
                        return (T) ll.i.a(this.f100780a.f100760w.get(), this.f100780a.f100587P.get());
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                        return (T) ll.g.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 156:
                        return (T) rl.c.a(this.f100780a.f100687h2.get(), this.f100780a.f100587P.get());
                    case 157:
                        return (T) Il.v.a();
                    case 158:
                        return (T) Fl.b.a(this.f100780a.f100698j2.get(), this.f100780a.f100587P.get());
                    case 159:
                        return (T) Il.k.a();
                    case 160:
                        return (T) pl.c.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 161:
                        return (T) ql.b.a(this.f100780a.f100713m2.get(), this.f100780a.f100587P.get());
                    case 162:
                        return (T) Il.w.a();
                    case 163:
                        return (T) C15419b.a();
                    case 164:
                        return (T) new jl.t(this.f100780a.f100736r0.get(), this.f100780a.f100748t2.get(), this.f100780a.f100728p2.get());
                    case 165:
                        return (T) new sl.h(this.f100780a.f100632Y.get(), this.f100780a.f100733q2.get(), this.f100780a.f100738r2.get(), this.f100780a.f100743s2.get(), this.f100780a.f100577N.get(), this.f100780a.f100695j.get(), uk.c.a());
                    case 166:
                        return (T) sl.e.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 167:
                        return (T) sl.f.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 168:
                        return (T) new C16983b();
                    case 169:
                        return (T) ho.d.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 170:
                        return (T) C14556c.a(this.f100780a.f100674f1.get(), this.f100780a.f100587P.get());
                    case 171:
                        return (T) C14555b.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 172:
                        return (T) ho.e.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 173:
                        return (T) rp.f.a();
                    case 174:
                        return (T) new jl.d(this.f100780a.f100753u2.get());
                    case 175:
                        return (T) Ip.b.a(this.f100780a.f100530D2.get());
                    case 176:
                        return (T) Ip.c.a(this.f100780a.f100525C2.get());
                    case 177:
                        return (T) Ip.d.a(C18305c.a(this.f100780a.f100642a), this.f100780a.f100520B2.get(), this.f100780a.f100532E.get());
                    case 178:
                        return (T) Fp.b.a();
                    case 179:
                        return (T) new com.meijer.mobile.accounts.ux.preferences.a(this.f100780a.f100752u1.get());
                    case 180:
                        return (T) new Zo.c(this.f100780a.f100632Y.get(), this.f100780a.f100550H2.get(), this.f100780a.f100715n.get(), uk.c.a());
                    case 181:
                        return (T) bp.e.a(this.f100780a.f100545G2.get(), this.f100780a.f100587P.get(), this.f100780a.f100691i0.get());
                    case 182:
                        return (T) Il.r.a();
                    case 183:
                        return (T) rh.c.a(this.f100780a.f100565K2.get(), this.f100780a.f100570L2.get(), this.f100780a.f100587P.get());
                    case 184:
                        return (T) rh.b.a(this.f100780a.f100560J2.get());
                    case 185:
                        return (T) rh.d.a();
                    case 186:
                        return (T) C3756d.a();
                    case 187:
                        return (T) new Ep.d(this.f100780a.f100600R2.get(), this.f100780a.f100615U2.get(), this.f100780a.f100695j.get(), this.f100780a.f100577N.get());
                    case 188:
                        return (T) Dp.e.a(this.f100780a.f100595Q2.get());
                    case 189:
                        return (T) new Ep.b(this.f100780a.f100632Y.get(), this.f100780a.f100585O2.get(), this.f100780a.f100590P2.get(), uk.c.a());
                    case 190:
                        return (T) Dp.c.a(this.f100780a.f100644a1.get(), this.f100780a.f100580N2.get());
                    case 191:
                        return (T) Dp.d.a(this.f100780a.f100587P.get(), this.f100780a.f100567L.get());
                    case 192:
                        return (T) Dp.b.a();
                    case 193:
                        return (T) new Ep.e(this.f100780a.f100632Y.get(), this.f100780a.f100610T2.get(), this.f100780a.f100590P2.get(), uk.c.a());
                    case 194:
                        return (T) Dp.g.a(this.f100780a.f100605S2.get(), this.f100780a.f100580N2.get(), this.f100780a.f100590P2.get());
                    case 195:
                        return (T) Il.s.a();
                    case 196:
                        return (T) new C15069b(this.f100780a.N0(), this.f100780a.f100577N.get());
                    case 197:
                        return (T) C15461b.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get(), this.f100780a.f100691i0.get());
                    case 198:
                        return (T) Kn.e.a(C18305c.a(this.f100780a.f100642a));
                    case 199:
                        return (T) Ip.e.a(this.f100780a.f100652b3.get());
                    default:
                        throw new AssertionError(this.f100781b);
                }
            }

            private T d() {
                switch (this.f100781b) {
                    case HttpResponseStatus.SUCCESS_OK /* 200 */:
                        return (T) new com.meijer.mobile.reviews.service.a(this.f100780a.f100695j.get(), this.f100780a.f100690i.get(), this.f100780a.f100525C2.get(), this.f100780a.V(), new Hp.d(), this.f100780a.f100640Z2.get(), this.f100780a.f100646a3.get(), uk.d.a());
                    case HttpResponseStatus.SUCCESS_CREATED /* 201 */:
                        return (T) Ip.f.a(this.f100780a.f100525C2.get());
                    case HttpResponseStatus.SUCCESS_ACCEPTED /* 202 */:
                        return (T) Fp.c.a();
                    case HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION /* 203 */:
                        return (T) Dp.i.a(this.f100780a.f100737r1.get(), this.f100780a.f100742s1.get());
                    case HttpResponseStatus.SUCCESS_NO_CONTENT /* 204 */:
                        return (T) new C14274a(this.f100780a.T0());
                    case HttpResponseStatus.SUCCESS_RESET_CONTENT /* 205 */:
                        return (T) Zl.b.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case HttpResponseStatus.SUCCESS_PARTIAL_CONTENT /* 206 */:
                        return (T) Zl.h.a(this.f100780a.f100737r1.get(), this.f100780a.f100742s1.get());
                    case 207:
                        return (T) new Nv.b(this.f100780a.f100715n.get(), this.f100780a.f100700k.get(), this.f100780a.f100688h3.get(), this.f100780a.f100694i3.get(), this.f100780a.f100532E.get());
                    case 208:
                        return (T) Ov.b.a(new Nv.d());
                    case 209:
                        return (T) Ov.c.a();
                    case 210:
                        return (T) Zl.d.a(this.f100780a.f100674f1.get(), this.f100780a.f100587P.get());
                    case 211:
                        return (T) new C16594b(this.f100780a.f100714m3.get());
                    case 212:
                        return (T) rp.b.a(this.f100780a.f100709l3.get());
                    case 213:
                        return (T) rp.c.a(this.f100780a.f100542G.get(), this.f100780a.f100537F.get());
                    case 214:
                        return (T) new C14758a(this.f100780a.W0());
                    case 215:
                        return (T) C14566b.a(this.f100780a.f100685h0.get(), this.f100780a.f100587P.get());
                    case 216:
                        return (T) new Bh.b(this.f100780a.f100624W1.get(), this.f100780a.F(), this.f100780a.f100568L0.get(), this.f100780a.f100695j.get(), this.f100780a.f100710m.get(), this.f100780a.f100577N.get());
                    case 217:
                        return (T) new C12063a(this.f100780a.f100734q3.get());
                    case 218:
                        return (T) up.c.a(this.f100780a.f100760w.get(), this.f100780a.f100587P.get());
                    case 219:
                        return (T) up.b.a(this.f100780a.f100760w.get(), this.f100780a.f100587P.get());
                    case 220:
                        return (T) new Pm.b(C18305c.a(this.f100780a.f100642a));
                    case 221:
                        return (T) new Wp.b(this.f100780a.f100764w3.get(), this.f100780a.f100769x3.get(), this.f100780a.f100576M3.get(), this.f100780a.f100571L3.get(), uk.c.a());
                    case 222:
                        return (T) C17133d.a(this.f100780a.f100672f, this.f100780a.f100759v3.get());
                    case 223:
                        return (T) C17131b.a(this.f100780a.f100672f, C18305c.a(this.f100780a.f100642a));
                    case 224:
                        return (T) C17132c.a(this.f100780a.f100672f, this.f100780a.f100759v3.get());
                    case 225:
                        return (T) new Rl.b(this.f100780a.f100516A3.get(), this.f100780a.f100531D3.get(), this.f100780a.f100566K3.get(), this.f100780a.f100571L3.get());
                    case 226:
                        return (T) new Ml.a(this.f100780a.f100779z3.get(), this.f100780a.f100632Y.get(), uk.c.a());
                    case 227:
                        return (T) Nl.b.a(this.f100780a.f100774y3.get(), this.f100780a.f100587P.get());
                    case 228:
                        return (T) Il.C.a();
                    case 229:
                        return (T) new Ml.b(this.f100780a.f100526C3.get(), this.f100780a.f100632Y.get(), uk.c.a());
                    case 230:
                        return (T) Nl.c.a(this.f100780a.f100521B3.get(), this.f100780a.f100587P.get());
                    case 231:
                        return (T) Il.D.a();
                    case 232:
                        return (T) new C16103e(this.f100780a.f100551H3.get(), this.f100780a.f100561J3.get(), this.f100780a.f100632Y.get(), uk.c.a());
                    case 233:
                        return (T) om.g.a(this.f100780a.f100536E3.get(), this.f100780a.f100541F3.get(), this.f100780a.f100546G3.get());
                    case 234:
                        return (T) Il.E.a();
                    case 235:
                        return (T) lm.c.a(this.f100780a.f100542G.get(), this.f100780a.f100537F.get());
                    case 236:
                        return (T) C15425b.a();
                    case 237:
                        return (T) C16101c.a(this.f100780a.f100556I3.get(), this.f100780a.f100587P.get(), this.f100780a.f100546G3.get());
                    case 238:
                        return (T) Il.B.a();
                    case 239:
                        return (T) new C15887a(this.f100780a.f100680g1.get(), this.f100780a.f100632Y.get());
                    case 240:
                        return (T) sq.f.a();
                    case 241:
                        return (T) C17017b.a(C18305c.a(this.f100780a.f100642a));
                    case 242:
                        return (T) new C15645f(this.f100780a.f100606S3.get());
                    case 243:
                        return (T) new C15641b(this.f100780a.f100601R3.get(), this.f100780a.f100632Y.get(), uk.c.a());
                    case 244:
                        return (T) C15643d.a(this.f100780a.f100596Q3.get(), this.f100780a.f100541F3.get(), this.f100780a.f100546G3.get());
                    case 245:
                        return (T) Il.A.a();
                    case 246:
                        return (T) new C16547l(this.f100780a.f100626W3.get());
                    case 247:
                        return (T) new C16537b(this.f100780a.f100621V3.get(), this.f100780a.f100632Y.get(), uk.c.a());
                    case 248:
                        return (T) C16539d.a(this.f100780a.f100616U3.get(), this.f100780a.f100541F3.get(), this.f100780a.f100546G3.get());
                    case 249:
                        return (T) Il.p.a();
                    case 250:
                        return (T) C17018c.a(C18305c.a(this.f100780a.f100642a), this.f100780a.f100636Y3.get());
                    case 251:
                        return (T) C17019d.a(C18305c.a(this.f100780a.f100642a));
                    case 252:
                        return (T) new C16829a();
                    case 253:
                        return (T) C15309f.a();
                    case 254:
                        return (T) new Lq.b(this.f100780a.f100683g4.get());
                    case l3.f92484c /* 255 */:
                        return (T) new Nq.a(this.f100780a.f100665d4.get(), this.f100780a.f100677f4.get(), uk.c.a());
                    case 256:
                        return (T) Jq.b.a(this.f100780a.f100659c4.get(), this.f100780a.f100587P.get());
                    case 257:
                        return (T) Il.x.a();
                    case 258:
                        return (T) Jq.c.a(this.f100780a.f100671e4.get(), this.f100780a.f100587P.get(), this.f100780a.f100691i0.get());
                    case 259:
                        return (T) Il.y.a();
                    default:
                        throw new AssertionError(this.f100781b);
                }
            }

            @Override // kv.InterfaceC15323a
            public T get() {
                int i10 = this.f100781b / 100;
                if (i10 == 0) {
                    return b();
                }
                if (i10 == 1) {
                    return c();
                }
                if (i10 == 2) {
                    return d();
                }
                throw new AssertionError(this.f100781b);
            }

            C1405a(j jVar, int i10) {
                this.f100780a = jVar;
                this.f100781b = i10;
            }
        }

        private void d0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100690i = Bu.a.b(new C1405a(this.f100684h, 4));
            this.f100695j = Bu.a.b(new C1405a(this.f100684h, 3));
            this.f100700k = Bu.a.b(new C1405a(this.f100684h, 2));
            this.f100705l = Bu.a.b(new C1405a(this.f100684h, 7));
            this.f100710m = Bu.a.b(new C1405a(this.f100684h, 6));
            this.f100715n = Bu.a.b(new C1405a(this.f100684h, 5));
            this.f100720o = Bu.a.b(new C1405a(this.f100684h, 8));
            this.f100725p = Bu.a.b(new C1405a(this.f100684h, 9));
            this.f100730q = Bu.a.b(new C1405a(this.f100684h, 1));
            this.f100735r = Bu.a.b(new C1405a(this.f100684h, 0));
            this.f100740s = Bu.a.b(new C1405a(this.f100684h, 11));
            this.f100745t = Bu.a.b(new C1405a(this.f100684h, 12));
            this.f100750u = Bu.a.b(new C1405a(this.f100684h, 13));
            this.f100755v = Bu.a.b(new C1405a(this.f100684h, 14));
            this.f100760w = Bu.a.b(new C1405a(this.f100684h, 18));
            this.f100765x = Bu.a.b(new C1405a(this.f100684h, 20));
            this.f100770y = Bu.a.b(new C1405a(this.f100684h, 21));
            this.f100775z = Bu.a.b(new C1405a(this.f100684h, 24));
            this.f100512A = Bu.a.b(new C1405a(this.f100684h, 25));
            this.f100517B = Bu.a.b(new C1405a(this.f100684h, 26));
            this.f100522C = Bu.a.b(new C1405a(this.f100684h, 27));
            this.f100527D = Bu.a.b(new C1405a(this.f100684h, 28));
            this.f100532E = Bu.a.b(new C1405a(this.f100684h, 23));
            this.f100537F = Bu.a.b(new C1405a(this.f100684h, 22));
            this.f100542G = Bu.a.b(new C1405a(this.f100684h, 29));
        }

        private void e0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100779z3 = Bu.a.b(new C1405a(this.f100684h, 227));
            this.f100516A3 = Bu.f.a(new C1405a(this.f100684h, 226));
            this.f100521B3 = Bu.a.b(new C1405a(this.f100684h, 231));
            this.f100526C3 = Bu.a.b(new C1405a(this.f100684h, 230));
            this.f100531D3 = Bu.f.a(new C1405a(this.f100684h, 229));
            this.f100536E3 = Bu.a.b(new C1405a(this.f100684h, 234));
            this.f100541F3 = Bu.a.b(new C1405a(this.f100684h, 235));
            this.f100546G3 = Bu.a.b(new C1405a(this.f100684h, 236));
            this.f100551H3 = Bu.a.b(new C1405a(this.f100684h, 233));
            this.f100556I3 = Bu.a.b(new C1405a(this.f100684h, 238));
            this.f100561J3 = Bu.a.b(new C1405a(this.f100684h, 237));
            this.f100566K3 = Bu.f.a(new C1405a(this.f100684h, 232));
            this.f100571L3 = Bu.f.a(new C1405a(this.f100684h, 239));
            this.f100576M3 = Bu.f.a(new C1405a(this.f100684h, 225));
            this.f100581N3 = Bu.a.b(new C1405a(this.f100684h, 221));
            this.f100586O3 = Bu.a.b(new C1405a(this.f100684h, 240));
            this.f100591P3 = Bu.a.b(new C1405a(this.f100684h, 241));
            this.f100596Q3 = Bu.a.b(new C1405a(this.f100684h, 245));
            this.f100601R3 = Bu.a.b(new C1405a(this.f100684h, 244));
            this.f100606S3 = Bu.f.a(new C1405a(this.f100684h, 243));
            this.f100611T3 = Bu.f.a(new C1405a(this.f100684h, 242));
            this.f100616U3 = Bu.a.b(new C1405a(this.f100684h, 249));
            this.f100621V3 = Bu.a.b(new C1405a(this.f100684h, 248));
            this.f100626W3 = Bu.f.a(new C1405a(this.f100684h, 247));
            this.f100631X3 = Bu.f.a(new C1405a(this.f100684h, 246));
        }

        private void f0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100636Y3 = Bu.a.b(new C1405a(this.f100684h, 251));
            this.f100641Z3 = Bu.a.b(new C1405a(this.f100684h, 250));
            this.f100647a4 = Bu.a.b(new C1405a(this.f100684h, 252));
            this.f100653b4 = Bu.a.b(new C1405a(this.f100684h, 253));
            this.f100659c4 = Bu.a.b(new C1405a(this.f100684h, 257));
            this.f100665d4 = Bu.a.b(new C1405a(this.f100684h, 256));
            this.f100671e4 = Bu.a.b(new C1405a(this.f100684h, 259));
            this.f100677f4 = Bu.a.b(new C1405a(this.f100684h, 258));
            this.f100683g4 = Bu.f.a(new C1405a(this.f100684h, l3.f92484c));
            this.f100689h4 = Bu.f.a(new C1405a(this.f100684h, 254));
        }

        private void g0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100547H = Bu.a.b(new C1405a(this.f100684h, 30));
            this.f100552I = Bu.a.b(new C1405a(this.f100684h, 33));
            this.f100557J = Bu.a.b(new C1405a(this.f100684h, 32));
            this.f100562K = Bu.a.b(new C1405a(this.f100684h, 35));
            this.f100567L = Bu.a.b(new C1405a(this.f100684h, 36));
            this.f100572M = Bu.a.b(new C1405a(this.f100684h, 34));
            this.f100577N = Bu.a.b(new C1405a(this.f100684h, 31));
            this.f100582O = Bu.a.b(new C1405a(this.f100684h, 37));
            this.f100587P = Bu.a.b(new C1405a(this.f100684h, 19));
            this.f100592Q = Bu.a.b(new C1405a(this.f100684h, 17));
            this.f100597R = Bu.a.b(new C1405a(this.f100684h, 43));
            this.f100602S = Bu.a.b(new C1405a(this.f100684h, 42));
            this.f100607T = Bu.a.b(new C1405a(this.f100684h, 41));
            this.f100612U = Bu.a.b(new C1405a(this.f100684h, 44));
            this.f100617V = Bu.a.b(new C1405a(this.f100684h, 40));
            this.f100622W = Bu.a.b(new C1405a(this.f100684h, 45));
            this.f100627X = Bu.a.b(new C1405a(this.f100684h, 39));
            this.f100632Y = Bu.a.b(new C1405a(this.f100684h, 38));
            this.f100637Z = Bu.a.b(new C1405a(this.f100684h, 47));
            this.f100643a0 = Bu.a.b(new C1405a(this.f100684h, 46));
            this.f100649b0 = Bu.a.b(new C1405a(this.f100684h, 16));
            this.f100655c0 = Bu.a.b(new C1405a(this.f100684h, 15));
            this.f100661d0 = Bu.a.b(new C1405a(this.f100684h, 48));
            this.f100667e0 = Bu.a.b(new C1405a(this.f100684h, 10));
            this.f100673f0 = Bu.a.b(new C1405a(this.f100684h, 51));
        }

        private void h0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100679g0 = Bu.a.b(new C1405a(this.f100684h, 50));
            this.f100685h0 = Bu.a.b(new C1405a(this.f100684h, 54));
            this.f100691i0 = Bu.a.b(new C1405a(this.f100684h, 55));
            this.f100696j0 = Bu.a.b(new C1405a(this.f100684h, 53));
            this.f100701k0 = Bu.a.b(new C1405a(this.f100684h, 57));
            this.f100706l0 = Bu.a.b(new C1405a(this.f100684h, 56));
            this.f100711m0 = Bu.a.b(new C1405a(this.f100684h, 59));
            this.f100716n0 = Bu.a.b(new C1405a(this.f100684h, 60));
            this.f100721o0 = Bu.a.b(new C1405a(this.f100684h, 58));
            this.f100726p0 = Bu.a.b(new C1405a(this.f100684h, 52));
            this.f100731q0 = Bu.a.b(new C1405a(this.f100684h, 61));
            this.f100736r0 = Bu.a.b(new C1405a(this.f100684h, 49));
            this.f100741s0 = Bu.a.b(new C1405a(this.f100684h, 63));
            this.f100746t0 = Bu.a.b(new C1405a(this.f100684h, 62));
            this.f100751u0 = Bu.a.b(new C1405a(this.f100684h, 66));
            this.f100756v0 = Bu.a.b(new C1405a(this.f100684h, 65));
            this.f100761w0 = Bu.f.a(new C1405a(this.f100684h, 67));
            this.f100766x0 = Bu.a.b(new C1405a(this.f100684h, 64));
            this.f100771y0 = Bu.a.b(new C1405a(this.f100684h, 70));
            this.f100776z0 = Bu.a.b(new C1405a(this.f100684h, 71));
            this.f100513A0 = Bu.a.b(new C1405a(this.f100684h, 69));
            this.f100518B0 = Bu.a.b(new C1405a(this.f100684h, 68));
            this.f100523C0 = Bu.a.b(new C1405a(this.f100684h, 73));
            this.f100528D0 = Bu.a.b(new C1405a(this.f100684h, 72));
            this.f100533E0 = Bu.f.a(new C1405a(this.f100684h, 75));
        }

        private void i0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100538F0 = Bu.a.b(new C1405a(this.f100684h, 74));
            this.f100543G0 = Bu.a.b(new C1405a(this.f100684h, 77));
            this.f100548H0 = Bu.a.b(new C1405a(this.f100684h, 76));
            this.f100553I0 = Bu.a.b(new C1405a(this.f100684h, 78));
            this.f100558J0 = Bu.a.b(new C1405a(this.f100684h, 81));
            this.f100563K0 = Bu.a.b(new C1405a(this.f100684h, 82));
            this.f100568L0 = Bu.a.b(new C1405a(this.f100684h, 80));
            this.f100573M0 = Bu.a.b(new C1405a(this.f100684h, 83));
            this.f100578N0 = Bu.f.a(new C1405a(this.f100684h, 79));
            this.f100583O0 = Bu.a.b(new C1405a(this.f100684h, 85));
            this.f100588P0 = Bu.a.b(new C1405a(this.f100684h, 84));
            this.f100593Q0 = Bu.a.b(new C1405a(this.f100684h, 86));
            this.f100598R0 = Bu.a.b(new C1405a(this.f100684h, 89));
            this.f100603S0 = Bu.a.b(new C1405a(this.f100684h, 88));
            this.f100608T0 = Bu.a.b(new C1405a(this.f100684h, 92));
            this.f100613U0 = Bu.a.b(new C1405a(this.f100684h, 91));
            this.f100618V0 = Bu.a.b(new C1405a(this.f100684h, 90));
            this.f100623W0 = Bu.f.a(new C1405a(this.f100684h, 93));
            this.f100628X0 = Bu.a.b(new C1405a(this.f100684h, 87));
            this.f100633Y0 = Bu.a.b(new C1405a(this.f100684h, 94));
            this.f100638Z0 = Bu.a.b(new C1405a(this.f100684h, 95));
            this.f100644a1 = Bu.a.b(new C1405a(this.f100684h, 100));
            this.f100650b1 = Bu.a.b(new C1405a(this.f100684h, 99));
            this.f100656c1 = Bu.a.b(new C1405a(this.f100684h, 98));
            this.f100662d1 = Bu.a.b(new C1405a(this.f100684h, 97));
        }

        private void j0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100668e1 = Bu.a.b(new C1405a(this.f100684h, 96));
            this.f100674f1 = Bu.a.b(new C1405a(this.f100684h, 103));
            this.f100680g1 = Bu.a.b(new C1405a(this.f100684h, 102));
            this.f100686h1 = Bu.a.b(new C1405a(this.f100684h, 101));
            this.f100692i1 = Bu.a.b(new C1405a(this.f100684h, 105));
            this.f100697j1 = Bu.a.b(new C1405a(this.f100684h, 104));
            this.f100702k1 = Bu.a.b(new C1405a(this.f100684h, 106));
            this.f100707l1 = Bu.a.b(new C1405a(this.f100684h, 107));
            this.f100712m1 = Bu.a.b(new C1405a(this.f100684h, 108));
            this.f100717n1 = Bu.a.b(new C1405a(this.f100684h, 109));
            this.f100722o1 = Bu.a.b(new C1405a(this.f100684h, 110));
            this.f100727p1 = Bu.a.b(new C1405a(this.f100684h, 112));
            this.f100732q1 = Bu.a.b(new C1405a(this.f100684h, 113));
            this.f100737r1 = Bu.a.b(new C1405a(this.f100684h, 115));
            this.f100742s1 = Bu.a.b(new C1405a(this.f100684h, 116));
            this.f100747t1 = Bu.a.b(new C1405a(this.f100684h, 114));
            this.f100752u1 = Bu.a.b(new C1405a(this.f100684h, 111));
            this.f100757v1 = Bu.a.b(new C1405a(this.f100684h, 118));
            this.f100762w1 = Bu.a.b(new C1405a(this.f100684h, 117));
            this.f100767x1 = Bu.a.b(new C1405a(this.f100684h, 119));
            this.f100772y1 = Bu.a.b(new C1405a(this.f100684h, 122));
            this.f100777z1 = Bu.a.b(new C1405a(this.f100684h, 121));
            this.f100514A1 = Bu.a.b(new C1405a(this.f100684h, BinsView.TOTE_HEIGHT_DP));
            this.f100519B1 = Bu.a.b(new C1405a(this.f100684h, 126));
            this.f100524C1 = Bu.a.b(new C1405a(this.f100684h, 125));
        }

        private void k0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100529D1 = Bu.a.b(new C1405a(this.f100684h, 124));
            this.f100534E1 = Bu.a.b(new C1405a(this.f100684h, 123));
            this.f100539F1 = Bu.a.b(new C1405a(this.f100684h, l3.f92485d));
            this.f100544G1 = Bu.a.b(new C1405a(this.f100684h, 128));
            this.f100549H1 = Bu.a.b(new C1405a(this.f100684h, 129));
            this.f100554I1 = Bu.a.b(new C1405a(this.f100684h, 130));
            this.f100559J1 = Bu.a.b(new C1405a(this.f100684h, 131));
            this.f100564K1 = Bu.a.b(new C1405a(this.f100684h, 132));
            this.f100569L1 = Bu.a.b(new C1405a(this.f100684h, 134));
            this.f100574M1 = Bu.a.b(new C1405a(this.f100684h, 133));
            this.f100579N1 = Bu.a.b(new C1405a(this.f100684h, 135));
            this.f100584O1 = Bu.a.b(new C1405a(this.f100684h, 137));
            this.f100589P1 = Bu.a.b(new C1405a(this.f100684h, 138));
            this.f100594Q1 = Bu.a.b(new C1405a(this.f100684h, 136));
            this.f100599R1 = Bu.a.b(new C1405a(this.f100684h, 141));
            this.f100604S1 = Bu.a.b(new C1405a(this.f100684h, 140));
            this.f100609T1 = Bu.a.b(new C1405a(this.f100684h, 139));
            this.f100614U1 = Bu.a.b(new C1405a(this.f100684h, 142));
            this.f100619V1 = Bu.a.b(new C1405a(this.f100684h, 144));
            this.f100624W1 = Bu.a.b(new C1405a(this.f100684h, 143));
            this.f100629X1 = Bu.a.b(new C1405a(this.f100684h, 145));
            this.f100634Y1 = Bu.a.b(new C1405a(this.f100684h, 146));
            this.f100639Z1 = Bu.a.b(new C1405a(this.f100684h, 148));
            this.f100645a2 = Bu.a.b(new C1405a(this.f100684h, 147));
            this.f100651b2 = Bu.a.b(new C1405a(this.f100684h, 149));
        }

        private void l0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100657c2 = Bu.a.b(new C1405a(this.f100684h, BinsView.TOTE_WIDTH_DP));
            this.f100663d2 = Bu.a.b(new C1405a(this.f100684h, 153));
            this.f100669e2 = Bu.a.b(new C1405a(this.f100684h, 152));
            this.f100675f2 = Bu.a.b(new C1405a(this.f100684h, 154));
            this.f100681g2 = Bu.a.b(new C1405a(this.f100684h, ModuleDescriptor.MODULE_VERSION));
            this.f100687h2 = Bu.a.b(new C1405a(this.f100684h, 157));
            this.f100693i2 = Bu.a.b(new C1405a(this.f100684h, 156));
            this.f100698j2 = Bu.a.b(new C1405a(this.f100684h, 159));
            this.f100703k2 = Bu.a.b(new C1405a(this.f100684h, 158));
            this.f100708l2 = Bu.a.b(new C1405a(this.f100684h, 160));
            this.f100713m2 = Bu.a.b(new C1405a(this.f100684h, 162));
            this.f100718n2 = Bu.a.b(new C1405a(this.f100684h, 161));
            this.f100723o2 = Bu.a.b(new C1405a(this.f100684h, 163));
            this.f100728p2 = Bu.a.b(new C1405a(this.f100684h, 151));
            this.f100733q2 = Bu.a.b(new C1405a(this.f100684h, 166));
            this.f100738r2 = Bu.a.b(new C1405a(this.f100684h, 167));
            this.f100743s2 = Bu.a.b(new C1405a(this.f100684h, 168));
            this.f100748t2 = Bu.a.b(new C1405a(this.f100684h, 165));
            this.f100753u2 = Bu.a.b(new C1405a(this.f100684h, 164));
            this.f100758v2 = Bu.a.b(new C1405a(this.f100684h, 169));
            this.f100763w2 = Bu.a.b(new C1405a(this.f100684h, 170));
            this.f100768x2 = Bu.a.b(new C1405a(this.f100684h, 171));
            this.f100773y2 = Bu.a.b(new C1405a(this.f100684h, 172));
            this.f100778z2 = Bu.a.b(new C1405a(this.f100684h, 173));
            this.f100515A2 = Bu.a.b(new C1405a(this.f100684h, 174));
        }

        private void m0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100520B2 = Bu.a.b(new C1405a(this.f100684h, 178));
            this.f100525C2 = Bu.a.b(new C1405a(this.f100684h, 177));
            this.f100530D2 = Bu.a.b(new C1405a(this.f100684h, 176));
            this.f100535E2 = Bu.a.b(new C1405a(this.f100684h, 175));
            this.f100540F2 = Bu.a.b(new C1405a(this.f100684h, 179));
            this.f100545G2 = Bu.a.b(new C1405a(this.f100684h, 182));
            this.f100550H2 = Bu.a.b(new C1405a(this.f100684h, 181));
            this.f100555I2 = Bu.a.b(new C1405a(this.f100684h, 180));
            this.f100560J2 = Bu.a.b(new C1405a(this.f100684h, 185));
            this.f100565K2 = Bu.a.b(new C1405a(this.f100684h, 184));
            this.f100570L2 = Bu.a.b(new C1405a(this.f100684h, 186));
            this.f100575M2 = Bu.a.b(new C1405a(this.f100684h, 183));
            this.f100580N2 = Bu.a.b(new C1405a(this.f100684h, 191));
            this.f100585O2 = Bu.a.b(new C1405a(this.f100684h, 190));
            this.f100590P2 = Bu.a.b(new C1405a(this.f100684h, 192));
            this.f100595Q2 = Bu.a.b(new C1405a(this.f100684h, 189));
            this.f100600R2 = Bu.a.b(new C1405a(this.f100684h, 188));
            this.f100605S2 = Bu.a.b(new C1405a(this.f100684h, 195));
            this.f100610T2 = Bu.a.b(new C1405a(this.f100684h, 194));
            this.f100615U2 = Bu.a.b(new C1405a(this.f100684h, 193));
            this.f100620V2 = Bu.a.b(new C1405a(this.f100684h, 187));
            this.f100625W2 = Bu.a.b(new C1405a(this.f100684h, 197));
            this.f100630X2 = Bu.a.b(new C1405a(this.f100684h, 196));
            this.f100635Y2 = Bu.a.b(new C1405a(this.f100684h, 198));
            this.f100640Z2 = Bu.a.b(new C1405a(this.f100684h, HttpResponseStatus.SUCCESS_CREATED));
        }

        private void n0(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100646a3 = Bu.a.b(new C1405a(this.f100684h, HttpResponseStatus.SUCCESS_ACCEPTED));
            this.f100652b3 = Bu.a.b(new C1405a(this.f100684h, HttpResponseStatus.SUCCESS_OK));
            this.f100658c3 = Bu.a.b(new C1405a(this.f100684h, 199));
            this.f100664d3 = Bu.a.b(new C1405a(this.f100684h, HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION));
            this.f100670e3 = Bu.a.b(new C1405a(this.f100684h, HttpResponseStatus.SUCCESS_NO_CONTENT));
            this.f100676f3 = Bu.a.b(new C1405a(this.f100684h, HttpResponseStatus.SUCCESS_RESET_CONTENT));
            this.f100682g3 = Bu.a.b(new C1405a(this.f100684h, HttpResponseStatus.SUCCESS_PARTIAL_CONTENT));
            this.f100688h3 = Bu.a.b(new C1405a(this.f100684h, 208));
            this.f100694i3 = Bu.a.b(new C1405a(this.f100684h, 209));
            this.f100699j3 = Bu.a.b(new C1405a(this.f100684h, 207));
            this.f100704k3 = Bu.a.b(new C1405a(this.f100684h, 210));
            this.f100709l3 = Bu.a.b(new C1405a(this.f100684h, 213));
            this.f100714m3 = Bu.a.b(new C1405a(this.f100684h, 212));
            this.f100719n3 = Bu.a.b(new C1405a(this.f100684h, 211));
            this.f100724o3 = Bu.a.b(new C1405a(this.f100684h, 215));
            this.f100729p3 = Bu.a.b(new C1405a(this.f100684h, 214));
            this.f100734q3 = Bu.a.b(new C1405a(this.f100684h, 216));
            this.f100739r3 = Bu.a.b(new C1405a(this.f100684h, 217));
            this.f100744s3 = Bu.a.b(new C1405a(this.f100684h, 218));
            this.f100749t3 = Bu.a.b(new C1405a(this.f100684h, 219));
            this.f100754u3 = Bu.a.b(new C1405a(this.f100684h, 220));
            this.f100759v3 = Bu.a.b(new C1405a(this.f100684h, 223));
            this.f100764w3 = Bu.a.b(new C1405a(this.f100684h, 222));
            this.f100769x3 = Bu.a.b(new C1405a(this.f100684h, 224));
            this.f100774y3 = Bu.a.b(new C1405a(this.f100684h, 228));
        }

        private Meijer o0(Meijer meijer) {
            L.q(meijer, this.f100667e0.get());
            L.v(meijer, this.f100695j.get());
            L.d(meijer, this.f100745t.get());
            L.u(meijer, this.f100710m.get());
            L.g(meijer, this.f100736r0.get());
            L.k(meijer, this.f100577N.get());
            L.o(meijer, this.f100746t0.get());
            L.t(meijer, this.f100766x0.get());
            L.r(meijer, this.f100518B0.get());
            L.l(meijer, this.f100528D0.get());
            L.s(meijer, this.f100538F0.get());
            L.a(meijer, this.f100721o0.get());
            L.m(meijer, this.f100548H0.get());
            L.b(meijer, this.f100735r.get());
            L.i(meijer, this.f100553I0.get());
            L.w(meijer, a0());
            L.n(meijer, this.f100588P0.get());
            L.f(meijer, this.f100583O0.get());
            L.p(meijer, uk.c.a());
            L.h(meijer, this.f100593Q0.get());
            L.c(meijer, H());
            L.j(meijer, this.f100628X0.get());
            L.e(meijer, this.f100532E.get());
            return meijer;
        }

        private NotificationDismissedReceiver p0(NotificationDismissedReceiver notificationDismissedReceiver) {
            C18071d.a(notificationDismissedReceiver, this.f100735r.get());
            return notificationDismissedReceiver;
        }

        Set<Interceptor> A0() {
            return Ce.O.z(this.f100607T.get(), this.f100612U.get());
        }

        com.meijer.mobile.core.util.networking.a B0() {
            return new com.meijer.mobile.core.util.networking.a(this.f100770y.get());
        }

        C6260e C0() {
            return new C6260e(this.f100627X.get(), this.f100695j.get(), this.f100577N.get(), this.f100735r.get(), uk.c.a());
        }

        public th.k D0() {
            return new th.k(this.f100632Y.get(), this.f100697j1.get(), this.f100692i1.get(), uk.c.a());
        }

        C18465c E() {
            return new C18465c(this.f100657c2.get(), this.f100632Y.get(), this.f100700k.get());
        }

        zh.j E0() {
            return new zh.j(this.f100727p1.get(), this.f100732q1.get(), this.f100747t1.get(), this.f100700k.get(), this.f100603S0.get(), this.f100632Y.get(), uk.c.a());
        }

        Bh.c F() {
            return new Bh.c(E(), this.f100568L0.get(), this.f100695j.get(), this.f100710m.get());
        }

        So.b G() {
            return new So.b(this.f100594Q1.get(), this.f100524C1.get(), this.f100695j.get(), uk.c.a());
        }

        On.a H() {
            return new On.a(Kn.f.a(), I());
        }

        On.b I() {
            return new On.b(C18305c.a(this.f100642a), this.f100577N.get());
        }

        Yl.d J() {
            return new Yl.d(this.f100676f3.get(), v0(), P0(), this.f100715n.get(), this.f100695j.get(), this.f100577N.get(), S(), this.f100513A0.get(), this.f100632Y.get(), uk.c.a());
        }

        C16793b K() {
            return new C16793b(this.f100592Q.get(), this.f100632Y.get(), this.f100715n.get(), this.f100700k.get(), uk.c.a());
        }

        C15916a L() {
            return new C15916a(O0());
        }

        Sk.a M() {
            return new Sk.a(this.f100579N1.get(), uk.c.a());
        }

        Zo.a N() {
            return new Zo.a(this.f100524C1.get(), c0(), this.f100544G1.get(), this.f100574M1.get(), uk.c.a());
        }

        C15068a N0() {
            return new C15068a(this.f100625W2.get(), this.f100632Y.get(), this.f100700k.get(), this.f100715n.get(), S(), this.f100577N.get(), uk.c.a());
        }

        C14303a O() {
            return new C14303a(this.f100569L1.get(), uk.c.a());
        }

        Ro.c O0() {
            return new Ro.c(this.f100715n.get(), this.f100695j.get(), this.f100577N.get(), F0(), this.f100529D1.get(), M(), this.f100726p0.get(), this.f100544G1.get(), G(), uk.c.a());
        }

        C15917b P() {
            return new C15917b(this.f100555I2.get());
        }

        zh.k P0() {
            return new zh.k(this.f100619V1.get(), this.f100732q1.get(), this.f100700k.get(), E0(), this.f100567L.get(), this.f100632Y.get(), uk.c.a());
        }

        Zk.a Q() {
            return new Zk.a(this.f100632Y.get(), uk.c.a(), this.f100680g1.get());
        }

        InterfaceC14266f Q0() {
            return C18059b.a(this.f100720o.get());
        }

        C15918c R() {
            return new C15918c(O0());
        }

        InterfaceC14266f R0() {
            return xj.h.a(this.f100725p.get());
        }

        InterfaceC13669f S() {
            return C13668e.a(this.f100721o0.get());
        }

        C13714b S0() {
            return new C13714b(T0(), O0());
        }

        C12437a T() {
            return new C12437a(this.f100609T1.get(), O0());
        }

        C13719g T0() {
            return new C13719g(y0(), uk.c.a());
        }

        Al.g U() {
            return new Al.g(C18305c.a(this.f100642a), this.f100577N.get());
        }

        C15921f U0() {
            return new C15921f(O0());
        }

        Hp.f V() {
            return new Hp.f(C18305c.a(this.f100642a));
        }

        j1 V0() {
            return new j1(this.f100668e1.get(), O0());
        }

        C14307a W0() {
            return new C14307a(this.f100724o3.get(), this.f100632Y.get(), uk.c.a(), this.f100577N.get());
        }

        InterfaceC3769c X() {
            return Kn.d.a(C18305c.a(this.f100642a));
        }

        Tn.a Y() {
            return new Tn.a(C18305c.a(this.f100642a), this.f100695j.get());
        }

        zh.i Z() {
            return new zh.i(this.f100513A0.get(), this.f100632Y.get());
        }

        @Override // Ln.d, ps.C16395g.a, ps.d0.b
        public InterfaceC14261a a() {
            return this.f100735r.get();
        }

        @Override // ps.C16395g.a, ps.d0.b
        public yl.k b() {
            return this.f100577N.get();
        }

        @Override // ps.C16395g.a, ps.d0.b
        public yo.k c() {
            return this.f100695j.get();
        }

        C13552a c0() {
            return new C13552a(this.f100559J1.get(), this.f100564K1.get(), this.f100577N.get(), S(), uk.c.a());
        }

        @Override // ps.C16395g.a, ps.d0.b
        public Ck.b d() {
            return this.f100740s.get();
        }

        @Override // Ln.d, ps.C16395g.a
        public Cl.e e() {
            return this.f100756v0.get();
        }

        @Override // ps.C16395g.a, ps.d0.b
        public Tq.j f() {
            return this.f100715n.get();
        }

        @Override // Ln.d, Sr.b.a
        public C18264a g() {
            return this.f100745t.get();
        }

        @Override // ps.C16395g.a, ps.d0.b
        public hl.m h() {
            return this.f100736r0.get();
        }

        @Override // Qn.X.b
        public C18264a i() {
            return this.f100745t.get();
        }

        @Override // xu.i.a
        public InterfaceC17624d j() {
            return new h(this.f100684h);
        }

        @Override // ps.d0.b
        public AppVersion k() {
            return this.f100532E.get();
        }

        @Override // com.meijer.mobile.meijer.service.MeijerFirebaseMessagingService.a
        public C17838h l() {
            return this.f100518B0.get();
        }

        @Override // com.meijer.mobile.meijer.service.MeijerFirebaseMessagingService.a
        public C13666c p() {
            return this.f100721o0.get();
        }

        @Override // com.meijer.mobile.meijer.service.MeijerFirebaseMessagingService.a
        public Qn.I q() {
            return this.f100548H0.get();
        }

        Retrofit.Builder q0() {
            return C17822b.a(this.f100692i1.get());
        }

        @Override // ps.d0.b
        public yo.f r() {
            return this.f100710m.get();
        }

        com.launchdarkly.sdk.android.c0 r0() {
            return yl.m.a(this.f100532E.get());
        }

        @Override // ps.d0.b
        public Cl.e s() {
            return this.f100756v0.get();
        }

        LDContext s0() {
            return C18537e.a(this.f100695j.get(), this.f100715n.get(), this.f100532E.get());
        }

        @Override // com.meijer.mobile.meijer.service.MeijerFirebaseMessagingService.a
        public Un.b t() {
            return this.f100628X0.get();
        }

        hl.w t0() {
            return new hl.w(K(), this.f100715n.get(), this.f100649b0.get());
        }

        Yl.g u0() {
            return new Yl.g(this.f100682g3.get(), this.f100632Y.get(), this.f100715n.get(), uk.c.a());
        }

        @Override // com.meijer.mobile.meijer.service.MeijerFirebaseMessagingService.a
        public InterfaceC16622O v() {
            return this.f100583O0.get();
        }

        Yl.h v0() {
            return new Yl.h(u0(), this.f100695j.get());
        }

        @Override // xu.C18096b.InterfaceC2734b
        public InterfaceC17622b w() {
            return new c(this.f100684h);
        }

        Map<String, InterfaceC15323a<P2.b<? extends androidx.work.c>>> x0() {
            return Ce.M.q("com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker", this.f100578N0);
        }

        C13713a y0() {
            return new C13713a(this.f100758v2.get(), this.f100763w2.get(), this.f100768x2.get(), this.f100773y2.get(), z0(), this.f100715n.get(), this.f100632Y.get(), uk.c.a());
        }

        go.e z0() {
            return ho.f.a(this.f100674f1.get(), this.f100587P.get());
        }

        j(C5139c c5139c, C18303a c18303a, C13535g c13535g, C17130a c17130a, C15064c c15064c, Kn.t tVar, C17300a c17300a) {
            this.f100642a = c18303a;
            this.f100648b = c5139c;
            this.f100654c = tVar;
            this.f100660d = c13535g;
            this.f100666e = c15064c;
            this.f100672f = c17130a;
            this.f100678g = c17300a;
            d0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            g0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            h0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            i0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            j0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            k0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            l0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            m0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            n0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            e0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
            f0(c5139c, c18303a, c13535g, c17130a, c15064c, tVar, c17300a);
        }

        InterfaceC13412a F0() {
            return C6275b.a(N());
        }

        InterfaceC15920e<l.BrowseCollection> G0() {
            return C16134b.a(L());
        }

        InterfaceC15920e<l.Coupon> H0() {
            return C16136d.a(P());
        }

        InterfaceC15920e<l.Department> I0() {
            return C16138f.a(R());
        }

        InterfaceC15920e<l.Favorites> J0() {
            return C12441c.a(T());
        }

        InterfaceC15920e<l.Reward> K0() {
            return C13716d.a(S0());
        }

        InterfaceC15920e<l.Search> L0() {
            return C16140h.a(U0());
        }

        InterfaceC15920e<l.ShoppingList> M0() {
            return l1.a(V0());
        }

        Ks.a W() {
            return Ns.b.a(Os.b.a(), this.f100742s1.get());
        }

        P2.a a0() {
            return P2.d.a(x0());
        }

        Yl.f b0() {
            return Zl.f.a(J());
        }

        @Override // tu.C17138a.InterfaceC2542a
        public Set<Boolean> m() {
            return Ce.O.x();
        }

        @Override // com.meijer.mobile.meijer.service.MeijerFirebaseMessagingService.a
        public AbstractC16618K n() {
            return uk.c.a();
        }

        @Override // xm.InterfaceC18070c
        public void o(NotificationDismissedReceiver notificationDismissedReceiver) {
            p0(notificationDismissedReceiver);
        }

        @Override // com.meijer.mobile.meijer.C
        public void u(Meijer meijer) {
            o0(meijer);
        }

        Map<Class<? extends TrackingData.a>, InterfaceC14266f> w0() {
            return Ce.M.r(TrackingData.a.C2127a.class, Q0(), TrackingData.a.b.class, R0());
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$k */
    private static final class k implements InterfaceC17625e {

        /* renamed from: a, reason: collision with root package name */
        private final j f100783a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100784b;

        /* renamed from: c, reason: collision with root package name */
        private final b f100785c;

        /* renamed from: d, reason: collision with root package name */
        private View f100786d;

        private k(j jVar, d dVar, b bVar) {
            this.f100783a = jVar;
            this.f100784b = dVar;
            this.f100785c = bVar;
        }

        @Override // vu.InterfaceC17625e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public I build() {
            Bu.c.a(this.f100786d, View.class);
            return new l(this.f100783a, this.f100784b, this.f100785c, this.f100786d);
        }

        @Override // vu.InterfaceC17625e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k view(View view) {
            this.f100786d = (View) Bu.c.b(view);
            return this;
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$l */
    private static final class l extends I {

        /* renamed from: a, reason: collision with root package name */
        private final j f100787a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100788b;

        /* renamed from: c, reason: collision with root package name */
        private final b f100789c;

        /* renamed from: d, reason: collision with root package name */
        private final l f100790d = this;

        private UnauthFooterViewNewHomeScreen b(UnauthFooterViewNewHomeScreen unauthFooterViewNewHomeScreen) {
            com.meijer.mobile.widget.n.a(unauthFooterViewNewHomeScreen, this.f100787a.f100695j.get());
            return unauthFooterViewNewHomeScreen;
        }

        l(j jVar, d dVar, b bVar, View view) {
            this.f100787a = jVar;
            this.f100788b = dVar;
            this.f100789c = bVar;
        }

        @Override // com.meijer.mobile.widget.m
        public void a(UnauthFooterViewNewHomeScreen unauthFooterViewNewHomeScreen) {
            b(unauthFooterViewNewHomeScreen);
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$m */
    private static final class m implements InterfaceC17626f {

        /* renamed from: a, reason: collision with root package name */
        private final j f100791a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100792b;

        /* renamed from: c, reason: collision with root package name */
        private C5996L f100793c;

        /* renamed from: d, reason: collision with root package name */
        private ru.e f100794d;

        private m(j jVar, d dVar) {
            this.f100791a = jVar;
            this.f100792b = dVar;
        }

        @Override // vu.InterfaceC17626f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public J build() {
            Bu.c.a(this.f100793c, C5996L.class);
            Bu.c.a(this.f100794d, ru.e.class);
            return new n(this.f100791a, this.f100792b, this.f100793c, this.f100794d);
        }

        @Override // vu.InterfaceC17626f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public m a(C5996L c5996l) {
            this.f100793c = (C5996L) Bu.c.b(c5996l);
            return this;
        }

        @Override // vu.InterfaceC17626f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public m b(ru.e eVar) {
            this.f100794d = (ru.e) Bu.c.b(eVar);
            return this;
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$n */
    private static final class n extends J {

        /* renamed from: A, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.createaccount.m> f100795A;

        /* renamed from: A0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.rateandtip.ux.y> f100796A0;

        /* renamed from: B, reason: collision with root package name */
        Bu.d<C12516m> f100797B;

        /* renamed from: B0, reason: collision with root package name */
        Bu.d<Rm.p> f100798B0;

        /* renamed from: C, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.contactinformation.H> f100799C;

        /* renamed from: C0, reason: collision with root package name */
        Bu.d<Op.k> f100800C0;

        /* renamed from: D, reason: collision with root package name */
        Bu.d<C12258i> f100801D;

        /* renamed from: D0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.mperks.ux.rewardDetail.y> f100802D0;

        /* renamed from: E, reason: collision with root package name */
        Bu.d<Rm.g> f100803E;

        /* renamed from: E0, reason: collision with root package name */
        Bu.d<C16558I> f100804E0;

        /* renamed from: F, reason: collision with root package name */
        Bu.d<oo.a0> f100805F;

        /* renamed from: F0, reason: collision with root package name */
        Bu.d<Rm.w> f100806F0;

        /* renamed from: G, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.payment.ebt.r> f100807G;

        /* renamed from: G0, reason: collision with root package name */
        Bu.d<Dn.I> f100808G0;

        /* renamed from: H, reason: collision with root package name */
        Bu.d<C16800a> f100809H;

        /* renamed from: H0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.personalized.modals.G> f100810H0;

        /* renamed from: I, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.cart.entrynote.i> f100811I;

        /* renamed from: I0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.search.y1> f100812I0;

        /* renamed from: J, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.find.filter.o> f100813J;

        /* renamed from: J0, reason: collision with root package name */
        Bu.d<I1> f100814J0;

        /* renamed from: K, reason: collision with root package name */
        Bu.d<C12074a0> f100815K;

        /* renamed from: K0, reason: collision with root package name */
        Bu.d<Rm.A> f100816K0;

        /* renamed from: L, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.substitution.D> f100817L;

        /* renamed from: L0, reason: collision with root package name */
        Bu.d<C14751A> f100818L0;

        /* renamed from: M, reason: collision with root package name */
        Bu.d<C16807h> f100819M;

        /* renamed from: M0, reason: collision with root package name */
        Bu.d<jq.h> f100820M0;

        /* renamed from: N, reason: collision with root package name */
        Bu.d<C16811l> f100821N;

        /* renamed from: N0, reason: collision with root package name */
        Bu.d<kq.s> f100822N0;

        /* renamed from: O, reason: collision with root package name */
        Bu.d<C16816q> f100823O;

        /* renamed from: O0, reason: collision with root package name */
        Bu.d<lq.P> f100824O0;

        /* renamed from: P, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P> f100825P;

        /* renamed from: P0, reason: collision with root package name */
        Bu.d<mq.y> f100826P0;

        /* renamed from: Q, reason: collision with root package name */
        Bu.d<Hl.b> f100827Q;

        /* renamed from: Q0, reason: collision with root package name */
        Bu.d<nq.v> f100828Q0;

        /* renamed from: R, reason: collision with root package name */
        Bu.d<q1> f100829R;

        /* renamed from: R0, reason: collision with root package name */
        Bu.d<oq.p> f100830R0;

        /* renamed from: S, reason: collision with root package name */
        Bu.d<C12713c0> f100831S;

        /* renamed from: S0, reason: collision with root package name */
        Bu.d<Pq.h> f100832S0;

        /* renamed from: T, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.gas_station.f> f100833T;

        /* renamed from: T0, reason: collision with root package name */
        Bu.d<In.f> f100834T0;

        /* renamed from: U, reason: collision with root package name */
        Bu.d<sp.Y> f100835U;

        /* renamed from: U0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.enrollment.storeLocation.o> f100836U0;

        /* renamed from: V, reason: collision with root package name */
        Bu.d<C16992a> f100837V;

        /* renamed from: V0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.enrollment.G> f100838V0;

        /* renamed from: W, reason: collision with root package name */
        Bu.d<k0> f100839W;

        /* renamed from: W0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.subscription.ux.subscribedItems.m> f100840W0;

        /* renamed from: X, reason: collision with root package name */
        Bu.d<HomeViewModel> f100841X;

        /* renamed from: X0, reason: collision with root package name */
        Bu.d<Hh.w> f100842X0;

        /* renamed from: Y, reason: collision with root package name */
        Bu.d<C12273n> f100843Y;

        /* renamed from: Y0, reason: collision with root package name */
        Bu.d<C16367d> f100844Y0;

        /* renamed from: Z, reason: collision with root package name */
        Bu.d<xn.h> f100845Z;

        /* renamed from: Z0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.subscription.ux.subscription.D> f100846Z0;

        /* renamed from: a, reason: collision with root package name */
        private final j f100847a;

        /* renamed from: a0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.mperks.ux.V> f100848a0;

        /* renamed from: a1, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.substitutionpreference.v> f100849a1;

        /* renamed from: b, reason: collision with root package name */
        private final d f100850b;

        /* renamed from: b0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G> f100851b0;

        /* renamed from: b1, reason: collision with root package name */
        Bu.d<o0> f100852b1;

        /* renamed from: c, reason: collision with root package name */
        private final n f100853c = this;

        /* renamed from: c0, reason: collision with root package name */
        Bu.d<C16382L> f100854c0;

        /* renamed from: c1, reason: collision with root package name */
        Bu.d<v1> f100855c1;

        /* renamed from: d, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.basescreen.p> f100856d;

        /* renamed from: d0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.authentication.okta.ux.n> f100857d0;

        /* renamed from: d1, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.termsandconditions.f> f100858d1;

        /* renamed from: e, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.payments.d> f100859e;

        /* renamed from: e0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.confirmation.Y> f100860e0;

        /* renamed from: e1, reason: collision with root package name */
        Bu.d<com.meijer.mobile.mperks.ux.transactionHistory.D> f100861e1;

        /* renamed from: f, reason: collision with root package name */
        Bu.d<Dn.w> f100862f;

        /* renamed from: f0, reason: collision with root package name */
        Bu.d<rn.L> f100863f0;

        /* renamed from: f1, reason: collision with root package name */
        Bu.d<r1> f100864f1;

        /* renamed from: g, reason: collision with root package name */
        Bu.d<Dn.C> f100865g;

        /* renamed from: g0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.n> f100866g0;

        /* renamed from: g1, reason: collision with root package name */
        Bu.d<Ps.e> f100867g1;

        /* renamed from: h, reason: collision with root package name */
        Bu.d<C3668a> f100868h;

        /* renamed from: h0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.orderoptions.y> f100869h0;

        /* renamed from: h1, reason: collision with root package name */
        Bu.d<Ps.i> f100870h1;

        /* renamed from: i, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.addresses.i> f100871i;

        /* renamed from: i0, reason: collision with root package name */
        Bu.d<rn.U> f100872i0;

        /* renamed from: i1, reason: collision with root package name */
        Bu.d<Ps.o> f100873i1;

        /* renamed from: j, reason: collision with root package name */
        Bu.d<C18072a> f100874j;

        /* renamed from: j0, reason: collision with root package name */
        Bu.d<Hh.i> f100875j0;

        /* renamed from: j1, reason: collision with root package name */
        Bu.d<com.meijer.mobile.wic.ux.u> f100876j1;

        /* renamed from: k, reason: collision with root package name */
        Bu.d<Op.b> f100877k;

        /* renamed from: k0, reason: collision with root package name */
        Bu.d<h0> f100878k0;

        /* renamed from: k1, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.basescreen.H> f100879k1;

        /* renamed from: l, reason: collision with root package name */
        Bu.d<E0> f100880l;

        /* renamed from: l0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.outofstock.o> f100881l0;

        /* renamed from: l1, reason: collision with root package name */
        Bu.d<Hh.A> f100882l1;

        /* renamed from: m, reason: collision with root package name */
        Bu.d<S0> f100883m;

        /* renamed from: m0, reason: collision with root package name */
        Bu.d<Hh.o> f100884m0;

        /* renamed from: n, reason: collision with root package name */
        Bu.d<C12906c> f100885n;

        /* renamed from: n0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.payments.s> f100886n0;

        /* renamed from: o, reason: collision with root package name */
        Bu.d<C11894c> f100887o;

        /* renamed from: o0, reason: collision with root package name */
        Bu.d<ValidatePhoneNumberCallChain> f100888o0;

        /* renamed from: p, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.payment.Z> f100889p;

        /* renamed from: p0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.enrollment.n> f100890p0;

        /* renamed from: q, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.payment.k0> f100891q;

        /* renamed from: q0, reason: collision with root package name */
        Bu.d<C11932p> f100892q0;

        /* renamed from: r, reason: collision with root package name */
        Bu.d<C15689a> f100893r;

        /* renamed from: r0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.preferences.g> f100894r0;

        /* renamed from: s, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.checkout.review.z1> f100895s;

        /* renamed from: s0, reason: collision with root package name */
        Bu.d<C12233e0> f100896s0;

        /* renamed from: t, reason: collision with root package name */
        Bu.d<ko.z> f100897t;

        /* renamed from: t0, reason: collision with root package name */
        Bu.d<C12208c1> f100898t0;

        /* renamed from: u, reason: collision with root package name */
        Bu.d<Hh.e> f100899u;

        /* renamed from: u0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.reviews.ux.rateandreview.W> f100900u0;

        /* renamed from: v, reason: collision with root package name */
        Bu.d<Xk.u> f100901v;

        /* renamed from: v0, reason: collision with root package name */
        Bu.d<Op.g> f100902v0;

        /* renamed from: w, reason: collision with root package name */
        Bu.d<com.meijer.mobile.coupon.detail.L> f100903w;

        /* renamed from: w0, reason: collision with root package name */
        Bu.d<e1> f100904w0;

        /* renamed from: x, reason: collision with root package name */
        Bu.d<Km.l> f100905x;

        /* renamed from: x0, reason: collision with root package name */
        Bu.d<Hh.s> f100906x0;

        /* renamed from: y, reason: collision with root package name */
        Bu.d<com.meijer.mobile.coupon.list.M> f100907y;

        /* renamed from: y0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.meijer.activity.enrollment.profile.q> f100908y0;

        /* renamed from: z, reason: collision with root package name */
        Bu.d<com.meijer.mobile.coupon.list.S> f100909z;

        /* renamed from: z0, reason: collision with root package name */
        Bu.d<com.meijer.mobile.accounts.ux.profile.l> f100910z0;

        /* renamed from: com.meijer.mobile.meijer.a$n$a, reason: collision with other inner class name */
        private static final class C1407a<T> implements Bu.d<T> {

            /* renamed from: a, reason: collision with root package name */
            private final j f100911a;

            /* renamed from: b, reason: collision with root package name */
            private final d f100912b;

            /* renamed from: c, reason: collision with root package name */
            private final n f100913c;

            /* renamed from: d, reason: collision with root package name */
            private final int f100914d;

            private T a() {
                switch (this.f100914d) {
                    case 0:
                        return (T) new com.meijer.mobile.accounts.ux.basescreen.p(this.f100911a.f100629X1.get(), this.f100911a.f100700k.get(), this.f100911a.f100532E.get());
                    case 1:
                        return (T) new com.meijer.mobile.accounts.ux.payments.d(this.f100911a.f100736r0.get(), this.f100911a.f100700k.get(), this.f100911a.f100634Y1.get(), this.f100911a.f100632Y.get());
                    case 2:
                        return (T) new Dn.w(this.f100913c.e(), this.f100911a.f100736r0.get(), this.f100911a.f100735r.get());
                    case 3:
                        return (T) new Dn.C(this.f100911a.f100651b2.get());
                    case 4:
                        return (T) new C3668a(this.f100913c.g());
                    case 5:
                        return (T) new com.meijer.mobile.accounts.ux.addresses.i(this.f100913c.g(), this.f100913c.j(), this.f100913c.k(), this.f100911a.f100735r.get(), this.f100911a.f100577N.get());
                    case 6:
                        return (T) new C18072a(this.f100913c.T(), this.f100911a.f100735r.get());
                    case 7:
                        return (T) new Op.b();
                    case 8:
                        return (T) new E0(this.f100911a.f100736r0.get(), this.f100911a.f100534E1.get(), this.f100911a.f100577N.get(), this.f100911a.f100695j.get(), this.f100911a.f100728p2.get(), this.f100911a.f100753u2.get(), this.f100913c.U(), this.f100911a.f100735r.get(), this.f100911a.f100638Z0.get(), this.f100911a.f100778z2.get(), this.f100911a.f100632Y.get());
                    case 9:
                        return (T) new S0(this.f100911a.f100736r0.get(), this.f100911a.f100735r.get());
                    case 10:
                        return (T) new C12906c();
                    case 11:
                        return (T) new C11894c();
                    case 12:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.payment.Z(this.f100913c.L(), this.f100911a.D0(), this.f100911a.f100753u2.get(), this.f100911a.f100577N.get(), this.f100911a.f100515A2.get(), this.f100911a.f100735r.get(), this.f100911a.f100736r0.get(), this.f100911a.f100695j.get(), this.f100911a.f100705l.get(), this.f100911a.f100632Y.get());
                    case 13:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.payment.k0(this.f100911a.D0(), this.f100911a.f100753u2.get());
                    case 14:
                        return (T) new C15689a(this.f100913c.g(), this.f100911a.D0(), this.f100913c.g0());
                    case 15:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.review.z1(this.f100911a.f100753u2.get(), this.f100911a.f100736r0.get(), this.f100911a.f100728p2.get(), this.f100911a.f100695j.get(), this.f100911a.f100515A2.get(), this.f100911a.f100624W1.get(), this.f100911a.f100735r.get(), this.f100911a.f100529D1.get(), this.f100911a.f100577N.get(), this.f100911a.f100535E2.get(), this.f100911a.f100632Y.get());
                    case 16:
                        return (T) new ko.z(this.f100913c.U(), this.f100911a.f100735r.get());
                    case 17:
                        return (T) new Hh.e(this.f100911a.f100540F2.get());
                    case 18:
                        return (T) new com.meijer.mobile.coupon.detail.L(this.f100911a.f100695j.get(), this.f100911a.f100633Y0.get(), this.f100911a.f100668e1.get(), this.f100911a.f100736r0.get(), this.f100911a.f100534E1.get(), this.f100911a.f100735r.get(), this.f100911a.f100686h1.get(), this.f100913c.f100901v.get(), this.f100911a.f100710m.get(), this.f100911a.f100577N.get());
                    case 19:
                        return (T) new Xk.u(this.f100911a.f100700k.get(), this.f100911a.f100715n.get(), this.f100911a.f100686h1.get(), this.f100911a.f100668e1.get(), this.f100913c.o(), this.f100911a.f100736r0.get(), uk.c.a());
                    case 20:
                        return (T) new Km.l(this.f100911a.f100686h1.get(), uk.c.a());
                    case 21:
                        return (T) new com.meijer.mobile.coupon.list.M(this.f100911a.f100695j.get(), this.f100911a.f100736r0.get(), this.f100911a.f100686h1.get(), this.f100913c.I(), this.f100911a.f100715n.get(), this.f100911a.f100735r.get(), uk.c.a());
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                        return (T) new com.meijer.mobile.coupon.list.S(this.f100911a.f100686h1.get(), this.f100913c.f100901v.get(), this.f100911a.f100735r.get(), uk.c.a());
                    case 23:
                        return (T) new com.meijer.mobile.accounts.ux.createaccount.m(this.f100913c.j(), this.f100913c.v(), this.f100911a.f100695j.get(), this.f100911a.f100710m.get(), this.f100911a.f100702k1.get());
                    case 24:
                        return (T) new C12516m(this.f100913c.p(), this.f100911a.f100577N.get(), this.f100911a.f100711m0.get(), this.f100911a.f100695j.get(), this.f100911a.f100710m.get(), this.f100911a.f100538F0.get(), this.f100911a.f100628X0.get(), this.f100911a.f100518B0.get());
                    case 25:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.contactinformation.H(this.f100911a.f100753u2.get(), this.f100913c.h(), this.f100911a.f100695j.get(), this.f100911a.f100577N.get(), this.f100911a.f100515A2.get(), this.f100911a.f100735r.get());
                    case 26:
                        return (T) new C12258i(this.f100913c.P(), this.f100911a.f100695j.get(), this.f100911a.f100577N.get(), this.f100911a.f100736r0.get(), this.f100911a.f100715n.get(), uk.c.a());
                    case 27:
                        return (T) new Rm.g(this.f100911a.f100695j.get(), this.f100913c.R());
                    case 28:
                        return (T) new oo.a0(this.f100913c.U(), this.f100911a.f100735r.get(), this.f100911a.f100695j.get());
                    case 29:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.payment.ebt.r(this.f100911a.f100515A2.get(), this.f100911a.f100753u2.get(), this.f100911a.f100695j.get(), this.f100911a.f100736r0.get());
                    case 30:
                        return (T) new C16800a(this.f100911a.f100728p2.get(), this.f100913c.h());
                    case 31:
                        return (T) new com.meijer.mobile.meijer.activity.cart.entrynote.i(this.f100911a.f100736r0.get(), this.f100911a.f100753u2.get(), this.f100911a.f100735r.get());
                    case l3.f92486e /* 32 */:
                        return (T) new com.meijer.mobile.meijer.activity.find.filter.o(this.f100913c.O(), this.f100911a.f100735r.get(), this.f100911a.f100736r0.get(), this.f100911a.f100534E1.get(), this.f100911a.f100577N.get());
                    case 33:
                        return (T) new C12074a0(this.f100911a.f100710m.get(), this.f100911a.f100573M0.get(), this.f100913c.W(), this.f100911a.f100568L0.get(), this.f100911a.f100735r.get());
                    case 34:
                        return (T) new com.meijer.mobile.meijer.activity.substitution.D(this.f100913c.f0(), this.f100911a.f100736r0.get(), this.f100911a.f100534E1.get(), this.f100911a.f100735r.get(), this.f100911a.f100658c3.get(), this.f100911a.f100577N.get());
                    case 35:
                        return (T) new C16807h(this.f100911a.f100549H1.get(), this.f100911a.f100728p2.get(), this.f100911a.f100548H0.get(), this.f100911a.f100735r.get());
                    case 36:
                        return (T) new C16811l(this.f100911a.f100549H1.get(), this.f100911a.f100548H0.get(), this.f100911a.f100735r.get(), this.f100911a.f100756v0.get());
                    case 37:
                        return (T) new C16816q(this.f100911a.f100549H1.get(), this.f100911a.f100548H0.get(), this.f100911a.f100735r.get(), this.f100911a.f100756v0.get());
                    case 38:
                        return (T) new com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P(this.f100913c.e0(), this.f100911a.f100735r.get());
                    case 39:
                        return (T) new Hl.b(this.f100911a.f100655c0.get(), this.f100911a.f100748t2.get());
                    case 40:
                        return (T) new q1(this.f100911a.f100710m.get(), this.f100911a.f100748t2.get(), this.f100911a.f100753u2.get(), this.f100911a.f100736r0.get(), this.f100911a.f100577N.get(), this.f100911a.f100515A2.get(), this.f100911a.f100735r.get());
                    case 41:
                        return (T) new C12713c0(this.f100911a.f100658c3.get());
                    case 42:
                        return (T) new com.meijer.mobile.meijer.activity.gas_station.f(this.f100911a.f100568L0.get(), this.f100913c.W(), this.f100911a.f100710m.get());
                    case 43:
                        return (T) new k0(this.f100911a.f100695j.get(), this.f100911a.f100655c0.get(), this.f100911a.f100670e3.get(), this.f100913c.J(), this.f100911a.f100577N.get(), this.f100913c.x(), this.f100913c.f100901v.get(), this.f100911a.f100686h1.get(), this.f100911a.f100735r.get(), this.f100911a.f100745t.get(), this.f100911a.f100756v0.get(), this.f100913c.G(), this.f100913c.U(), this.f100911a.f100534E1.get(), this.f100911a.f100630X2.get(), this.f100911a.f100778z2.get(), this.f100913c.P(), this.f100911a.f100719n3.get(), this.f100913c.f100837V.get(), uk.c.a());
                    case 44:
                        return (T) new C16992a(this.f100913c.f100835U);
                    case 45:
                        return (T) new sp.Y(this.f100911a.f100695j.get(), this.f100911a.f100715n.get(), this.f100911a.f100668e1.get(), this.f100911a.f100609T1.get(), this.f100911a.f100736r0.get(), this.f100911a.f100686h1.get(), this.f100913c.P(), this.f100911a.f100778z2.get(), this.f100911a.f100544G1.get(), this.f100911a.f100658c3.get(), this.f100911a.f100729p3.get(), uk.c.a());
                    case 46:
                        return (T) new HomeViewModel(this.f100911a.f100695j.get(), this.f100911a.f100577N.get(), this.f100911a.f100745t.get(), this.f100913c.x(), this.f100911a.f100670e3.get(), this.f100911a.f100624W1.get(), this.f100913c.j(), this.f100911a.f100735r.get(), this.f100913c.J(), this.f100911a.f100728p2.get(), this.f100911a.f100686h1.get(), this.f100913c.f100901v.get(), this.f100913c.U(), this.f100911a.f100534E1.get(), this.f100913c.f100837V.get(), this.f100913c.G(), this.f100911a.f100630X2.get(), this.f100911a.f100778z2.get(), this.f100911a.f100756v0.get(), this.f100911a.f100719n3.get(), this.f100911a.f100715n.get(), this.f100913c.P(), uk.c.a());
                    case 47:
                        return (T) new C12273n();
                    case 48:
                        return (T) new xn.h(this.f100913c.T(), this.f100911a.f100735r.get());
                    case 49:
                        n nVar = this.f100913c;
                        return (T) nVar.D(com.meijer.mobile.mperks.ux.W.a(nVar.U(), this.f100911a.f100735r.get()));
                    case 50:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.G(this.f100911a.f100736r0.get(), this.f100913c.U(), this.f100911a.f100735r.get());
                    case 51:
                        return (T) new C16382L(this.f100911a.f100695j.get(), this.f100911a.f100715n.get(), this.f100911a.f100655c0.get(), this.f100911a.f100577N.get());
                    case 52:
                        return (T) new com.meijer.mobile.authentication.okta.ux.n(this.f100911a.f100627X.get(), this.f100911a.C0(), this.f100911a.f100734q3.get(), this.f100911a.f100752u1.get(), this.f100911a.f100695j.get(), this.f100911a.f100740s.get(), this.f100911a.f100735r.get());
                    case 53:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.confirmation.Y(this.f100911a.f100728p2.get(), this.f100911a.f100735r.get(), this.f100911a.f100528D0.get(), this.f100911a.f100577N.get(), this.f100911a.f100695j.get());
                    case 54:
                        return (T) new rn.L(this.f100911a.f100728p2.get(), this.f100911a.f100695j.get(), this.f100911a.f100736r0.get(), this.f100911a.f100577N.get(), this.f100913c.P(), this.f100911a.f100568L0.get(), this.f100911a.f100548H0.get(), this.f100911a.f100735r.get());
                    case 55:
                        return (T) new com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.n(this.f100911a.f100748t2.get(), this.f100911a.f100736r0.get(), uk.c.a());
                    case 56:
                        return (T) new com.meijer.mobile.meijer.activity.orderoptions.y(this.f100911a.f100710m.get(), this.f100911a.f100748t2.get(), this.f100911a.f100568L0.get(), this.f100911a.f100736r0.get(), this.f100913c.g(), this.f100913c.W(), this.f100911a.f100735r.get(), this.f100911a.f100577N.get());
                    case 57:
                        return (T) new rn.U(this.f100911a.f100728p2.get(), this.f100911a.f100534E1.get(), this.f100911a.f100736r0.get(), this.f100911a.f100695j.get(), this.f100911a.f100735r.get());
                    case 58:
                        return (T) new Hh.i(this.f100911a.f100728p2.get());
                    case 59:
                        return (T) new h0(this.f100911a.f100728p2.get(), this.f100911a.f100620V2.get(), this.f100911a.f100736r0.get(), this.f100911a.f100695j.get(), this.f100911a.f100548H0.get(), this.f100911a.f100735r.get(), this.f100913c.K(), uk.c.a());
                    case 60:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.outofstock.o(this.f100911a.f100736r0.get(), this.f100911a.f100534E1.get());
                    case 61:
                        return (T) new Hh.o(this.f100911a.D0());
                    case 62:
                        return (T) new com.meijer.mobile.accounts.ux.payments.s(this.f100911a.D0(), this.f100911a.f100752u1.get(), this.f100913c.g(), this.f100911a.f100735r.get(), this.f100911a.f100577N.get());
                    case 63:
                        return (T) this.f100913c.E(com.meijer.mobile.meijer.activity.enrollment.o.a(this.f100911a.f100739r3.get(), this.f100911a.f100695j.get(), this.f100911a.f100735r.get()));
                    case 64:
                        return (T) new ValidatePhoneNumberCallChain(this.f100911a.f100624W1.get(), this.f100913c.h(), uk.c.a());
                    case 65:
                        return (T) new C11932p(this.f100911a.f100753u2.get(), this.f100913c.h(), this.f100911a.f100695j.get(), this.f100911a.f100577N.get(), this.f100911a.f100515A2.get(), this.f100911a.f100735r.get());
                    case 66:
                        return (T) new com.meijer.mobile.accounts.ux.preferences.g(this.f100911a.f100540F2.get(), this.f100911a.f100752u1.get(), this.f100913c.j(), this.f100911a.f100577N.get(), this.f100911a.f100735r.get(), this.f100911a.f100700k.get());
                    case 67:
                        return (T) new C12233e0(this.f100913c.P(), this.f100911a.f100736r0.get(), this.f100911a.f100715n.get(), this.f100911a.f100695j.get(), this.f100911a.f100609T1.get(), this.f100911a.f100668e1.get(), this.f100911a.f100534E1.get(), this.f100911a.f100553I0.get(), this.f100911a.f100577N.get(), this.f100911a.f100735r.get(), this.f100911a.f100719n3.get(), this.f100913c.f100835U.get(), this.f100913c.f100837V.get(), this.f100913c.f0(), this.f100911a.f100544G1.get(), this.f100911a.f100778z2.get(), this.f100911a.f100658c3.get(), this.f100911a.f100686h1.get(), uk.c.a());
                    case 68:
                        return (T) new C12208c1(this.f100913c.P(), this.f100911a.f100736r0.get(), this.f100911a.f100715n.get(), this.f100911a.f100695j.get(), this.f100911a.f100609T1.get(), this.f100911a.f100668e1.get(), this.f100911a.f100534E1.get(), this.f100911a.f100553I0.get(), this.f100911a.f100577N.get(), this.f100911a.f100735r.get(), this.f100911a.f100719n3.get(), this.f100913c.f100835U.get(), this.f100913c.f100837V.get(), this.f100913c.f0(), this.f100911a.f100544G1.get(), this.f100911a.f100778z2.get(), this.f100911a.f100658c3.get(), this.f100911a.f100686h1.get(), uk.c.a());
                    case 69:
                        return (T) new com.meijer.mobile.reviews.ux.rateandreview.W(this.f100911a.f100658c3.get());
                    case 70:
                        return (T) new Op.g(this.f100913c.P());
                    case 71:
                        return (T) new e1(this.f100911a.f100715n.get(), this.f100911a.f100695j.get(), this.f100911a.f100577N.get(), this.f100913c.f100835U.get(), this.f100911a.f100736r0.get(), this.f100911a.f100668e1.get(), this.f100911a.f100534E1.get(), this.f100911a.f100748t2.get(), this.f100911a.f100686h1.get(), this.f100913c.O(), this.f100911a.f100735r.get(), this.f100911a.f100529D1.get(), this.f100911a.f100719n3.get(), this.f100911a.f100544G1.get(), this.f100911a.f100778z2.get(), uk.c.a());
                    case 72:
                        return (T) new Hh.s(this.f100911a.f100624W1.get(), this.f100913c.j(), this.f100911a.f100577N.get());
                    case 73:
                        return (T) new com.meijer.mobile.meijer.activity.enrollment.profile.q(this.f100911a.f100577N.get(), this.f100911a.f100695j.get(), this.f100911a.f100624W1.get(), this.f100911a.f100739r3.get(), this.f100911a.f100735r.get());
                    case 74:
                        return (T) new com.meijer.mobile.accounts.ux.profile.l(this.f100911a.f100624W1.get(), this.f100911a.f100752u1.get(), this.f100913c.j(), this.f100911a.f100577N.get());
                    case 75:
                        return (T) new com.meijer.mobile.rateandtip.ux.y(this.f100913c.Q());
                    case 76:
                        return (T) new Rm.p(this.f100911a.f100620V2.get(), this.f100911a.f100735r.get(), this.f100911a.f100754u3.get());
                    case 77:
                        return (T) new Op.k();
                    case 78:
                        return (T) new com.meijer.mobile.mperks.ux.rewardDetail.y(this.f100911a.f100695j.get(), this.f100911a.f100736r0.get(), this.f100911a.f100534E1.get(), this.f100911a.f100710m.get(), this.f100911a.S0(), this.f100911a.f100735r.get());
                    case 79:
                        return (T) new C16558I(this.f100913c.U(), this.f100911a.f100735r.get());
                    case BinsView.LABEL_WIDTH_DP /* 80 */:
                        return (T) new Rm.w(this.f100911a.f100695j.get());
                    case 81:
                        return (T) new Dn.I(this.f100911a.f100651b2.get());
                    case 82:
                        return (T) new com.meijer.mobile.meijer.search.y1(this.f100913c.P(), this.f100913c.f100810H0.get(), this.f100911a.f100748t2.get(), this.f100911a.f100695j.get(), this.f100911a.f100529D1.get(), this.f100911a.f100736r0.get(), this.f100913c.x(), this.f100911a.f100735r.get(), this.f100911a.f100756v0.get(), this.f100911a.f100577N.get(), this.f100911a.U(), this.f100911a.f100686h1.get(), this.f100913c.f100837V.get(), this.f100911a.f100544G1.get(), uk.c.a());
                    case 83:
                        return (T) new com.meijer.mobile.meijer.activity.personalized.modals.G(this.f100911a.f100715n.get(), this.f100911a.f100695j.get(), this.f100911a.f100577N.get(), this.f100913c.f100835U.get(), this.f100911a.f100736r0.get(), this.f100911a.f100668e1.get(), this.f100911a.f100534E1.get(), this.f100911a.f100748t2.get(), this.f100911a.f100686h1.get(), this.f100913c.O(), this.f100911a.f100735r.get(), this.f100911a.f100529D1.get(), this.f100911a.f100719n3.get(), this.f100911a.f100544G1.get(), this.f100911a.f100778z2.get(), uk.c.a());
                    case 84:
                        return (T) new I1(this.f100913c.P(), this.f100911a.f100748t2.get(), this.f100911a.f100695j.get(), this.f100911a.f100529D1.get(), this.f100911a.f100736r0.get(), this.f100913c.x(), this.f100911a.f100735r.get(), this.f100911a.f100577N.get(), this.f100911a.f100686h1.get(), this.f100913c.f100837V.get(), this.f100911a.f100534E1.get());
                    case 85:
                        return (T) new Rm.A(this.f100913c.e0(), this.f100911a.f100735r.get());
                    case 86:
                        return (T) new C14751A(this.f100911a.f100614U1.get(), this.f100911a.f100756v0.get(), this.f100911a.f100577N.get(), this.f100911a.f100581N3.get());
                    case 87:
                        return (T) new jq.h(this.f100911a.f100614U1.get(), this.f100911a.f100581N3.get(), this.f100911a.f100756v0.get(), this.f100911a.f100586O3.get());
                    case 88:
                        return (T) new kq.s(this.f100911a.f100532E.get(), this.f100911a.f100614U1.get(), this.f100913c.d0(), this.f100913c.M(), new C13415c(), this.f100913c.a0(), this.f100913c.X(), this.f100913c.c0(), this.f100913c.b0());
                    case 89:
                        return (T) new lq.P(this.f100911a.f100581N3.get(), this.f100911a.f100614U1.get());
                    case 90:
                        return (T) new mq.y(this.f100911a.f100614U1.get(), this.f100911a.f100581N3.get(), this.f100911a.f100647a4.get(), this.f100911a.f100756v0.get(), this.f100913c.Z());
                    case 91:
                        return (T) new nq.v(C17301b.a(this.f100911a.f100678g), this.f100911a.f100614U1.get(), this.f100911a.f100581N3.get(), this.f100911a.f100586O3.get());
                    case 92:
                        return (T) new oq.p(this.f100911a.f100614U1.get(), this.f100913c.Y(), this.f100913c.d0(), this.f100913c.X(), this.f100913c.c0(), this.f100913c.b0());
                    case 93:
                        return (T) new Pq.h(this.f100911a.f100668e1.get(), this.f100913c.P(), this.f100911a.f100577N.get(), this.f100911a.f100735r.get(), this.f100911a.f100686h1.get());
                    case 94:
                        return (T) new In.f(this.f100911a.f100735r.get(), this.f100911a.f100700k.get(), this.f100911a.f100710m.get(), this.f100911a.f100568L0.get(), this.f100911a.f100624W1.get(), this.f100911a.f100736r0.get());
                    case 95:
                        return (T) new com.meijer.mobile.meijer.activity.enrollment.storeLocation.o(this.f100913c.W(), this.f100911a.f100739r3.get(), this.f100911a.f100735r.get());
                    case 96:
                        return (T) new com.meijer.mobile.meijer.activity.enrollment.G(this.f100911a.f100739r3.get(), this.f100911a.f100735r.get());
                    case 97:
                        return (T) new com.meijer.mobile.subscription.ux.subscribedItems.m(this.f100913c.P(), this.f100913c.f100835U.get(), this.f100911a.f100729p3.get());
                    case 98:
                        return (T) new Hh.w(this.f100911a.f100729p3.get(), this.f100913c.w());
                    case 99:
                        return (T) new C16367d(this.f100911a.f100577N.get(), this.f100913c.f100835U.get(), this.f100911a.f100729p3.get());
                    default:
                        throw new AssertionError(this.f100914d);
                }
            }

            private T b() {
                switch (this.f100914d) {
                    case HttpResponseStatus.INFORMATIONAL_CONTINUE /* 100 */:
                        return (T) new com.meijer.mobile.subscription.ux.subscription.D(this.f100911a.f100729p3.get(), this.f100911a.f100653b4.get());
                    case 101:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.substitutionpreference.v(this.f100911a.f100753u2.get(), this.f100911a.f100624W1.get(), this.f100911a.f100695j.get(), this.f100911a.f100735r.get());
                    case 102:
                        return (T) new o0(this.f100911a.f100728p2.get(), this.f100911a.f100715n.get(), this.f100911a.f100548H0.get(), this.f100911a.f100735r.get(), this.f100911a.f100568L0.get());
                    case 103:
                        return (T) new v1(this.f100911a.f100689h4.get(), this.f100911a.f100715n.get(), this.f100911a.f100736r0.get(), this.f100911a.f100534E1.get(), this.f100911a.f100577N.get(), this.f100913c.f100837V.get(), this.f100911a.f100778z2.get(), this.f100911a.f100686h1.get(), this.f100911a.f100695j.get(), this.f100911a.f100735r.get());
                    case 104:
                        return (T) new com.meijer.mobile.meijer.activity.checkout.termsandconditions.f(this.f100911a.f100735r.get());
                    case 105:
                        return (T) new com.meijer.mobile.mperks.ux.transactionHistory.D(this.f100913c.U());
                    case 106:
                        return (T) new r1();
                    case 107:
                        return (T) new Ps.e(this.f100911a.f100668e1.get(), this.f100913c.t(), this.f100911a.f100686h1.get(), this.f100913c.f100901v.get(), this.f100911a.f100695j.get(), this.f100911a.f100715n.get(), uk.c.a());
                    case 108:
                        return (T) new Ps.i(this.f100911a.f100715n.get(), this.f100913c.u(), this.f100911a.f100735r.get(), this.f100911a.f100695j.get(), this.f100911a.f100577N.get());
                    case 109:
                        return (T) new Ps.o(this.f100911a.f100700k.get(), this.f100911a.f100735r.get(), this.f100911a.f100668e1.get(), this.f100911a.f100686h1.get(), this.f100913c.s(), this.f100911a.f100715n.get(), uk.c.a());
                    case 110:
                        return (T) new com.meijer.mobile.wic.ux.u();
                    case 111:
                        return (T) new com.meijer.mobile.accounts.ux.basescreen.H(this.f100911a.f100629X1.get(), this.f100911a.f100695j.get(), this.f100911a.f100715n.get(), this.f100911a.f100532E.get());
                    case 112:
                        return (T) new Hh.A(this.f100911a.f100568L0.get(), this.f100911a.f100715n.get());
                    default:
                        throw new AssertionError(this.f100914d);
                }
            }

            @Override // kv.InterfaceC15323a
            public T get() {
                int i10 = this.f100914d / 100;
                if (i10 == 0) {
                    return a();
                }
                if (i10 == 1) {
                    return b();
                }
                throw new AssertionError(this.f100914d);
            }

            C1407a(j jVar, d dVar, n nVar, int i10) {
                this.f100911a = jVar;
                this.f100912b = dVar;
                this.f100913c = nVar;
                this.f100914d = i10;
            }
        }

        private void A(C5996L c5996l, ru.e eVar) {
            this.f100851b0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 50);
            this.f100854c0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 51);
            this.f100857d0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 52);
            this.f100860e0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 53);
            this.f100863f0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 54);
            this.f100866g0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 55);
            this.f100869h0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 56);
            this.f100872i0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 57);
            this.f100875j0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 58);
            this.f100878k0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 59);
            this.f100881l0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 60);
            this.f100884m0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 61);
            this.f100886n0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 62);
            this.f100888o0 = Bu.f.a(new C1407a(this.f100847a, this.f100850b, this.f100853c, 64));
            this.f100890p0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 63);
            this.f100892q0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 65);
            this.f100894r0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 66);
            this.f100896s0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 67);
            this.f100898t0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 68);
            this.f100900u0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 69);
            this.f100902v0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 70);
            this.f100904w0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 71);
            this.f100906x0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 72);
            this.f100908y0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 73);
            this.f100910z0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 74);
        }

        private void B(C5996L c5996l, ru.e eVar) {
            this.f100796A0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 75);
            this.f100798B0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 76);
            this.f100800C0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 77);
            this.f100802D0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 78);
            this.f100804E0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 79);
            this.f100806F0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 80);
            this.f100808G0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 81);
            this.f100810H0 = Bu.a.b(new C1407a(this.f100847a, this.f100850b, this.f100853c, 83));
            this.f100812I0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 82);
            this.f100814J0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 84);
            this.f100816K0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 85);
            this.f100818L0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 86);
            this.f100820M0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 87);
            this.f100822N0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 88);
            this.f100824O0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 89);
            this.f100826P0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 90);
            this.f100828Q0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 91);
            this.f100830R0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 92);
            this.f100832S0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 93);
            this.f100834T0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 94);
            this.f100836U0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 95);
            this.f100838V0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 96);
            this.f100840W0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 97);
            this.f100842X0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 98);
            this.f100844Y0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 99);
        }

        private void C(C5996L c5996l, ru.e eVar) {
            this.f100846Z0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 100);
            this.f100849a1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 101);
            this.f100852b1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 102);
            this.f100855c1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 103);
            this.f100858d1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 104);
            this.f100861e1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 105);
            this.f100864f1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 106);
            this.f100867g1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 107);
            this.f100870h1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 108);
            this.f100873i1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 109);
            this.f100876j1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 110);
            this.f100879k1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 111);
            this.f100882l1 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 112);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.meijer.mobile.mperks.ux.V D(com.meijer.mobile.mperks.ux.V v10) {
            com.meijer.mobile.mperks.ux.a0.a(v10, this.f100847a.f100745t.get());
            return v10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.meijer.mobile.meijer.activity.enrollment.n E(com.meijer.mobile.meijer.activity.enrollment.n nVar) {
            com.meijer.mobile.meijer.activity.enrollment.s.a(nVar, this.f100888o0.get());
            return nVar;
        }

        private void y(C5996L c5996l, ru.e eVar) {
            this.f100856d = new C1407a(this.f100847a, this.f100850b, this.f100853c, 0);
            this.f100859e = new C1407a(this.f100847a, this.f100850b, this.f100853c, 1);
            this.f100862f = new C1407a(this.f100847a, this.f100850b, this.f100853c, 2);
            this.f100865g = new C1407a(this.f100847a, this.f100850b, this.f100853c, 3);
            this.f100868h = new C1407a(this.f100847a, this.f100850b, this.f100853c, 4);
            this.f100871i = new C1407a(this.f100847a, this.f100850b, this.f100853c, 5);
            this.f100874j = new C1407a(this.f100847a, this.f100850b, this.f100853c, 6);
            this.f100877k = new C1407a(this.f100847a, this.f100850b, this.f100853c, 7);
            this.f100880l = new C1407a(this.f100847a, this.f100850b, this.f100853c, 8);
            this.f100883m = new C1407a(this.f100847a, this.f100850b, this.f100853c, 9);
            this.f100885n = new C1407a(this.f100847a, this.f100850b, this.f100853c, 10);
            this.f100887o = new C1407a(this.f100847a, this.f100850b, this.f100853c, 11);
            this.f100889p = new C1407a(this.f100847a, this.f100850b, this.f100853c, 12);
            this.f100891q = new C1407a(this.f100847a, this.f100850b, this.f100853c, 13);
            this.f100893r = new C1407a(this.f100847a, this.f100850b, this.f100853c, 14);
            this.f100895s = new C1407a(this.f100847a, this.f100850b, this.f100853c, 15);
            this.f100897t = new C1407a(this.f100847a, this.f100850b, this.f100853c, 16);
            this.f100899u = new C1407a(this.f100847a, this.f100850b, this.f100853c, 17);
            this.f100901v = new C1407a(this.f100847a, this.f100850b, this.f100853c, 19);
            this.f100903w = new C1407a(this.f100847a, this.f100850b, this.f100853c, 18);
            this.f100905x = new C1407a(this.f100847a, this.f100850b, this.f100853c, 20);
            this.f100907y = new C1407a(this.f100847a, this.f100850b, this.f100853c, 21);
            this.f100909z = new C1407a(this.f100847a, this.f100850b, this.f100853c, 22);
            this.f100795A = new C1407a(this.f100847a, this.f100850b, this.f100853c, 23);
            this.f100797B = new C1407a(this.f100847a, this.f100850b, this.f100853c, 24);
        }

        private void z(C5996L c5996l, ru.e eVar) {
            this.f100799C = new C1407a(this.f100847a, this.f100850b, this.f100853c, 25);
            this.f100801D = new C1407a(this.f100847a, this.f100850b, this.f100853c, 26);
            this.f100803E = new C1407a(this.f100847a, this.f100850b, this.f100853c, 27);
            this.f100805F = new C1407a(this.f100847a, this.f100850b, this.f100853c, 28);
            this.f100807G = new C1407a(this.f100847a, this.f100850b, this.f100853c, 29);
            this.f100809H = new C1407a(this.f100847a, this.f100850b, this.f100853c, 30);
            this.f100811I = new C1407a(this.f100847a, this.f100850b, this.f100853c, 31);
            this.f100813J = new C1407a(this.f100847a, this.f100850b, this.f100853c, 32);
            this.f100815K = new C1407a(this.f100847a, this.f100850b, this.f100853c, 33);
            this.f100817L = new C1407a(this.f100847a, this.f100850b, this.f100853c, 34);
            this.f100819M = new C1407a(this.f100847a, this.f100850b, this.f100853c, 35);
            this.f100821N = new C1407a(this.f100847a, this.f100850b, this.f100853c, 36);
            this.f100823O = new C1407a(this.f100847a, this.f100850b, this.f100853c, 37);
            this.f100825P = new C1407a(this.f100847a, this.f100850b, this.f100853c, 38);
            this.f100827Q = new C1407a(this.f100847a, this.f100850b, this.f100853c, 39);
            this.f100829R = new C1407a(this.f100847a, this.f100850b, this.f100853c, 40);
            this.f100831S = new C1407a(this.f100847a, this.f100850b, this.f100853c, 41);
            this.f100833T = new C1407a(this.f100847a, this.f100850b, this.f100853c, 42);
            this.f100835U = new C1407a(this.f100847a, this.f100850b, this.f100853c, 45);
            this.f100837V = Bu.a.b(new C1407a(this.f100847a, this.f100850b, this.f100853c, 44));
            this.f100839W = new C1407a(this.f100847a, this.f100850b, this.f100853c, 43);
            this.f100841X = new C1407a(this.f100847a, this.f100850b, this.f100853c, 46);
            this.f100843Y = new C1407a(this.f100847a, this.f100850b, this.f100853c, 47);
            this.f100845Z = new C1407a(this.f100847a, this.f100850b, this.f100853c, 48);
            this.f100848a0 = new C1407a(this.f100847a, this.f100850b, this.f100853c, 49);
        }

        C6144a F() {
            return new C6144a(this.f100847a.f100641Z3.get());
        }

        C14743b G() {
            return new C14743b(this.f100847a.f100699j3.get(), m(), uk.c.a());
        }

        C13713a H() {
            return new C13713a(this.f100847a.f100758v2.get(), this.f100847a.f100763w2.get(), this.f100847a.f100768x2.get(), this.f100847a.f100773y2.get(), this.f100847a.z0(), this.f100847a.f100715n.get(), this.f100847a.f100632Y.get(), uk.c.a());
        }

        Xk.v I() {
            return new Xk.v(this.f100901v);
        }

        C14501c J() {
            return new C14501c(this.f100847a.f100728p2.get(), this.f100847a.f100745t.get(), P(), uk.c.a());
        }

        xo.d K() {
            return new xo.d(this.f100847a.f100634Y1.get());
        }

        th.f L() {
            return new th.f(this.f100847a.f100695j.get(), this.f100847a.f100753u2.get(), this.f100847a.D0(), this.f100847a.f100583O0.get());
        }

        C6278b M() {
            return new C6278b(C18305c.a(this.f100847a.f100642a));
        }

        C15919d N() {
            return new C15919d(this.f100847a.f100630X2.get());
        }

        B0 O() {
            return new B0(this.f100847a.J0(), this.f100847a.M0(), this.f100847a.L0(), this.f100847a.I0(), this.f100847a.H0(), this.f100847a.K0(), N(), S(), this.f100847a.G0());
        }

        Ro.c P() {
            return new Ro.c(this.f100847a.f100715n.get(), this.f100847a.f100695j.get(), this.f100847a.f100577N.get(), this.f100847a.F0(), this.f100847a.f100529D1.get(), n(), this.f100847a.f100726p0.get(), this.f100847a.f100544G1.get(), l(), uk.c.a());
        }

        up.d Q() {
            return new up.d(this.f100847a.f100632Y.get(), this.f100847a.f100744s3.get(), this.f100847a.f100749t3.get(), uk.c.a());
        }

        ReceiptsAndSavingsDataSource R() {
            return new ReceiptsAndSavingsDataSource(this.f100847a.f100620V2.get(), this.f100847a.f100752u1.get(), uk.c.a());
        }

        i1 S() {
            return new i1(this.f100847a.f100630X2.get(), P());
        }

        Zn.a T() {
            return new Zn.a(V());
        }

        C13719g U() {
            return new C13719g(H(), uk.c.a());
        }

        Zn.b V() {
            return new Zn.b(this.f100847a.f100554I1.get(), this.f100847a.f100632Y.get(), uk.c.a());
        }

        SearchStoresCall W() {
            return new SearchStoresCall(this.f100847a.f100568L0.get(), r());
        }

        C13553a X() {
            return new C13553a(this.f100847a.f100581N3.get());
        }

        C13413a Y() {
            return new C13413a(this.f100847a.f100631X3.get());
        }

        C13554b Z() {
            return new C13554b(this.f100847a.f100581N3.get());
        }

        @Override // wu.c.d
        public Map<Class<?>, InterfaceC15323a<androidx.view.c0>> a() {
            return Bu.b.a(Ce.M.b(108).f(com.meijer.mobile.accounts.ux.basescreen.r.f94300a, this.f100856d).f(com.meijer.mobile.accounts.ux.payments.g.f94444a, this.f100859e).f(Dn.y.f7038a, this.f100862f).f(Dn.E.f6790a, this.f100865g).f(C3670c.f12460a, this.f100868h).f(com.meijer.mobile.accounts.ux.addresses.k.f94192a, this.f100871i).f(xn.c.f169751a, this.f100874j).f(Op.e.f24117a, this.f100877k).f(H0.f101595a, this.f100880l).f(U0.f101679a, this.f100883m).f(C12914e.f118204a, this.f100885n).f(C11896e.f103879a, this.f100887o).f(com.meijer.mobile.meijer.activity.checkout.payment.b0.f103868a, this.f100889p).f(m0.f104044a, this.f100891q).f(C15691c.f150633a, this.f100893r).f(com.meijer.mobile.meijer.activity.checkout.review.B1.f104353a, this.f100895s).f(C15198B.f142176a, this.f100897t).f(Hh.g.f12482a, this.f100899u).f(com.meijer.mobile.coupon.detail.N.f96400a, this.f100903w).f(Km.n.f17414a, this.f100905x).f(com.meijer.mobile.coupon.list.O.f96706a, this.f100907y).f(com.meijer.mobile.coupon.list.U.f96828a, this.f100909z).f(com.meijer.mobile.accounts.ux.createaccount.o.f94366a, this.f100795A).f(C12518o.f112231a, this.f100797B).f(com.meijer.mobile.meijer.activity.checkout.contactinformation.J.f102417a, this.f100799C).f(C12267l.f108929a, this.f100801D).f(Rm.i.f32521a, this.f100803E).f(oo.c0.f154633a, this.f100805F).f(com.meijer.mobile.meijer.activity.checkout.payment.ebt.t.f103996a, this.f100807G).f(C16802c.f159482a, this.f100809H).f(com.meijer.mobile.meijer.activity.cart.entrynote.k.f101832a, this.f100811I).f(com.meijer.mobile.meijer.activity.find.filter.q.f106764a, this.f100813J).f(C12078c0.f106678a, this.f100815K).f(com.meijer.mobile.meijer.activity.substitution.F.f112747a, this.f100817L).f(C16809j.f159636a, this.f100819M).f(C16813n.f159671a, this.f100821N).f(C16817s.f159764a, this.f100823O).f(com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.T.f105699a, this.f100825P).f(Hl.d.f12743a, this.f100827Q).f(x1.f103207a, this.f100829R).f(C12717e0.f115743a, this.f100831S).f(com.meijer.mobile.meijer.activity.gas_station.h.f109149a, this.f100833T).f(com.meijer.mobile.home.ux.o0.f98473a, this.f100839W).f(HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.f100841X).f(C12279p.f108952a, this.f100843Y).f(xn.j.f169792a, this.f100845Z).f(com.meijer.mobile.mperks.ux.Y.f113884a, this.f100848a0).f(com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.I.f103259a, this.f100851b0).f(C16385O.f156428a, this.f100854c0).f(com.meijer.mobile.authentication.okta.ux.q.f95387a, this.f100857d0).f(com.meijer.mobile.meijer.activity.checkout.confirmation.a0.f102126a, this.f100860e0).f(rn.O.f159351a, this.f100863f0).f(com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots.p.f109946a, this.f100866g0).f(com.meijer.mobile.meijer.activity.orderoptions.A.f109818a, this.f100869h0).f(rn.W.f159444a, this.f100872i0).f(Hh.l.f12523a, this.f100875j0).f(rn.k0.f159638a, this.f100878k0).f(com.meijer.mobile.meijer.activity.checkout.outofstock.q.f103536a, this.f100881l0).f(Hh.q.f12558a, this.f100884m0).f(com.meijer.mobile.accounts.ux.payments.u.f94584a, this.f100886n0).f(com.meijer.mobile.meijer.activity.enrollment.q.f106191a, this.f100890p0).f(com.meijer.mobile.meijer.activity.checkout.pickupperson.r.f104327a, this.f100892q0).f(com.meijer.mobile.accounts.ux.preferences.i.f94690a, this.f100894r0).f(com.meijer.mobile.meijer.activity.find.viewmodel.E0.f107887a, this.f100896s0).f(C12248e1.f108822a, this.f100898t0).f(com.meijer.mobile.reviews.ux.rateandreview.Y.f116196a, this.f100900u0).f(Op.i.f24165a, this.f100902v0).f(g1.f111445a, this.f100904w0).f(Hh.u.f12588a, this.f100906x0).f(com.meijer.mobile.meijer.activity.enrollment.profile.s.f106167a, this.f100908y0).f(com.meijer.mobile.accounts.ux.profile.n.f94979a, this.f100910z0).f(com.meijer.mobile.rateandtip.ux.E.f115034a, this.f100796A0).f(Rm.u.f32551a, this.f100798B0).f(Op.m.f24181a, this.f100800C0).f(com.meijer.mobile.mperks.ux.rewardDetail.A.f114314a, this.f100802D0).f(C16560K.f157365a, this.f100804E0).f(Rm.y.f32563a, this.f100806F0).f(Dn.K.f6845a, this.f100808G0).f(com.meijer.mobile.meijer.search.A1.f112910a, this.f100812I0).f(com.meijer.mobile.meijer.activity.find.viewmodel.K1.f108075a, this.f100814J0).f(Rm.C.f32461a, this.f100816K0).f(iq.C.f138343a, this.f100818L0).f(jq.m.f140991a, this.f100820M0).f(kq.z.f147810a, this.f100822N0).f(lq.V.f149195a, this.f100824O0).f(C15671C.f150349a, this.f100826P0).f(nq.E.f152269a, this.f100828Q0).f(oq.r.f154899a, this.f100830R0).f(Pq.n.f28631a, this.f100832S0).f(In.h.f14313a, this.f100834T0).f(com.meijer.mobile.meijer.activity.enrollment.storeLocation.q.f106307a, this.f100836U0).f(com.meijer.mobile.meijer.activity.enrollment.I.f105902a, this.f100838V0).f(com.meijer.mobile.subscription.ux.subscribedItems.o.f118856a, this.f100840W0).f(Hh.y.f12600a, this.f100842X0).f(C16369f.f156316a, this.f100844Y0).f(com.meijer.mobile.subscription.ux.subscription.F.f118938a, this.f100846Z0).f(com.meijer.mobile.meijer.activity.checkout.substitutionpreference.x.f105303a, this.f100849a1).f(q0.f159762a, this.f100852b1).f(com.meijer.mobile.shoppinglist.teacherlists.ux.L1.f117212a, this.f100855c1).f(com.meijer.mobile.meijer.activity.checkout.termsandconditions.h.f105339a, this.f100858d1).f(com.meijer.mobile.mperks.ux.transactionHistory.F.f114669a, this.f100861e1).f(t1.f101963a, this.f100864f1).f(Ps.g.f29178a, this.f100867g1).f(Ps.k.f29218a, this.f100870h1).f(Ps.r.f29322a, this.f100873i1).f(com.meijer.mobile.wic.ux.w.f119461a, this.f100876j1).f(com.meijer.mobile.accounts.ux.basescreen.J.f94274a, this.f100879k1).f(Hh.C.f12430a, this.f100882l1).a());
        }

        C13414b a0() {
            return new C13414b(this.f100847a.f100631X3.get(), F());
        }

        C13555c b0() {
            return new C13555c(this.f100847a.f100581N3.get());
        }

        C13556d c0() {
            return new C13556d(this.f100847a.f100581N3.get(), this.f100847a.f100695j.get(), this.f100847a.f100591P3.get(), this.f100847a.f100532E.get());
        }

        Zp.a d0() {
            return new Zp.a(this.f100847a.f100591P3.get(), this.f100847a.f100611T3.get());
        }

        Dn.q e() {
            return new Dn.q(this.f100847a.f100735r.get(), this.f100847a.f100695j.get(), k(), g());
        }

        Ep.i e0() {
            return new Ep.i(this.f100847a.f100632Y.get(), this.f100847a.f100664d3.get(), uk.c.a());
        }

        C18463a f() {
            return new C18463a(this.f100847a.f100619V1.get(), this.f100847a.f100632Y.get(), uk.c.a());
        }

        pp.g f0() {
            return new pp.g(this.f100847a.f100695j.get(), this.f100847a.f100715n.get(), this.f100847a.N0(), this.f100847a.f100726p0.get());
        }

        Bh.a g() {
            return new Bh.a(f(), this.f100847a.f100700k.get());
        }

        mr.t g0() {
            return new mr.t(C18305c.a(this.f100847a.f100642a));
        }

        C16527b h() {
            return new C16527b(this.f100847a.f100575M2.get(), this.f100847a.f100560J2.get());
        }

        C18465c i() {
            return new C18465c(this.f100847a.f100657c2.get(), this.f100847a.f100632Y.get(), this.f100847a.f100700k.get());
        }

        Bh.c j() {
            return new Bh.c(i(), this.f100847a.f100568L0.get(), this.f100847a.f100695j.get(), this.f100847a.f100710m.get());
        }

        Ti.d k() {
            return new Ti.d(this.f100847a.f100645a2.get(), uk.c.a());
        }

        So.b l() {
            return new So.b(this.f100847a.f100594Q1.get(), this.f100847a.f100524C1.get(), this.f100847a.f100695j.get(), uk.c.a());
        }

        Yl.e m() {
            return new Yl.e(this.f100847a.f100704k3.get(), this.f100847a.f100686h1.get(), uk.c.a());
        }

        Sk.a n() {
            return new Sk.a(this.f100847a.f100579N1.get(), uk.c.a());
        }

        C15917b o() {
            return new C15917b(this.f100847a.f100555I2.get());
        }

        C12505b p() {
            return new C12505b(this.f100847a.f100577N.get());
        }

        Ks.b q() {
            return new Ks.b(this.f100847a.W(), Os.c.a(), Os.d.a(), uk.c.a());
        }

        GeocoderCall r() {
            return new GeocoderCall(this.f100847a.f100635Y2.get(), this.f100847a.f100573M0.get());
        }

        Ls.a s() {
            return new Ls.a(q(), uk.c.a());
        }

        Ls.b t() {
            return new Ls.b(q(), uk.c.a());
        }

        Ls.c u() {
            return new Ls.c(this.f100847a.f100715n.get(), q());
        }

        C5605a v() {
            return new C5605a(this.f100847a.f100568L0.get());
        }

        C16600a w() {
            return new C16600a(this.f100847a.f100700k.get());
        }

        C14742a x() {
            return new C14742a(this.f100847a.b0());
        }

        n(j jVar, d dVar, C5996L c5996l, ru.e eVar) {
            this.f100847a = jVar;
            this.f100850b = dVar;
            y(c5996l, eVar);
            z(c5996l, eVar);
            A(c5996l, eVar);
            B(c5996l, eVar);
            C(c5996l, eVar);
        }

        @Override // wu.c.d
        public Map<Class<?>, Object> b() {
            return Ce.M.n();
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$o */
    private static final class o implements vu.g {

        /* renamed from: a, reason: collision with root package name */
        private final j f100915a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100916b;

        /* renamed from: c, reason: collision with root package name */
        private final b f100917c;

        /* renamed from: d, reason: collision with root package name */
        private final g f100918d;

        /* renamed from: e, reason: collision with root package name */
        private View f100919e;

        private o(j jVar, d dVar, b bVar, g gVar) {
            this.f100915a = jVar;
            this.f100916b = dVar;
            this.f100917c = bVar;
            this.f100918d = gVar;
        }

        @Override // vu.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public K build() {
            Bu.c.a(this.f100919e, View.class);
            return new p(this.f100915a, this.f100916b, this.f100917c, this.f100918d, this.f100919e);
        }

        @Override // vu.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o view(View view) {
            this.f100919e = (View) Bu.c.b(view);
            return this;
        }
    }

    /* renamed from: com.meijer.mobile.meijer.a$p */
    private static final class p extends K {

        /* renamed from: a, reason: collision with root package name */
        private final j f100920a;

        /* renamed from: b, reason: collision with root package name */
        private final d f100921b;

        /* renamed from: c, reason: collision with root package name */
        private final b f100922c;

        /* renamed from: d, reason: collision with root package name */
        private final g f100923d;

        /* renamed from: e, reason: collision with root package name */
        private final p f100924e = this;

        p(j jVar, d dVar, b bVar, g gVar, View view) {
            this.f100920a = jVar;
            this.f100921b = dVar;
            this.f100922c = bVar;
            this.f100923d = gVar;
        }
    }

    public static e a() {
        return new e();
    }
}

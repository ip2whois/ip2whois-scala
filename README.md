IP2WHOIS Scala SDK
==================

 **_Please note that this GitHub project is no longer being maintained and has been migrated to a new repository. We recommend that you use the [IP2Location.io Scala SDK](https://github.com/ip2location/ip2location-io-scala) going forward._**
 
This Scala library enables user to easily implement the checking of WHOIS information for a particular domain into their solution using the API from https://www.ip2whois.com. It is a WHOIS lookup api that helps users to obtain domain information, WHOIS record, by using a domain name. The WHOIS API returns a comprehensive WHOIS data such as creation date, updated date, expiration date, domain age, the contact information of the registrant, mailing address, phone number, email address, nameservers the domain is using and much more. IP2WHOIS supports the query for 1113 TLDs and 634 ccTLDs.

This library requires an API key to function. You may sign up for a free API key at https://www.ip2whois.com/register.

Pre-requisite
=============
IntelliJ IDEA


Usage Example
============

### Lookup Domain Information
```scala
val strApiKey = "YOUR_API_KEY"

// Lookup domain information
val strDomain = "locaproxy.com"
val whois = new IP2Whois(strApiKey)
val myResult = whois.lookUp(strDomain)
System.out.println(myResult)
```

### Convert Normal Text to Punycode
```scala
val whois = new IP2Whois("")

// Convert normal text to punycode
System.out.println(whois.toPunycode("täst.de"))
```

### Convert Punycode to Normal Text
```scala
val whois = new IP2Whois("")

// Convert punycode to normal text
System.out.println(whois.toNormalText("xn--tst-qla.de"))
```

### Get Domain Name
```scala
val whois = new IP2Whois("")

// Get domain name from URL
System.out.println(whois.toDomainName("https://www.example.com/exe"))
```

### Get Domain Extension
```scala
val whois = new IP2Whois("")

// Get domain extension (gTLD or ccTLD) from URL or domain name
System.out.println(whois.toDomainExtension("example.com"))
```


Response Parameter
============

### Domain WHOIS Lookup function
| Parameter | Type | Description |
|---|---|---|
|domain|string|Domain name.|
|domain_id|string|Domain name ID.|
|status|string|Domain name status.|
|create_date|string|Domain name creation date.|
|update_date|string|Domain name updated date.|
|expire_date|string|Domain name expiration date.|
|domain_age|integer|Domain name age in day(s).|
|whois_server|string|WHOIS server name.|
|registrar.iana_id|string|Registrar IANA ID.|
|registrar.name|string|Registrar name.|
|registrar.url|string|Registrar URL.|
|registrant.name|string|Registrant name.|
|registrant.organization|string|Registrant organization.|
|registrant.street_address|string|Registrant street address.|
|registrant.city|string|Registrant city.|
|registrant.region|string|Registrant region.|
|registrant.zip_code|string|Registrant ZIP Code.|
|registrant.country|string|Registrant country.|
|registrant.phone|string|Registrant phone number.|
|registrant.fax|string|Registrant fax number.|
|registrant.email|string|Registrant email address.|
|admin.name|string|Admin name.|
|admin.organization|string|Admin organization.|
|admin.street_address|string|Admin street address.|
|admin.city|string|Admin city.|
|admin.region|string|Admin region.|
|admin.zip_code|string|Admin ZIP Code.|
|admin.country|string|Admin country.|
|admin.phone|string|Admin phone number.|
|admin.fax|string|Admin fax number.|
|admin.email|string|Admin email address.|
|tech.name|string|Tech name.|
|tech.organization|string|Tech organization.|
|tech.street_address|string|Tech street address.|
|tech.city|string|Tech city.|
|tech.region|string|Tech region.|
|tech.zip_code|string|Tech ZIP Code.|
|tech.country|string|Tech country.|
|tech.phone|string|Tech phone number.|
|tech.fax|string|Tech fax number.|
|tech.email|string|Tech email address.|
|billing.name|string|Billing name.|
|billing.organization|string|Billing organization.|
|billing.street_address|string|Billing street address.|
|billing.city|string|Billing city.|
|billing.region|string|Billing region.|
|billing.zip_code|string|Billing ZIP Code.|
|billing.country|string|Billing country.|
|billing.phone|string|Billing phone number.|
|billing.fax|string|Billing fax number.|
|billing.email|string|Billing email address.|
|nameservers|array|Name servers|

```json
{
    "domain": "locaproxy.com",
    "domain_id": "1710914405_DOMAIN_COM-VRSN",
    "status": "clientTransferProhibited https://icann.org/epp#clientTransferProhibited",
    "create_date": "2012-04-03T02:34:32Z",
    "update_date": "2021-12-03T02:54:57Z",
    "expire_date": "2024-04-03T02:34:32Z",
    "domain_age": 3863,
    "whois_server": "whois.godaddy.com",
    "registrar": {
        "iana_id": "146",
        "name": "GoDaddy.com, LLC",
        "url": "https://www.godaddy.com"
    },
    "registrant": {
        "name": "Registration Private",
        "organization": "Domains By Proxy, LLC",
        "street_address": "DomainsByProxy.com",
        "city": "Tempe",
        "region": "Arizona",
        "zip_code": "85284",
        "country": "US",
        "phone": "+1.4806242599",
        "fax": "+1.4806242598",
        "email": "Select Contact Domain Holder link at https://www.godaddy.com/whois/results.aspx?domain=LOCAPROXY.COM"
    },
    "admin": {
        "name": "Registration Private",
        "organization": "Domains By Proxy, LLC",
        "street_address": "DomainsByProxy.com",
        "city": "Tempe",
        "region": "Arizona",
        "zip_code": "85284",
        "country": "US",
        "phone": "+1.4806242599",
        "fax": "+1.4806242598",
        "email": "Select Contact Domain Holder link at https://www.godaddy.com/whois/results.aspx?domain=LOCAPROXY.COM"
    },
    "tech": {
        "name": "Registration Private",
        "organization": "Domains By Proxy, LLC",
        "street_address": "DomainsByProxy.com",
        "city": "Tempe",
        "region": "Arizona",
        "zip_code": "85284",
        "country": "US",
        "phone": "+1.4806242599",
        "fax": "+1.4806242598",
        "email": "Select Contact Domain Holder link at https://www.godaddy.com/whois/results.aspx?domain=LOCAPROXY.COM"
    },
    "billing": {
        "name": "",
        "organization": "",
        "street_address": "",
        "city": "",
        "region": "",
        "zip_code": "",
        "country": "",
        "phone": "",
        "fax": "",
        "email": ""
    },
    "nameservers": ["vera.ns.cloudflare.com", "walt.ns.cloudflare.com"]
}
```


LICENCE
=====================
See the LICENSE file.

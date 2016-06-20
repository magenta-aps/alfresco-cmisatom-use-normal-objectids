This Alfresco repository AMP module forces the /alfresco/cmisatom endpoint to use normal object IDs without the storeref.
E.g. 788d9658-d824-4c62-9ab3-e2c384246b97 instead of workspace://SpacesStore/788d9658-d824-4c62-9ab3-e2c384246b97

Although the cmisatom endpoint is deprecated in recent Alfresco versions, it is sometimes necessary to
use it in Alfresco 5.0.c instead of the new CMIS endpoint because it is the only CMIS endpoint
in that version of Alfresco that can handle other authentication mechanisms than alfrescoNtlm (e.g. Kerberos/External, etc...).

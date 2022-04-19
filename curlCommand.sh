#get-by-h_-d_-n
curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/get-by-h_-d_-n \
  -u test@liferay.com:test \
  -d h7g5FolderId=test \
  -d description='test' \
  -d name='test'

#get-by-h7-g5-folder-id
curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/get-by-h7-g5-folder-id \
  -u test@liferay.com:test \
  -d h7g5folderId=444455 \
  -d start=2 \
  -d end=20

#get-by-key
curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/get-by-key \
  -u test@liferay.com:test \
  -d folderKey='233434'

#get-by-name
curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/get-by-name \
  -u test@liferay.com:test \
  -d folderName='1212' \
  -d start=11 \
  -d end=112